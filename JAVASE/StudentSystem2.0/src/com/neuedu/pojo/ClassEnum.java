package com.neuedu.pojo;

public enum ClassEnum {

	MAN("��"),
	WOMAN("Ů"),
	PRIMARY("����"),
	INTERMEDIAT("�м�"),
	SENIOR("�߼�")
	;
	
	public String classEnum;
	
	ClassEnum(String classEnum){
		this.classEnum = classEnum;
	}
	
	public String getClassEnum() {
		return this.classEnum;
	}
	
}
