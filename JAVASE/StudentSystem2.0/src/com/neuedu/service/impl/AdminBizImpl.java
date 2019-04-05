package com.neuedu.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import com.neuedu.exception.LoginException;
import com.neuedu.pojo.Admin;
import com.neuedu.service.AdminBiz;

public class AdminBizImpl implements AdminBiz {

	//创建管理员集合
	public List<Admin> AdminList = new LinkedList<Admin>();
	
	//单例模式
	private static AdminBizImpl adminBizImpl;
	
	//对外提供获取实例方式    线程安全
	public static synchronized AdminBizImpl getIntance() {
		
		if(adminBizImpl == null) {
			adminBizImpl = new AdminBizImpl();
		}
		return adminBizImpl;
	}
	
	//初始化数据
	private AdminBizImpl() {
		
		AdminList.add(new Admin("admin","admin"));
		
	}
	
	//管理员登录逻辑
	public void login(String adminName, String password, String yzm, String yzm1) throws LoginException {
		
		//默认管理员不存在
		boolean adminNameExists = false;
		for(int i=0;i<AdminList.size();i++) {
			if(AdminList == null) {
				continue;
			}
			
			String _adminName = AdminList.get(i).getAdminName();
			String _password = AdminList.get(i).getPassword();
			
			if(adminName.equals(_adminName)) {
				adminNameExists = true;
				if(password.equals(_password) && yzm.equals(yzm1)) {
					System.out.println("登录成功");
					System.out.println("欢迎您  "+ adminName);
				}else {
					throw new LoginException("管理员与密码不匹配,请重新登录"); 
				}
			}
			
		}
		//管理员不存在
		if(!adminNameExists) {
			throw new LoginException("管理员不存在，请重新输入");
		}
		
	}
	
	//判断管理员用户是否存在
	public boolean isAdminNameExists(String adminName) throws LoginException {
		// TODO Auto-generated method stub
		
		for(int i=0;i<AdminList.size();i++) {
			if(AdminList == null) {
				continue;
			}
			//判断管理员是否存在
			String _adminName = AdminList.get(i).getAdminName();
			//用户名存在
			if(adminName.equals(_adminName)) {
				return true;
			}
		}
		throw new LoginException("管理员不存在，请重新输入");
	}

	//转换管理员用户名中的大小写
	public String change(String adminName) {
			
		StringBuffer st = new StringBuffer();
			
		for(int i = 0; i<adminName.length(); i++) {
			char temp=adminName.charAt(i);
			if(temp >= 'A' && temp <= 'Z') {
				temp = (char)(temp+32);
			}else if(temp >= 'a' && temp <= 'z') {
				temp= (char) temp;
			}else if(temp >= '1' && temp <= '9') {
				temp= temp;
			}
			st.append(temp);
		}
		return st.toString();
	}
	
	//验证码登录
	public String generateCodeAndPic() {
		
		//验证码字符个数
		int codeCount = 4;
		
		char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		//创建一个随机数生成器类
		Random random = new Random();
		//用于保存随机产生的验证码，以便用户登录后验证
		StringBuffer randomCode = new StringBuffer();
		//随机产生codeCount数字的验证码
		for(int i=0;i<codeCount; i++) {
			//得到随机产生的验证码数字
			String strRand = String.valueOf(codeSequence[random.nextInt(36)]);
			//将产生的四个随机数组合在一起
			randomCode.append(strRand);
		}
		
		return randomCode.toString();
		
	}
	
}
