package com.neuedu.view;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.User;

public interface AdminView {

	//����Ա��¼
	public void login() throws LoginException;
	//�鿴ѧ����Ϣ
	public void seeStudent(User[] users);
	//���ѧ����Ϣ
	public void addStudent(User[] users);
	//ɾ��ѧ����Ϣ
	public void deleteStudent(User[] users);
	//�޸�ѧ����Ϣ
	public void changeStudent(User[] users);
}
