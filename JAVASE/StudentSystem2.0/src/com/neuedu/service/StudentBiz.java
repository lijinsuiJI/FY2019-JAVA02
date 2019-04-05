package com.neuedu.service;

import com.neuedu.service.impl.StudentBizImpl;

public interface StudentBiz {

	//获得学生实例方法
	static StudentBizImpl getIntance() {
		// TODO Auto-generated method stub
		return null;
	}

	//查看全部学生方法
	public void seeStudent();
	//根据ID查看学生信息
	public void seeStudent(int id);
	//根据ID查看学生姓名
	public void seeStudent1(int id);
	//根据成绩排名查看学生信息   升序
	public void seeStudent2();
	//降序
	public void seeStudent3();
	
	//删除学生信息
	public void deleteStudent(int id);
	
	//添加学生信息
	public void addStudent(int id, String name, int age, String grade, String sex, int number, String email, String adress,
			int scores, String registerTime, String changeTime);
	
	//修改学生全部信息
	public void changeStudent(int id, String name, int age, String grade, String sex, int number, String email, String adress,
			int scores, String changeTime);
	
	//根据属性修改部分信息
	public void changeStudent(int id, String atr, String data, String changeTime);
}
