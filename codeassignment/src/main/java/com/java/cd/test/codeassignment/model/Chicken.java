package com.java.cd.test.codeassignment.model;

public class Chicken extends BirdM {@Override
	public void sing(){
	if(this.getSex() == Sex.FEMALE)
		System.out.println("Cluck, cluck");
	else
		System.out.println("Cock-a-doodle-doo");
}}	
	
