package com.java.cd.test.codeassignment.model;

public abstract class Animal {
	
	public enum Sex {MALE,FEMALE};
	protected Sex sex;
	
	public void setSex(Sex sex){
		this.sex = sex;
	}
	
	protected Sex getSex(){
		return sex;
	}

}
