package com.neuedu.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import com.neuedu.pojo.Student;
import com.neuedu.service.StudentBiz;

public class StudentBizImpl implements StudentBiz {

	//创建学生集合
	public List<Student> StudentList = new LinkedList<Student>();
	
	//单例模式
	private static StudentBizImpl studentBizImpl;
	
	//对外提供获取实例方法     线程安全
	public static synchronized StudentBizImpl getIntance() {
		
		if(studentBizImpl == null) {
			studentBizImpl = new StudentBizImpl();
		}
		return studentBizImpl;
	}
	
	//初始化数据
	private StudentBizImpl() {
		
		StudentList.add(new Student(1,"张三",18, "初级", "男", 139, "116@qq.com", "广西", 95));
		StudentList.add(new Student(2,"李四",18, "初级", "女", 139, "116@qq.com", "广西", 97));
		StudentList.add(new Student(3,"王五",18, "初级", "女", 139, "116@qq.com", "广西", 96));
		
	}

	//查看全部学生信息
	@Override
	public void seeStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------所有学生信息-------------------------------");
		System.out.println("|学号     |姓名     |年龄     |性别      |年级      |电话     |邮箱      |地址        |成绩      |注册时间  |修改时间 ");
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			if(StudentList != null) {
				System.out.println("---------------------------------------------------------------------");
				int id = StudentList.get(i).getId();
				String name = StudentList.get(i).getName();
				int age = StudentList.get(i).getAge();
				String sex = StudentList.get(i).getSex();
				String grade = StudentList.get(i).getGrade();
				int number = StudentList.get(i).getNumber();
				String email = StudentList.get(i).getEmail();
				String adress = StudentList.get(i).getAdress();
				int scores = StudentList.get(i).getScores();
				String regsterTime = StudentList.get(i).getRegisterTime();
				String loginTime = StudentList.get(i).getChangeTime();
				System.out.println("|"+id+"|"+name+"|"+age+"|"+sex+"|"+grade+"|"+number+"|"+email+"|"+adress+"|"+scores+"|"+regsterTime+"|"+loginTime);
				
			}
			
		}
		System.out.println("查询完毕，自动返回上一层");
	}

	//根据ID查看学生信息
	@Override
	public void seeStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------所有学生信息-------------------------------");
		System.out.println("|学号     |姓名     |年龄     |性别      |年级      |电话     |邮箱      |地址        |成绩      |注册时间  |修改时间 ");
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			int _id = StudentList.get(i).getId();
			if(_id == id) {
				String name = StudentList.get(i).getName();
				int age = StudentList.get(i).getAge();
				String sex = StudentList.get(i).getSex();
				String grade = StudentList.get(i).getGrade();
				int number = StudentList.get(i).getNumber();
				String email = StudentList.get(i).getEmail();
				String adress = StudentList.get(i).getAdress();
				int scores = StudentList.get(i).getScores();
				String regsterTime = StudentList.get(i).getRegisterTime();
				String loginTime = StudentList.get(i).getChangeTime();
				System.out.println("|"+id+"|"+name+"|"+age+"|"+sex+"|"+grade+"|"+number+"|"+email+"|"+adress+"|"+scores+"|"+regsterTime+"|"+loginTime);
				
				break;
				
			}
		}
		System.out.println("查询完毕，自动返回上一层");
	}

	//根据ID查询姓名
	@Override
	public void seeStudent1(int id) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			int _id = StudentList.get(i).getId();
			if(_id == id) {
				String name = StudentList.get(i).getName();
				System.out.println(name);
				break;
			}
		}
		System.out.println("查询完毕，自动返回上一层");
	}

	//根据成绩从大到小查询
	@Override
	public void seeStudent2() {
		// TODO Auto-generated method stub
		
		Comparator<Student> a = new StudentByGrade();
		Collections.sort(StudentList,a);
		System.out.println("-------------------------------所有学生信息-------------------------------");
		System.out.println("|学号     |姓名     |年龄     |性别      |年级      |电话     |邮箱      |地址        |成绩      |注册时间  |修改时间 ");
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			if(StudentList != null) {
				System.out.println("---------------------------------------------------------------------");
				int id = StudentList.get(i).getId();
				String name = StudentList.get(i).getName();
				int age = StudentList.get(i).getAge();
				String sex = StudentList.get(i).getSex();
				String grade = StudentList.get(i).getGrade();
				int number = StudentList.get(i).getNumber();
				String email = StudentList.get(i).getEmail();
				String adress = StudentList.get(i).getAdress();
				int scores = StudentList.get(i).getScores();
				String registerTime = StudentList.get(i).getRegisterTime();
				String changeTime = StudentList.get(i).getChangeTime();
				System.out.println("|"+id+"|"+name+"|"+age+"|"+sex+"|"+grade+"|"+number+"|"+email+"|"+adress+"|"+scores+"|"+registerTime+"|"+changeTime);
				
			}
			
		}
		System.out.println("查询完毕，自动返回上一层");
	}

	//根据成绩从小到大查询
	@Override
	public void seeStudent3() {
		// TODO Auto-generated method stub
		
		Comparator<Student> a = new StudentByGrade1();
		Collections.sort(StudentList,a);
		System.out.println("-------------------------------所有学生信息-------------------------------");
		System.out.println("|学号     |姓名     |年龄     |性别      |年级      |电话     |邮箱      |地址        |成绩       |注册时间  |修改时间");
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			if(StudentList != null) {
				System.out.println("---------------------------------------------------------------------");
				int id = StudentList.get(i).getId();
				String name = StudentList.get(i).getName();
				int age = StudentList.get(i).getAge();
				String sex = StudentList.get(i).getSex();
				String grade = StudentList.get(i).getGrade();
				int number = StudentList.get(i).getNumber();
				String email = StudentList.get(i).getEmail();
				String adress = StudentList.get(i).getAdress();
				int scores = StudentList.get(i).getScores();
				String registerTime = StudentList.get(i).getRegisterTime();
				String changeTime = StudentList.get(i).getChangeTime();
				System.out.println("|"+id+"|"+name+"|"+age+"|"+sex+"|"+grade+"|"+number+"|"+email+"|"+adress+"|"+scores+"|"+registerTime+"|"+changeTime);
				
			}
			
		}
		System.out.println("查询完毕，自动返回上一层");
	}
	
	//删除学生信息

	@Override
	
	//删除学生信息
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			int _id = StudentList.get(i).getId();
			if(_id == id) {
				StudentList.remove(i);
				break;
			}
		}
		System.out.println("删除完毕，自动返回上一层");
		
	}

	//添加学生信息
	@Override
	public void addStudent(int id, String name, int age, String grade, String sex, int number, String email,
			String adress, int scores, String registerTime, String changeTime) {
		// TODO Auto-generated method stub
		
		
		StudentList.add(new Student(id, name, age, grade, sex, number, email, adress, scores, registerTime, changeTime));
		
	}
	
	//修改学生全部信息

	@Override
	public void changeStudent(int id, String name, int age, String grade, String sex, int number, String email,
			String adress, int scores, String changeTime) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			int _id = StudentList.get(i).getId();
			if(_id == id) {
				StudentList.get(i).setName(name);
				StudentList.get(i).setAge(age);
				StudentList.get(i).setGrade(grade);
				StudentList.get(i).setSex(sex);
				StudentList.get(i).setNumber(number);
				StudentList.get(i).setEmail(email);
				StudentList.get(i).setAdress(adress);
				StudentList.get(i).setScores(scores);
				StudentList.get(i).setChangeTime(changeTime);
				break;
			}
		}
		System.out.println("修改完毕，自动返回上一层");
		
	}
	
	//根据ID修改部分学生信息

	@Override
	public void changeStudent(int id, String atr, String data, String changeTime) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<StudentList.size();i++) {
			if(StudentList == null) {
				continue;
			}
			int _id = StudentList.get(i).getId();
			
			if(_id == id) {
				StudentList.get(i).setChangeTime(changeTime);
				if(atr.equals("name")) {
					StudentList.get(i).setName(data);
				}
				if(atr.equals("grade")) {
					StudentList.get(i).setGrade(data);
				}
				if(atr.equals("sex")) {
					StudentList.get(i).setSex(data);
				}
				if(atr.equals("email")) {
					StudentList.get(i).setEmail(data);
				}
				if(atr.equals("adress")) {
					StudentList.get(i).setAdress(data);
				}
				/*if(atr.equals("age")) {
				StudentList.get(i).setAge(data);
				}
				if(atr.equals("number")) {
				StudentList.get(i).setNumber(data);
				}
				if(atr.equals("scores")) {
				StudentList.get(i).setScores(data);
				}*/
				break;
			}
		}
		System.out.println("修改完毕，自动返回上一层");
	}

	
	
}

//成绩降序
class StudentByGrade implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		//按成绩从大到小排序
		return o2.getScores()-o1.getScores();
	}
	
}

//成绩升序
class StudentByGrade1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		//按成绩从大到小排序
		return o1.getScores()-o2.getScores();
	}
	
}

