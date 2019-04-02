package com.neuedu.service.impl;

import com.neuedu.pojo.User;
import com.neuedu.service.AdminSee;

public class AdminSeeImpl implements AdminSee {
	
	@Override
	public void seeStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("--------------------����ѧ����Ϣ--------------------");
		System.out.println("|ѧ��     |����     |����     |�Ա�      |�꼶      |�绰     |����      |��ַ        ");
		
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				continue;
			}
			if(user != null) {
				System.out.println("------------------------------------------------");
				System.out.println("|"+user.id+"|"+user.name+"|"+user.age+"|"+user.sex+"|"+user.grade+"|"+user.number+"|"+user.email+"|"+user.adress );
			}
		}
	}
	
	public void seeStudent(User[] users,int id) {
		// TODO Auto-generated method stub
		System.out.println("---------------------��ѧ����Ϣ---------------------");
		System.out.println("|ѧ��     |����     |����     |�Ա�      |�꼶      |�绰     |����      |��ַ        ");
		
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				continue;
			}
			int _id = user.getId();
			if(id == _id) {
				System.out.println("------------------------------------------------");
				System.out.println("|"+user.id+"|"+user.name+"|"+user.age+"|"+user.sex+"|"+user.grade+"|"+user.number+"|"+user.email+"|"+user.adress );
				break;
			}
		}
		
	}

	@Override
	public void seeStudent1(User[] users,int id) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				continue;
			}
			int _id = user.getId();
			if(id == _id) {
				System.out.println("��ѧ����������"+user.name);
				break;
			}
		}
	}

}
