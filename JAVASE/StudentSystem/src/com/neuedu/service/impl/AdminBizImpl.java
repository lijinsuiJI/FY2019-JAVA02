package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.Admin;
import com.neuedu.service.AdminBiz;

public class AdminBizImpl implements AdminBiz {
	
	//创建Admin数组
	private Admin[] admins = new Admin[3];
	
	public AdminBizImpl() {
		
		Admin admin1 = new Admin("admin","admin");
		this.admins[0] = admin1;
		
	}

	//管理员登录逻辑
	@Override
	public void login(String adminName, String password) throws LoginException {
		// TODO Auto-generated method stub
		//默认管理员不存在
		boolean adminNameExists = false;
		for(int i=0;i<admins.length;i++) {
			Admin admin = admins[i];
			if(admin == null) {
				continue;
			}
			
			String _adminName = admin.getAdminName();
			String _password = admin.getPassword();
			
			if(adminName.equals(_adminName)) {
				adminNameExists = true;
				if(password.equals(_password)) {
					System.out.println("登录成功");
					System.out.println("欢迎您  "+ adminName);
				}else {
					throw new LoginException("管理员与密码不匹配"); 
				}
			}
		}
		//管理员不存在
		if(!adminNameExists) {
			throw new LoginException("管理员不存在");
		}
	}

	@Override
	public boolean isAdminNameExists(String adminName) throws LoginException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<admins.length;i++) {
			Admin admin = admins[i];
			
			if(admin == null) {
				continue;
			}
			
			//判断管理员是否存在
			String _adminName = admin.getAdminName();
			//用户名存在
			if(adminName.equals(_adminName)) {
				return true;
			}
		}
		throw new LoginException("用户名不存在");
	}

}
