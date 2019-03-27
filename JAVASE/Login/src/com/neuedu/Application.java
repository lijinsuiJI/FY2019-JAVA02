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
		
		System.out.println("=====»¶Ó­µÇÂ¼¼Æ·ÑÏµÍ³=====");
		Scanner s = new Scanner(System.in);
		System.out.println("1.µÇÂ¼      2.×¢²á");
		System.out.println("=========ÇëÑ¡Ôñ=========");
		int num = s.nextInt();
		
		if(num == 1) {
			//µÇÂ¼
			//¶àÌ¬  
			UserView userview = new UserViewImpl();
			try {
				userview.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();  ´òÓ¡¶ÑÕ»ÐÅÏ¢
				String msg = e.getMessage();
				System.out.println(msg);
				
			}
			
		}else if(num == 2) {
			//×¢²á
			
		}
	}
	
}
