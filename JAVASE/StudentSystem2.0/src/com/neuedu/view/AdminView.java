package com.neuedu.view;

import com.neuedu.exception.LoginException;

public interface AdminView {

	//����Ա��¼
	public void login() throws LoginException;
	//�鿴ѧ����Ϣ
	public void seeStudent();
	//���ѧ����Ϣ
	public void addStudent();
	//ɾ��ѧ����Ϣ
	public void deleteStudent();
	//�޸�ѧ����Ϣ
	public void changeStudent();
	
}
