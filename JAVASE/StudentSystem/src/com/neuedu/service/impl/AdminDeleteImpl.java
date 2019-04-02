package com.neuedu.service.impl;

import com.neuedu.pojo.User;
import com.neuedu.service.AdminDelete;

public class AdminDeleteImpl implements AdminDelete {

	@Override
	public void deleteStudent(User[] users,int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				continue;
			}
			int _id = user.getId();
			if(id == _id) {
				users[id-1] = null;
				System.out.println("删除成功，自动返回上一级");
				break;
			}
		}
	}

}
