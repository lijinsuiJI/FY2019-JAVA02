package com.neuedu.service;

import com.neuedu.exception.LoginException;

public interface AdminBiz {
	
	//用户登录
	void login(String adminName,String password,String yzm, String yzm1)throws LoginException;
		
	//判断用户名是否存在
	//true 用户名存在   false  用户名不存在
	boolean isAdminNameExists(String adminName) throws LoginException;
	
	public String change(String adminName);
	
}
