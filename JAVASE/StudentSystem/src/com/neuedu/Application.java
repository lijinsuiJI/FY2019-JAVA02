package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.User;
import com.neuedu.view.AdminView;
import com.neuedu.view.impl.AdminViewImpl;

public class Application {

	static Application app = new Application();
	AdminView adminview = new AdminViewImpl();
	
	//����ѧ������
	public User[] users = new User[10];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		app.InitialUser();
		app.choise();
		
	}
	
	public void InitialUser() {
		User user1 = new User(1, "����", 18, "��", "����", 139, "116","����");
		User user2 = new User(2, "����", 18, "Ů", "����", 139, "116","����");
		this.users[0] = user1;
		this.users[1] = user2;
	}
	
	public void choise() {
		
		System.out.println("----------��ӭ��¼ѧ������ϵͳ----------");
		System.out.println("1.��¼     2.�˳�");
		System.out.println("-----------------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("---------------��ѡ��----------------");
		int num = s.nextInt();
		if(num == 1) {
			
			try {
				adminview.login();
				app.choise2(users);
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				String msg = e.getMessage();
				System.out.println(msg);
			}
		}else if(num == 2) {
			System.exit(0);
		}
	}
	
	public void choise2(User[] users) {
		
		System.out.println("******************��ѡ��Ҫ��������Ϣ��Ӧ����******************");
		System.out.println("*1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ    3.ɾ��ѧ����Ϣ    4.�޸�ѧ����Ϣ   5.�˳�*");
		System.out.println("*******************************************************");
		Scanner s = new Scanner(System.in);
		System.out.println("*************************��ѡ��**************************");
		int num = s.nextInt();
		if(num == 1) {
			adminview.seeStudent(users);
			choise2(users);
		}else if(num == 2) {
			adminview.addStudent(users);
			choise2(users);
		}else if(num == 3) {
			adminview.deleteStudent(users);
			choise2(users);
		}else if(num == 4) {
			adminview.changeStudent(users);
			choise2(users);
		}else if(num == 5) {
			System.exit(0);
			System.out.println("�����˳�ϵͳ");
		}
		
	}

}
