package com.neuedu.view.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.neuedu.exception.LoginException;
import com.neuedu.pojo.ClassEnum;
import com.neuedu.service.impl.AdminBizImpl;
import com.neuedu.service.impl.StudentBizImpl;
import com.neuedu.view.AdminView;

public class AdminViewImpl implements AdminView {

	Scanner s = new Scanner(System.in);
	AdminBizImpl adminBiz = AdminBizImpl.getIntance();
	StudentBizImpl studentBiz = StudentBizImpl.getIntance();
	
	//定义时间
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time = new Date();
	
	//管理员登录
	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		
		System.out.println("请输入用户名:");
		String adminName1 = s.next();
		
		//登陆用户名的大小写转化
		String adminName=adminBiz.change(adminName1);
		
		boolean adminnameexists = adminBiz.isAdminNameExists(adminName);
		if(adminnameexists) {
			//输出验证码    验证码的大小写转化
			String yzm1 = adminBiz.generateCodeAndPic();
			System.out.println(yzm1);
			String yzm2 = adminBiz.change(yzm1);
			System.out.println("请输入验证码:");
			String yzm = s.next();
			System.out.println("请输入密码:");
			String password = s.next();
			adminBiz.login(adminName, password,yzm,yzm2);
			//System.out.print(adminName+"   " +password+"   " +yzm+"   " +yzm2);
		}
	}

	//查看学生信息
	@Override
	public void seeStudent() {
		// TODO Auto-generated method stub
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1.查看所有学生信息  2.根据id查询学生信息  3.根据id查询学生姓名  4.查询所有学生成绩+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++请选择菜单+++++++++++++++++++++++++++");
		int num = s.nextInt();
		if(num == 1) {
			//查看所有学生信息
			studentBiz.seeStudent();
		}
		if(num == 2) {
			//根据id查询学生信息
			System.out.println("请输入要查询的id:");
			int id = s.nextInt();
			studentBiz.seeStudent(id);
		}
		if(num == 3) {
			//根据id查询学生姓名
			System.out.println("请输入要查询的id:");
			int id = s.nextInt();
			studentBiz.seeStudent1(id);
		}
		if(num == 4) {
			//查询所有学生成绩
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("+ 1.按照成绩从高到低查询  2.按照成绩从低到高查询  +");
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++请选择菜单+++++++++++++++++");
			System.out.println("请输入要查询的方式:");
			int num1 = s.nextInt();
			if(num1 == 1) {
				studentBiz.seeStudent2();
			}
			if(num1 == 2) {
				studentBiz.seeStudent3();
			}
		}
	}

	//添加学生信息
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("+++++++++++++++++++++++++添加学生信息+++++++++++++++++++++");
		System.out.println("请输入学生id：");
		int id = s.nextInt();
		System.out.println("请输入学生姓名：");
		String name = s.next();
		System.out.println("请输入学生年龄：");
		int age = s.nextInt();
		System.out.println("请输入学生性别(1.男   2.女)：");
		//String sex = s.next();
		int num = s.nextInt();
		String sex = null;
		if(num == 1) {
			sex = ClassEnum.MAN.getClassEnum();
		}
		if(num == 2) {
			sex = ClassEnum.WOMAN.getClassEnum();
		}
		System.out.println("请输入学生年级(1.初级  2.中级  3.高级)：");
		//String grade = s.next();
		int num1 = s.nextInt();
		String grade = null;
		if(num1 == 1) {
			grade = ClassEnum.PRIMARY.getClassEnum();
		}
		if(num1 == 2) {
			grade = ClassEnum.INTERMEDIAT.getClassEnum();
		}
		if(num1 == 3) {
			grade = ClassEnum.SENIOR.getClassEnum();
		}
		System.out.println("请输入学生电话：");
		int number = s.nextInt();
		System.out.println("请输入学生邮箱：");
		String email = s.next();
		System.out.println("请输入学生地址：");
		String adress = s.next();
		System.out.println("请输入学生成绩：");
		int scores = s.nextInt();
		//注册时间和修改时间
		long changeTime= time.getTime();
		long registerTime = time.getTime();
		String a = sdf.format(registerTime);
		String b = sdf.format(changeTime);
		studentBiz.addStudent(id, name, age, grade, sex, number, email, adress, scores, a, b);
	}

	//删除学生信息
	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("请输入要删除信息的学生学号");
		int id = s.nextInt();
		studentBiz.deleteStudent(id);
	}

	//修改学生信息
	@Override
	public void changeStudent() {
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
			System.out.println("请输入修改后学生姓名：");
			String name = s.next();
			System.out.println("请输入修改后学生年龄：");
			int age = s.nextInt();
			System.out.println("请输入修改后学生性别(1.男   2.女)：");
			//String sex = s.next();
			int num1 = s.nextInt();
			String sex = null;
			if(num1 == 1) {
				sex = ClassEnum.MAN.getClassEnum();
			}
			if(num1 == 2) {
				sex = ClassEnum.WOMAN.getClassEnum();
			}
			System.out.println("请输入修改后学生年级(1.初级  2.中级  3.高级)：");
			//String grade = s.next();
			int num2 = s.nextInt();
			String grade = null;
			if(num2 == 1) {
				grade = ClassEnum.PRIMARY.getClassEnum();
			}
			if(num2 == 2) {
				grade = ClassEnum.INTERMEDIAT.getClassEnum();
			}
			if(num2 == 3) {
				grade = ClassEnum.SENIOR.getClassEnum();
			}
			System.out.println("请输入修改后学生电话：");
			int number = s.nextInt();
			System.out.println("请输入修改后学生邮箱：");
			String email = s.next();
			System.out.println("请输入修改后学生地址：");
			String adress = s.next();
			System.out.println("请输入修改后学生成绩：");
			int scores = s.nextInt();
			//注册时间和修改时间
			long changeTime= time.getTime();
			String b = sdf.format(changeTime);
			studentBiz.changeStudent(id, name, age, grade, sex, number, email, adress, scores, b);
			
		}else if(num == 2) {
			//根据id修改部分学生信息
			System.out.println("请输入要修改的学生id");
			int id = s.nextInt();
			System.out.println("请输入要修改的学生属性");
			String atr = s.next();
			System.out.println("请输入修改后的数据");
			String data = s.next();
			//注册时间和修改时间
			long changeTime= time.getTime();
			String b = sdf.format(changeTime);
			studentBiz.changeStudent(id, atr, data, b);
			
		}else if(num == 3) {
			//返回上一层
			
		}else if(num == 4) {
			//系统退出
			System.exit(0);
		}
	}

}
