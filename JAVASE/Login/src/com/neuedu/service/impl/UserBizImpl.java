package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz {

	//����user��������
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
		
		//Ĭ���û���������
		boolean usernameexists = false;
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				continue;
			}
			
			String _username = user.getUsername();
			String _password = user.getPassword();
			//�û�������
			if(username.equals(_username)) {
				usernameexists = true;
				//�û����������Ƿ�ƥ��
				if(password.equals(_password)) {
					System.out.println("��¼�ɹ�");
				}else {
					throw new LoginException("�û��������벻ƥ��");
				}
			}
		}
		//�û���������
		if(!usernameexists) {
			throw new LoginException("�û���������");
		}
		
		
	}

	@Override
	public boolean isusernameexists(String username) throws LoginException {
		// TODO Auto-generated method stub
		
		//����users����
		for(int i=0;i<users.length;i++) {
			
			User user = users[i];
			
			if(user == null) {
				continue;
			}
			
			//�ж��û����Ƿ����
			String _username = user.getUsername();
			//�û�������
			if(username.equals(_username)) {
				return true;
			}
			
		}
		throw new LoginException("�û���������");
	}

}
