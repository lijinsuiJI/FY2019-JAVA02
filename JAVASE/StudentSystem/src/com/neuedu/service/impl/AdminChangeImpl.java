package com.neuedu.service.impl;

import com.neuedu.pojo.User;
import com.neuedu.service.AdminChange;

public class AdminChangeImpl implements AdminChange {

	@Override
	public void changeStudent(User[] users, int id,String name,int age,String sex,String grade,int number,String email,String adress) {
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
			if(user == null) {
				continue;
			}
			int _id = users[i].getId();
			if(id == _id) {
				users[i]=user;
				System.out.println("修改成功");
				break;
			}
		}
	}

	@Override
	public void changeStudent1(User[] users, int id, String arr, String data) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(id);
		
		for(int i=0;i<users.length;i++) {
			if(users[i] == null) {
				continue;
			}
			int _id = users[i].getId();
			if(id == _id) {
				if(users[i].getName().equals(arr)) {
					user.setName(data);
					user.setAge(users[i].getAge());
					user.setSex(users[i].getSex());
					user.setGrade(users[i].getGrade());
					user.setNumber(users[i].getNumber());
					user.setEmail(users[i].getEmail());
					user.setAdress(users[i].getAdress());
					users[i]=user;
					System.out.println("修改成功,自动返回上一级");
					break;
				}
				if(users[i].getSex().equals(arr)) {
					user.setName(users[i].getName());
					user.setAge(users[i].getAge());
					user.setSex(data);
					user.setGrade(users[i].getGrade());
					user.setNumber(users[i].getNumber());
					user.setEmail(users[i].getEmail());
					user.setAdress(users[i].getAdress());
					users[i]=user;
					System.out.println("修改成功,自动返回上一级");
					break;
				}
				if(users[i].getGrade().equals(arr)) {
					user.setName(users[i].getName());
					user.setAge(users[i].getAge());
					user.setSex(users[i].getSex());
					user.setGrade(data);
					user.setNumber(users[i].getNumber());
					user.setEmail(users[i].getEmail());
					user.setAdress(users[i].getAdress());
					users[i]=user;
					System.out.println("修改成功,自动返回上一级");
					break;
				}
				if(users[i].getEmail().equals(arr)) {
					user.setName(users[i].getName());
					user.setAge(users[i].getAge());
					user.setSex(users[i].getSex());
					user.setGrade(users[i].getGrade());
					user.setNumber(users[i].getNumber());
					user.setEmail(data);
					user.setAdress(users[i].getAdress());
					users[i]=user;
					System.out.println("修改成功,自动返回上一级");
					break;
				}
				if(users[i].getAdress().equals(arr)) {
					user.setName(users[i].getName());
					user.setAge(users[i].getAge());
					user.setSex(users[i].getSex());
					user.setGrade(users[i].getGrade());
					user.setNumber(users[i].getNumber());
					user.setEmail(users[i].getEmail());
					user.setAdress(data);
					users[i]=user;
					System.out.println("修改成功,自动返回上一级");
					break;
				}
			}
		}
	}


}
