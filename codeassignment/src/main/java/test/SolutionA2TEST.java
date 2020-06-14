package test;

import com.java.cd.test.codeassignment.model.Chicken;
import com.java.cd.test.codeassignment.model.Duck;

public class SolutionA2TEST {
	public static void main(String[] args) {
		Duck duck = new Duck();
		System.out.println("Duck");
		duck.sing();
		duck.swim();
		
		Chicken chicken = new Chicken();
		System.out.println("Chicken");
		chicken.walk();
		chicken.sing();
	}

}
