package com.neuedu;

import java.util.Scanner;

interface UserView1{
	void login();
	void register();
}

public class UserView implements UserView1{

	
	public void login() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名");
	    String username = s.nextLine();
	    System.out.println("请输入密码");
	    String password = s.nextLine();
	}

	public void register() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = s.next();
		System.out.println("请输入密码");
		String password = s.next();
		System.out.println("请重复密码");
		String password2=s.next();
		System.out.println("请输入真实姓名");
		String name=s.next();
		System.out.println("请读入电子邮箱地址");
		String email=s.next();
		
	}
	
}


