package com.neuedu.service;

import com.neuedu.exception.LoginException;

public interface AdminBiz {
	
	//�û���¼
	void login(String adminName,String password,String yzm, String yzm1)throws LoginException;
		
	//�ж��û����Ƿ����
	//true �û�������   false  �û���������
	boolean isAdminNameExists(String adminName) throws LoginException;
	
	public String change(String adminName);
	
}
