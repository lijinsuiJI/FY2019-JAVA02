package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.User;
import com.neuedu.view.AdminView;
import com.neuedu.view.impl.AdminViewImpl;

public class Application {

	static Application app = new Application();
	AdminView adminview = new AdminViewImpl();
	
	//创建学生数组
	public User[] users = new User[10];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		app.InitialUser();
		app.choise();
		
	}
	
	public void InitialUser() {
		User user1 = new User(1, "张三", 18, "男", "初级", 139, "116","广西");
		User user2 = new User(2, "李四", 18, "女", "初级", 139, "116","广西");
		this.users[0] = user1;
		this.users[1] = user2;
	}
	
	public void choise() {
		
		System.out.println("----------欢迎登录学生管理系统----------");
		System.out.println("1.登录     2.退出");
		System.out.println("-----------------------------------");
		Scanner s = new Scanner(System.in);
		System.out.println("---------------请选择----------------");
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
		
		System.out.println("******************请选择要操作的信息对应数字******************");
		System.out.println("*1.查看学生信息   2.添加学生信息    3.删除学生信息    4.修改学生信息   5.退出*");
		System.out.println("*******************************************************");
		Scanner s = new Scanner(System.in);
		System.out.println("*************************请选择**************************");
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
			System.out.println("您已退出系统");
		}
		
	}

}
