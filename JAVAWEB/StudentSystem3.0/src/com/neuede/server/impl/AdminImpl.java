package com.neuede.server.impl;


import java.util.LinkedList;
import java.util.List;

import com.neuede.server.IadminServer;
import com.neuede.pojo.Admin;

public class AdminImpl implements IadminServer {

	//创建管理员集合
	public List<Admin> AdminList = new LinkedList<Admin>();
	
	public AdminImpl() {
		
		AdminList.add(new Admin("admin","admin"));
		
	}
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<AdminList.size(); i++) {
			
			if(AdminList == null) {
				continue;
			}
			
			String _adminName = AdminList.get(i).getAdminName();
			String _password = AdminList.get(i).getPassword();
			
			if(_adminName.equals(username)) {
				if(_password.equals(password)) {
					System.out.println("登录成功");
					return true;
				}
			}
			
		}
		return false;
		
	}

}
