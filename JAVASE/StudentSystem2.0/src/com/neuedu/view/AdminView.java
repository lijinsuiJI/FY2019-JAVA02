package com.neuedu.view;

import com.neuedu.exception.LoginException;

public interface AdminView {

	//管理员登录
	public void login() throws LoginException;
	//查看学生信息
	public void seeStudent();
	//添加学生信息
	public void addStudent();
	//删除学生信息
	public void deleteStudent();
	//修改学生信息
	public void changeStudent();
	
}
