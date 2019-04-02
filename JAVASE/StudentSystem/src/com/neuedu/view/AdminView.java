package com.neuedu.view;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.User;

public interface AdminView {

	//管理员登录
	public void login() throws LoginException;
	//查看学生信息
	public void seeStudent(User[] users);
	//添加学生信息
	public void addStudent(User[] users);
	//删除学生信息
	public void deleteStudent(User[] users);
	//修改学生信息
	public void changeStudent(User[] users);
}
