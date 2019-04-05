package com.neuedu.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import com.neuedu.pojo.Student;
import com.neuedu.service.StudentBiz;

public class StudentBizImpl implements StudentBiz {

	//����ѧ������
	public List<Student> StudentList = new LinkedList<Student>();
	
	//����ģʽ
	private static StudentBizImpl studentBizImpl;
	
	//�����ṩ��ȡʵ������     �̰߳�ȫ
	public static synchronized StudentBizImpl getIntance() {
		
		if(studentBizImpl == null) {
			studentBizImpl = new StudentBizImpl();
		}
		return studentBizImpl;
	}
	
	//��ʼ������
	private StudentBizImpl() {
		
		StudentList.add(new Student(1,"����",18, "����", "��", 139, "116@qq.com", "����", 95));
		StudentList.add(new Student(2,"����",18, "����", "Ů", 139, "116@qq.com", "����", 97));
		StudentList.add(new Student(3,"����",18, "����", "Ů", 139, "116@qq.com", "����", 96));
		
	}

	//�鿴ȫ��ѧ����Ϣ
	@Override
	public void seeStudent() {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------------����ѧ����Ϣ-------------------------------");
		System.out.println("|ѧ��     |����     |����     |�Ա�      |�꼶      |�绰     |����      |��ַ        |�ɼ�      |ע��ʱ��  |�޸�ʱ�� ");
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
		System.out.println("��ѯ��ϣ��Զ�������һ��");
	}

	//����ID�鿴ѧ����Ϣ
	@Override
	public void seeStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------����ѧ����Ϣ-------------------------------");
		System.out.println("|ѧ��     |����     |����     |�Ա�      |�꼶      |�绰     |����      |��ַ        |�ɼ�      |ע��ʱ��  |�޸�ʱ�� ");
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
		System.out.println("��ѯ��ϣ��Զ�������һ��");
	}

	//����ID��ѯ����
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
		System.out.println("��ѯ��ϣ��Զ�������һ��");
	}

	//���ݳɼ��Ӵ�С��ѯ
	@Override
	public void seeStudent2() {
		// TODO Auto-generated method stub
		
		Comparator<Student> a = new StudentByGrade();
		Collections.sort(StudentList,a);
		System.out.println("-------------------------------����ѧ����Ϣ-------------------------------");
		System.out.println("|ѧ��     |����     |����     |�Ա�      |�꼶      |�绰     |����      |��ַ        |�ɼ�      |ע��ʱ��  |�޸�ʱ�� ");
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
		System.out.println("��ѯ��ϣ��Զ�������һ��");
	}

	//���ݳɼ���С�����ѯ
	@Override
	public void seeStudent3() {
		// TODO Auto-generated method stub
		
		Comparator<Student> a = new StudentByGrade1();
		Collections.sort(StudentList,a);
		System.out.println("-------------------------------����ѧ����Ϣ-------------------------------");
		System.out.println("|ѧ��     |����     |����     |�Ա�      |�꼶      |�绰     |����      |��ַ        |�ɼ�       |ע��ʱ��  |�޸�ʱ��");
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
		System.out.println("��ѯ��ϣ��Զ�������һ��");
	}
	
	//ɾ��ѧ����Ϣ

	@Override
	
	//ɾ��ѧ����Ϣ
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
		System.out.println("ɾ����ϣ��Զ�������һ��");
		
	}

	//���ѧ����Ϣ
	@Override
	public void addStudent(int id, String name, int age, String grade, String sex, int number, String email,
			String adress, int scores, String registerTime, String changeTime) {
		// TODO Auto-generated method stub
		
		
		StudentList.add(new Student(id, name, age, grade, sex, number, email, adress, scores, registerTime, changeTime));
		
	}
	
	//�޸�ѧ��ȫ����Ϣ

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
		System.out.println("�޸���ϣ��Զ�������һ��");
		
	}
	
	//����ID�޸Ĳ���ѧ����Ϣ

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
		System.out.println("�޸���ϣ��Զ�������һ��");
	}

	
	
}

//�ɼ�����
class StudentByGrade implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		//���ɼ��Ӵ�С����
		return o2.getScores()-o1.getScores();
	}
	
}

//�ɼ�����
class StudentByGrade1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		//���ɼ��Ӵ�С����
		return o1.getScores()-o2.getScores();
	}
	
}

