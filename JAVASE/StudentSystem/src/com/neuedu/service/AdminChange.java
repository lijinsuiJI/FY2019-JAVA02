package com.neuedu.service;

import com.neuedu.pojo.User;

public interface AdminChange {
	
	public void changeStudent(User[] users,int id,String name,int age,String sex,String grade,int number,String email,String adress);
	
	public void changeStudent1(User[] users,int id,String arr,String data);
	
	
}
