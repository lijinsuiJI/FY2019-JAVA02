package com.neuedu;

import java.util.Scanner;

interface UserView1{
	void login();
	void register();
}

public class UserView implements UserView1{

	
	public void login() {
		Scanner s = new Scanner(System.in);
		System.out.println("�������û���");
	    String username = s.nextLine();
	    System.out.println("����������");
	    String password = s.nextLine();
	}

	public void register() {
		Scanner s = new Scanner(System.in);
		System.out.println("�������û���");
		String username = s.next();
		System.out.println("����������");
		String password = s.next();
		System.out.println("���ظ�����");
		String password2=s.next();
		System.out.println("��������ʵ����");
		String name=s.next();
		System.out.println("�������������ַ");
		String email=s.next();
		
	}
	
}


