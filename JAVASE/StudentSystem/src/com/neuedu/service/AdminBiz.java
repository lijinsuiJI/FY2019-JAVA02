package com.neuedu.service;

import com.neuedu.exception.LoginException;

public interface AdminBiz {

	//�û���¼
	void login(String adminName,String password)throws LoginException;
	
	//�ж��û����Ƿ����
	//true �û�������   false  �û���������
	boolean isAdminNameExists(String adminName) throws LoginException;
}
