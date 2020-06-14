package com.java.cd.test.codeassignment.model;

public class Duck extends BirdM implements SwimIF{
	
	
	@Override
	public void sing(){
		System.out.println("Quack, quack");
	}

	public void swim() {
		System.out.println("I can swim");
		
	}
}
