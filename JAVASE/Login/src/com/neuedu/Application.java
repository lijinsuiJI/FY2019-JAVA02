package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class Application {

	public static void main(String[] args) {
		
		Application app = new Application();
		app.choise();
		
	}
	
	public void choise() {
		
		System.out.println("=====��ӭ��¼�Ʒ�ϵͳ=====");
		Scanner s = new Scanner(System.in);
		System.out.println("1.��¼      2.ע��");
		System.out.println("=========��ѡ��=========");
		int num = s.nextInt();
		
		if(num == 1) {
			//��¼
			//��̬  
			UserView userview = new UserViewImpl();
			try {
				userview.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();  ��ӡ��ջ��Ϣ
				String msg = e.getMessage();
				System.out.println(msg);
				
			}
			
		}else if(num == 2) {
			//ע��
			
		}
	}
	
}
