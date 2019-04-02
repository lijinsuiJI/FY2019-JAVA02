package com.neuedu.service.impl;

import com.neuedu.pojo.User;
import com.neuedu.service.AdminAdd;

public class AdminAddImpl implements AdminAdd {

	@Override
//	public void addStudent(User[] users,int id,String name,int age,String sex,String grade,int number,String email,String adress) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<users.length;i++) {
//			User user = users[i];
//			if(user == null && ) {
//				continue;
//			}
//			if(i<users.length) {
//				
//			}
//				user.setId(id);
//				user.setName(name);
//				user.setAge(age);
//				user.setSex(sex);
//				user.setGrade(grade);
//				user.setNumber(number);
//				user.setEmail(email);
//				user.setAdress(adress);
//				System.out.println("添加成功");
//			
//		}
//	}
	public void addStudent(User[] users,int id,String name,int age,String sex,String grade,int number,String email,String adress) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		user.setSex(sex);
		user.setGrade(grade);
		user.setNumber(number);
		user.setEmail(email);
		user.setAdress(adress);
		for(int i=0;i<users.length;i++) {
			
			if(users[i] == null) {
				users[i]=user;
				break;
			}
		}
		System.out.println("添加成功");
	}

}
