package com.neuedu.pojo;

public class User {

	public int id;  //Ñ§ºÅ
	public String name;
	public int age; 
	public String sex;
	public String grade;
	public int number;
	public String email;
	public String adress;
	
	public User() {
		super();
	}

	public User(int id, String name, int age, String sex, String grade, int number, String email, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
		this.number = number;
		this.email = email;
		this.adress = adress;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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
	
	
	

}
