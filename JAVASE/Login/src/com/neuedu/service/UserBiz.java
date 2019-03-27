package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {

	//�û�ע��
	void register(String username,String password,String password2,String name,String email)
	throws RegisterException;
	//�û���¼
	void login(String username,String password) 
	throws LoginException;

	//�ж��û����Ƿ����
	//true �û�������   false  �û���������
	boolean isusernameexists(String username) throws LoginException;
	
}
