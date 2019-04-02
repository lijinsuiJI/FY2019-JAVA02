package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.pojo.User;
import com.neuedu.service.AdminAdd;
import com.neuedu.service.AdminBiz;
import com.neuedu.service.AdminChange;
import com.neuedu.service.AdminDelete;
import com.neuedu.service.AdminSee;
import com.neuedu.service.impl.AdminAddImpl;
import com.neuedu.service.impl.AdminBizImpl;
import com.neuedu.service.impl.AdminChangeImpl;
import com.neuedu.service.impl.AdminDeleteImpl;
import com.neuedu.service.impl.AdminSeeImpl;
import com.neuedu.view.AdminView;

public class AdminViewImpl implements AdminView {

	Scanner s = new Scanner(System.in);
	AdminBiz adminBiz = new AdminBizImpl();
	AdminSee adminSee = new AdminSeeImpl();
	AdminDelete adminDelete = new AdminDeleteImpl();
	AdminAdd adminAdd = new AdminAddImpl();
	AdminChange adminChange = new AdminChangeImpl();
	
	//管理员登录
	@Override
	public void login() throws LoginException {
		// TODO Auto-generated method stub
		
		System.out.println("请输入用户名:");
		String adminName = s.next();
		
		boolean adminnameexists = adminBiz.isAdminNameExists(adminName);
		if(adminnameexists) {
			System.out.println("请输入密码:");
			String password = s.next();
			adminBiz.login(adminName, password);
		}
	}

	//查看学生信息
	@Override
	public void seeStudent(User[] users) {
		// TODO Auto-generated method stub
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.查看所有学生信息  2.根据id查询学生信息  3.根据id查询学生姓名  4.返回上一层+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++请选择菜单+++++++++++++++++++++++++");
		int num = s.nextInt();
		if(num == 1) {
			//查看所有学生信息
			adminSee.seeStudent(users);
		}else if(num == 2) {
			//根据id查询学生信息
			System.out.println("请输入要查询的id:");
			int id = s.nextInt();
			adminSee.seeStudent(users,id);
		}else if(num == 3) {
			//根据id查询学生姓名
			System.out.println("请输入要查询的id:");
			int id = s.nextInt();
			adminSee.seeStudent1(users,id);
		}else if(num == 4) {
			//返回上一层
			seeStudent(users);
		}
	}

	//添加学生信息
	@Override
	public void addStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++++++++添加学生信息+++++++++++++++++++++");
		System.out.println("请输入学生id：");
		int id = s.nextInt();
		System.out.println("请输入学生姓名：");
		String name = s.next();
		System.out.println("请输入学生年龄：");
		int age = s.nextInt();
		System.out.println("请输入学生性别：");
		String sex = s.next();
		System.out.println("请输入学生年级：");
		String grade = s.next();
		System.out.println("请输入学生电话：");
		int number = s.nextInt();
		System.out.println("请输入学生邮箱：");
		String email = s.next();
		System.out.println("请输入学生地址：");
		String adress = s.next();
		adminAdd.addStudent(users,id,name,age,sex,grade,number,email,adress);
		
	}

	//删除学生信息
	@Override
	public void deleteStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("请输入要删除信息的学生学号");
		int id = s.nextInt();
		adminDelete.deleteStudent(users,id);
		
	}

	//修改学生信息
	@Override
	public void changeStudent(User[] users) {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ 1.根据id修改学生信息  2.根据id修改部分学生信息  3.返回上级目录  4.系统退出   +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++请选择菜单+++++++++++++++++++++++++");
		int num = s.nextInt();
		
		if(num == 1) {
			//根据id修改学生信息
			System.out.println("请输入要修改的学生id");
			int id = s.nextInt();
			System.out.println("请输入学生姓名：");
			String name = s.next();
			System.out.println("请输入学生年龄：");
			int age = s.nextInt();
			System.out.println("请输入学生性别：");
			String sex = s.next();
			System.out.println("请输入学生年级：");
			String grade = s.next();
			System.out.println("请输入学生电话：");
			int number = s.nextInt();
			System.out.println("请输入学生邮箱：");
			String email = s.next();
			System.out.println("请输入学生地址：");
			String adress = s.next();
			adminChange.changeStudent(users,id,name,age,sex,grade,number,email,adress);
		}else if(num == 2) {
			//根据id修改部分学生信息
			System.out.println("请输入要修改的学生id");
			int id = s.nextInt();
			System.out.println("请输入要修改的学生属性");
			String arr = s.next();
			System.out.println("请输入修改后的数据");
			String data = s.next();
			adminChange.changeStudent1(users,id,arr,data);
		}else if(num == 3) {
			//返回上一层
			changeStudent(users);
		}else if(num == 4) {
			//系统退出
			System.exit(0);
		}
	}

	
}
