package com.java.cd.test.codeassignment.model;

public class ParrotLivingWithDog extends ParrotDecorator {

	public ParrotLivingWithDog(Bird parrot) {
		super(parrot);
	}

	@Override
	public void sing(){
		System.out.println(" Woof, woof");
	}
}
