package com.neuedu;

interface UserBiz1 {

	//�û�ע��
	void register(String username, String password, String password2,String name, String email,User[] users) throws RegisterException; 
	//�û���¼
	void login(String username, String password,User[] users) throws LoginException;
}

public class UserBiz implements UserBiz1{

	//��ʼ������
	public static void initData(User[] users) {
		User a = new User("admin","admin","Administrator","admin@123.com");
		User b = new User("tom","cat","tomcat","tomcat@cat.com");
		users[0] = a;
		users[1] = b;
	}
	
	//register�����׳��쳣
	public void register(String username, String password, String password2, String name, String email,User[] users)
			throws RegisterException {
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(username.equals(users.username)) {
				System.out.println("���û����Ѵ���");
			}
			if(!password.equals(password2)) {
				System.out.println("������������벻һ��");
			}
		}
		
	}

	//login�����׳��쳣
	public void login(String username, String password,User[] users) throws LoginException {
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(!username.equals(users.username)) {
				System.out.println("�û���������");
			}
			if(!password.equals(users.password)) {
				System.out.println("������������벻һ��");
			}
		}
		
	}

	
	
}
