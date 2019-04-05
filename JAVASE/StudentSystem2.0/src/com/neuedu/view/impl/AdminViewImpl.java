package com.neuedu.view.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.neuedu.exception.LoginException;
import com.neuedu.pojo.ClassEnum;
import com.neuedu.service.impl.AdminBizImpl;
import com.neuedu.service.impl.StudentBizImpl;
import com.neuedu.view.AdminView;

public class AdminViewImpl implements AdminView {

	Scanner s = new Scanner(System.in);
	AdminBizImpl adminBiz = AdminBizImpl.getIntance();
	StudentBizImpl studentBiz = StudentBizImpl.getIntance();
	
	//����ʱ��
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time = new Date();
	
	//����Ա��¼
	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		
		System.out.println("�������û���:");
		String adminName1 = s.next();
		
		//��½�û����Ĵ�Сдת��
		String adminName=adminBiz.change(adminName1);
		
		boolean adminnameexists = adminBiz.isAdminNameExists(adminName);
		if(adminnameexists) {
			//�����֤��    ��֤��Ĵ�Сдת��
			String yzm1 = adminBiz.generateCodeAndPic();
			System.out.println(yzm1);
			String yzm2 = adminBiz.change(yzm1);
			System.out.println("��������֤��:");
			String yzm = s.next();
			System.out.println("����������:");
			String password = s.next();
			adminBiz.login(adminName, password,yzm,yzm2);
			//System.out.print(adminName+"   " +password+"   " +yzm+"   " +yzm2);
		}
	}

	//�鿴ѧ����Ϣ
	@Override
	public void seeStudent() {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.�鿴����ѧ����Ϣ  2.����id��ѯѧ����Ϣ  3.����id��ѯѧ������  4.��ѯ����ѧ���ɼ�+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++��ѡ��˵�+++++++++++++++++++++++++++");
		int num = s.nextInt();
		if(num == 1) {
			//�鿴����ѧ����Ϣ
			studentBiz.seeStudent();
		}
		if(num == 2) {
			//����id��ѯѧ����Ϣ
			System.out.println("������Ҫ��ѯ��id:");
			int id = s.nextInt();
			studentBiz.seeStudent(id);
		}
		if(num == 3) {
			//����id��ѯѧ������
			System.out.println("������Ҫ��ѯ��id:");
			int id = s.nextInt();
			studentBiz.seeStudent1(id);
		}
		if(num == 4) {
			//��ѯ����ѧ���ɼ�
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("+ 1.���ճɼ��Ӹߵ��Ͳ�ѯ  2.���ճɼ��ӵ͵��߲�ѯ  +");
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++��ѡ��˵�+++++++++++++++++");
			System.out.println("������Ҫ��ѯ�ķ�ʽ:");
			int num1 = s.nextInt();
			if(num1 == 1) {
				studentBiz.seeStudent2();
			}
			if(num1 == 2) {
				studentBiz.seeStudent3();
			}
		}
	}

	//���ѧ����Ϣ
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("+++++++++++++++++++++++++���ѧ����Ϣ+++++++++++++++++++++");
		System.out.println("������ѧ��id��");
		int id = s.nextInt();
		System.out.println("������ѧ��������");
		String name = s.next();
		System.out.println("������ѧ�����䣺");
		int age = s.nextInt();
		System.out.println("������ѧ���Ա�(1.��   2.Ů)��");
		//String sex = s.next();
		int num = s.nextInt();
		String sex = null;
		if(num == 1) {
			sex = ClassEnum.MAN.getClassEnum();
		}
		if(num == 2) {
			sex = ClassEnum.WOMAN.getClassEnum();
		}
		System.out.println("������ѧ���꼶(1.����  2.�м�  3.�߼�)��");
		//String grade = s.next();
		int num1 = s.nextInt();
		String grade = null;
		if(num1 == 1) {
			grade = ClassEnum.PRIMARY.getClassEnum();
		}
		if(num1 == 2) {
			grade = ClassEnum.INTERMEDIAT.getClassEnum();
		}
		if(num1 == 3) {
			grade = ClassEnum.SENIOR.getClassEnum();
		}
		System.out.println("������ѧ���绰��");
		int number = s.nextInt();
		System.out.println("������ѧ�����䣺");
		String email = s.next();
		System.out.println("������ѧ����ַ��");
		String adress = s.next();
		System.out.println("������ѧ���ɼ���");
		int scores = s.nextInt();
		//ע��ʱ����޸�ʱ��
		long changeTime= time.getTime();
		long registerTime = time.getTime();
		String a = sdf.format(registerTime);
		String b = sdf.format(changeTime);
		studentBiz.addStudent(id, name, age, grade, sex, number, email, adress, scores, a, b);
	}

	//ɾ��ѧ����Ϣ
	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("������Ҫɾ����Ϣ��ѧ��ѧ��");
		int id = s.nextInt();
		studentBiz.deleteStudent(id);
	}

	//�޸�ѧ����Ϣ
	@Override
	public void changeStudent() {
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
			System.out.println("�������޸ĺ�ѧ��������");
			String name = s.next();
			System.out.println("�������޸ĺ�ѧ�����䣺");
			int age = s.nextInt();
			System.out.println("�������޸ĺ�ѧ���Ա�(1.��   2.Ů)��");
			//String sex = s.next();
			int num1 = s.nextInt();
			String sex = null;
			if(num1 == 1) {
				sex = ClassEnum.MAN.getClassEnum();
			}
			if(num1 == 2) {
				sex = ClassEnum.WOMAN.getClassEnum();
			}
			System.out.println("�������޸ĺ�ѧ���꼶(1.����  2.�м�  3.�߼�)��");
			//String grade = s.next();
			int num2 = s.nextInt();
			String grade = null;
			if(num2 == 1) {
				grade = ClassEnum.PRIMARY.getClassEnum();
			}
			if(num2 == 2) {
				grade = ClassEnum.INTERMEDIAT.getClassEnum();
			}
			if(num2 == 3) {
				grade = ClassEnum.SENIOR.getClassEnum();
			}
			System.out.println("�������޸ĺ�ѧ���绰��");
			int number = s.nextInt();
			System.out.println("�������޸ĺ�ѧ�����䣺");
			String email = s.next();
			System.out.println("�������޸ĺ�ѧ����ַ��");
			String adress = s.next();
			System.out.println("�������޸ĺ�ѧ���ɼ���");
			int scores = s.nextInt();
			//ע��ʱ����޸�ʱ��
			long changeTime= time.getTime();
			String b = sdf.format(changeTime);
			studentBiz.changeStudent(id, name, age, grade, sex, number, email, adress, scores, b);
			
		}else if(num == 2) {
			//����id�޸Ĳ���ѧ����Ϣ
			System.out.println("������Ҫ�޸ĵ�ѧ��id");
			int id = s.nextInt();
			System.out.println("������Ҫ�޸ĵ�ѧ������");
			String atr = s.next();
			System.out.println("�������޸ĺ������");
			String data = s.next();
			//ע��ʱ����޸�ʱ��
			long changeTime= time.getTime();
			String b = sdf.format(changeTime);
			studentBiz.changeStudent(id, atr, data, b);
			
		}else if(num == 3) {
			//������һ��
			
		}else if(num == 4) {
			//ϵͳ�˳�
			System.exit(0);
		}
	}

}
