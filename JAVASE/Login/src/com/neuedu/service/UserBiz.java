package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {

	//用户注册
	void register(String username,String password,String password2,String name,String email)
	throws RegisterException;
	//用户登录
	void login(String username,String password) 
	throws LoginException;

	//判断用户名是否存在
	//true 用户名存在   false  用户名不存在
	boolean isusernameexists(String username) throws LoginException;
	
}
