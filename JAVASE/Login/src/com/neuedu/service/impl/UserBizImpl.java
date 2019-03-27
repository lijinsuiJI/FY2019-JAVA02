package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz {

	//创建user类型数组
	private User[] users = new User[10];
	
	public UserBizImpl() {
		
		User user1 = new User("admin","admin","administrator","admin@123.com");
		User user2 = new User("tom","cat","tomcat","tomcat@123.com");
		
		this.users[0] = user1;
		this.users[1] = user2;
	}
	
	@Override
	public void register(String username, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void login(String username, String password) 
			throws LoginException {
		// TODO Auto-generated method stub
		
		//默认用户名不存在
		boolean usernameexists = false;
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				continue;
			}
			
			String _username = user.getUsername();
			String _password = user.getPassword();
			//用户名存在
			if(username.equals(_username)) {
				usernameexists = true;
				//用户名与密码是否匹配
				if(password.equals(_password)) {
					System.out.println("登录成功");
				}else {
					throw new LoginException("用户名与密码不匹配");
				}
			}
		}
		//用户名不存在
		if(!usernameexists) {
			throw new LoginException("用户名不存在");
		}
		
		
	}

	@Override
	public boolean isusernameexists(String username) throws LoginException {
		// TODO Auto-generated method stub
		
		//遍历users数组
		for(int i=0;i<users.length;i++) {
			
			User user = users[i];
			
			if(user == null) {
				continue;
			}
			
			//判断用户名是否存在
			String _username = user.getUsername();
			//用户名存在
			if(username.equals(_username)) {
				return true;
			}
			
		}
		throw new LoginException("用户名不存在");
	}

}
