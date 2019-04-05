package com.neuedu.pojo;

public class Student {

	public int id;
	public String name;
	public int age;
	public String grade;
	public String sex;
	public int number;
	public String email;
	public String adress;
	public int scores;
	public String registerTime;
	private String changeTime;
	
	public Student() {
		super();
	}

	public Student(int id, String name, int age, String grade, String sex, int number, String email, String adress,
			int scores) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.sex = sex;
		this.number = number;
		this.email = email;
		this.adress = adress;
		this.scores = scores;
	}

	public Student(int id, String name, int age, String grade, String sex, int number, String email, String adress,
			int scores, String registerTime, String changeTime) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.sex = sex;
		this.number = number;
		this.email = email;
		this.adress = adress;
		this.scores = scores;
		this.registerTime = registerTime;
		this.changeTime = changeTime;
	}

	public String getChangeTime() {
		return changeTime;
	}

	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}
	
	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	
	
	
}
