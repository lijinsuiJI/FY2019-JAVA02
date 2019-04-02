package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.User;
import com.neuedu.service.AdminAdd;
import com.neuedu.service.AdminBiz;
import com.neuedu.service.AdminChange;
import com.neuedu.service.AdminDelete;
import com.neuedu.service.AdminSee;
import com.neuedu.service.impl.AdminAddImpl;
import com.neuedu.service.impl.AdminBizImpl;
import com.neuedu.service.impl.AdminChangeImpl;
import com.neuedu.service.impl.AdminDeleteImpl;
import com.neuedu.service.impl.AdminSeeImpl;
import com.neuedu.view.AdminView;

public class AdminViewImpl implements AdminView {

	Scanner s = new Scanner(System.in);
	AdminBiz adminBiz = new AdminBizImpl();
	AdminSee adminSee = new AdminSeeImpl();
	AdminDelete adminDelete = new AdminDeleteImpl();
	AdminAdd adminAdd = new AdminAddImpl();
	AdminChange adminChange = new AdminChangeImpl();
	
	//����Ա��¼
	@Override
	public void login() throws LoginException {
		// TODO Auto-generated method stub
		
		System.out.println("�������û���:");
		String adminName = s.next();
		
		boolean adminnameexists = adminBiz.isAdminNameExists(adminName);
		if(adminnameexists) {
			System.out.println("����������:");
			String password = s.next();
			adminBiz.login(adminName, password);
		}
	}

	//�鿴ѧ����Ϣ
	@Override
	public void seeStudent(User[] users) {
		// TODO Auto-generated method stub
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.�鿴����ѧ����Ϣ  2.����id��ѯѧ����Ϣ  3.����id��ѯѧ������  4.������һ��+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++��ѡ��˵�+++++++++++++++++++++++++");
		int num = s.nextInt();
		if(num == 1) {
			//�鿴����ѧ����Ϣ
			adminSee.seeStudent(users);
		}else if(num == 2) {
			//����id��ѯѧ����Ϣ
			System.out.println("������Ҫ��ѯ��id:");
			int id = s.nextInt();
			adminSee.seeStudent(users,id);
		}else if(num == 3) {
			//����id��ѯѧ������
			System.out.println("������Ҫ��ѯ��id:");
			int id = s.nextInt();
			adminSee.seeStudent1(users,id);
		}else if(num == 4) {
			//������һ��
			seeStudent(users);
		}
	}

	//���ѧ����Ϣ
	@Override
	public void addStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++++++++���ѧ����Ϣ+++++++++++++++++++++");
		System.out.println("������ѧ��id��");
		int id = s.nextInt();
		System.out.println("������ѧ��������");
		String name = s.next();
		System.out.println("������ѧ�����䣺");
		int age = s.nextInt();
		System.out.println("������ѧ���Ա�");
		String sex = s.next();
		System.out.println("������ѧ���꼶��");
		String grade = s.next();
		System.out.println("������ѧ���绰��");
		int number = s.nextInt();
		System.out.println("������ѧ�����䣺");
		String email = s.next();
		System.out.println("������ѧ����ַ��");
		String adress = s.next();
		adminAdd.addStudent(users,id,name,age,sex,grade,number,email,adress);
		
	}

	//ɾ��ѧ����Ϣ
	@Override
	public void deleteStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫɾ����Ϣ��ѧ��ѧ��");
		int id = s.nextInt();
		adminDelete.deleteStudent(users,id);
		
	}

	//�޸�ѧ����Ϣ
	@Override
	public void changeStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ 1.����id�޸�ѧ����Ϣ  2.����id�޸Ĳ���ѧ����Ϣ  3.�����ϼ�Ŀ¼  4.ϵͳ�˳�   +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++��ѡ��˵�+++++++++++++++++++++++++");
		int num = s.nextInt();
		
		if(num == 1) {
			//����id�޸�ѧ����Ϣ
			System.out.println("������Ҫ�޸ĵ�ѧ��id");
			int id = s.nextInt();
			System.out.println("������ѧ��������");
			String name = s.next();
			System.out.println("������ѧ�����䣺");
			int age = s.nextInt();
			System.out.println("������ѧ���Ա�");
			String sex = s.next();
			System.out.println("������ѧ���꼶��");
			String grade = s.next();
			System.out.println("������ѧ���绰��");
			int number = s.nextInt();
			System.out.println("������ѧ�����䣺");
			String email = s.next();
			System.out.println("������ѧ����ַ��");
			String adress = s.next();
			adminChange.changeStudent(users,id,name,age,sex,grade,number,email,adress);
		}else if(num == 2) {
			//����id�޸Ĳ���ѧ����Ϣ
			System.out.println("������Ҫ�޸ĵ�ѧ��id");
			int id = s.nextInt();
			System.out.println("������Ҫ�޸ĵ�ѧ������");
			String arr = s.next();
			System.out.println("�������޸ĺ������");
			String data = s.next();
			adminChange.changeStudent1(users,id,arr,data);
		}else if(num == 3) {
			//������һ��
			changeStudent(users);
		}else if(num == 4) {
			//ϵͳ�˳�
			System.exit(0);
		}
	}

	
}
