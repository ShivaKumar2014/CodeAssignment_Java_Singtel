package com.java.cd.test.codeassignment.model;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
	public static List<Animal> animals;
	
	public static Animal getAnimal(String type) {
		if(type.equals("BIRD"))
			return new BirdM();
		else if (type.equals("DUCK"))
			return new Duck();
		else if (type.equals("CHICKEN"))
			return new Chicken();
		else if (type.equals("PARROT"))
			return new Parrot();
		else if (type.equals("FISH"))
			return new Fish();
		else if (type.equals("SHARKFISH"))
			return new SharkFish();
		else if (type.equals("CLOWNFISH"))
			return new ClownFish();
		else if (type.equals("DOLPHIN"))
			return new Dolphins();
		else
			return null;
	}
	
	public static void main(String[] args) {
		animals = new ArrayList<Animal>();
		animals.add(getAnimal("BIRD"));
		animals.add(getAnimal("DUCK"));
		animals.add(getAnimal("CHICKEN"));
		animals.add(getAnimal("PARROT"));
		animals.add(getAnimal("FISH"));
		animals.add(getAnimal("SHARKFISH"));
		animals.add(getAnimal("CLOWNFISH"));
		animals.add(getAnimal("DOLPHIN"));
		animals.add(getAnimal("BUTTERFLY"));
		animals.add(getAnimal("CATERPILLAR"));
		
		int fly = 0,sing = 0,swim = 0,walk = 0;
		
		for(Animal animal : animals ){
			if (animal instanceof FlyIF)
				fly++;
			if(animal instanceof SwimIF)
				swim++;
			if(animal instanceof SingIF)
				sing++;
			if(animal instanceof WalkIF)
				walk++;
		}
		
		System.out.println("No of animals that can  fly is " + fly);
		System.out.println("No of animals that can  sing is " + sing);
		System.out.println("No of animals that can  swim is " + swim);
		System.out.println("No of animals that can  walk is " + walk);
	}

}
