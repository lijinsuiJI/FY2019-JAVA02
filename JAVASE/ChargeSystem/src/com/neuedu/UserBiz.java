package com.neuedu;

interface UserBiz1 {

	//用户注册
	void register(String username, String password, String password2,String name, String email,User[] users) throws RegisterException; 
	//用户登录
	void login(String username, String password,User[] users) throws LoginException;
}

public class UserBiz implements UserBiz1{

	//初始化数据
	public static void initData(User[] users) {
		User a = new User("admin","admin","Administrator","admin@123.com");
		User b = new User("tom","cat","tomcat","tomcat@cat.com");
		users[0] = a;
		users[1] = b;
	}
	
	//register方法抛出异常
	public void register(String username, String password, String password2, String name, String email,User[] users)
			throws RegisterException {
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(username.equals(users.username)) {
				System.out.println("该用户名已存在");
			}
			if(!password.equals(password2)) {
				System.out.println("两次输入的密码不一致");
			}
		}
		
	}

	//login方法抛出异常
	public void login(String username, String password,User[] users) throws LoginException {
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(!username.equals(users.username)) {
				System.out.println("用户名不存在");
			}
			if(!password.equals(users.password)) {
				System.out.println("两次输入的密码不一致");
			}
		}
		
	}

	
	
}
