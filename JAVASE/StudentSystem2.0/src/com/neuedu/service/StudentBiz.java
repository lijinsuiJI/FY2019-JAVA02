package com.neuedu.service;

import com.neuedu.service.impl.StudentBizImpl;

public interface StudentBiz {

	//���ѧ��ʵ������
	static StudentBizImpl getIntance() {
		// TODO Auto-generated method stub
		return null;
	}

	//�鿴ȫ��ѧ������
	public void seeStudent();
	//����ID�鿴ѧ����Ϣ
	public void seeStudent(int id);
	//����ID�鿴ѧ������
	public void seeStudent1(int id);
	//���ݳɼ������鿴ѧ����Ϣ   ����
	public void seeStudent2();
	//����
	public void seeStudent3();
	
	//ɾ��ѧ����Ϣ
	public void deleteStudent(int id);
	
	//���ѧ����Ϣ
	public void addStudent(int id, String name, int age, String grade, String sex, int number, String email, String adress,
			int scores, String registerTime, String changeTime);
	
	//�޸�ѧ��ȫ����Ϣ
	public void changeStudent(int id, String name, int age, String grade, String sex, int number, String email, String adress,
			int scores, String changeTime);
	
	//���������޸Ĳ�����Ϣ
	public void changeStudent(int id, String atr, String data, String changeTime);
}
