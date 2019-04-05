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

	//选择登录或者退出系统操作
	public void choise1() {
		
		System.out.println("----------欢迎登录学生管理系统----------");
		System.out.println("1.登录     2.退出");
		System.out.println("-----------------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("---------------请选择----------------");
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
			System.out.println("您已退出系统");
		}
	}
	
	//选择对学生增删改查操作
	public void choise2() {
		System.out.println("******************请选择要操作的信息对应数字******************");
		System.out.println("*1.查看学生信息   2.添加学生信息    3.删除学生信息    4.修改学生信息   5.退出*");
		System.out.println("*******************************************************");
		Scanner s = new Scanner(System.in);
		System.out.println("*************************请选择**************************");
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
			System.out.println("您已退出系统");
		}
	}
	
	
}
