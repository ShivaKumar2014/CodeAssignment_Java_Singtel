package test;

import com.java.cd.test.codeassignment.model.Chicken;
import com.java.cd.test.codeassignment.model.Animal.Sex;

public class SolutionA3TEST {
	
	public static void main(String[] args) {
		
		Chicken chicken = new Chicken();
		chicken.setSex(Sex.FEMALE);
		System.out.println("Chicken");
		chicken.sing();
		Chicken rooster = new Chicken();
		rooster.setSex(Sex.MALE);
		System.out.println("Rooster");
		rooster.sing();
	}

}
