package com.neuedu.pojo;

public enum ClassEnum {

	MAN("男"),
	WOMAN("女"),
	PRIMARY("初级"),
	INTERMEDIAT("中级"),
	SENIOR("高级")
	;
	
	public String classEnum;
	
	ClassEnum(String classEnum){
		this.classEnum = classEnum;
	}
	
	public String getClassEnum() {
		return this.classEnum;
	}
	
}
