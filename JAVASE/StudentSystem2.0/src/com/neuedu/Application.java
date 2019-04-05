package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.view.AdminView;
import com.neuedu.view.impl.AdminViewImpl;

public class Application {

	static Application app = new Application();
	AdminView adminview = new AdminViewImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		app.choise1();
		
	}

	//ѡ���¼�����˳�ϵͳ����
	public void choise1() {
		
		System.out.println("----------��ӭ��¼ѧ������ϵͳ----------");
		System.out.println("1.��¼     2.�˳�");
		System.out.println("-----------------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("---------------��ѡ��----------------");
		int num = s.nextInt();
		if(num == 1) {
			try {
				adminview.login();
				app.choise2();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				String msg = e.getMessage();
				System.out.println(msg);
				app.choise1();
			}
		}
		if(num == 2) {
			System.exit(0);
			System.out.println("�����˳�ϵͳ");
		}
	}
	
	//ѡ���ѧ����ɾ�Ĳ����
	public void choise2() {
		System.out.println("******************��ѡ��Ҫ��������Ϣ��Ӧ����******************");
		System.out.println("*1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ    3.ɾ��ѧ����Ϣ    4.�޸�ѧ����Ϣ   5.�˳�*");
		System.out.println("*******************************************************");
		Scanner s = new Scanner(System.in);
		System.out.println("*************************��ѡ��**************************");
		int num = s.nextInt();
		if(num == 1) {
			adminview.seeStudent();
			choise2();
		}
		if(num == 2) {
			adminview.addStudent();
			choise2();
		}
		if(num == 3) {
			adminview.deleteStudent();
			choise2();
		}
		if(num == 4) {
			adminview.changeStudent();
			choise2();
		}
		if(num == 5) {
			System.exit(0);
			System.out.println("�����˳�ϵͳ");
		}
	}
	
	
}
