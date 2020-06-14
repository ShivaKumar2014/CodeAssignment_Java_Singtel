package com.java.cd.test.codeassignment.model;

public class BirdM extends Animal implements WalkIF, SingIF {

	public void sing() {
		System.out.println("I am Singing");		
		
	}

	public void walk() {
		System.out.println("I am walking");
		
	}
}
