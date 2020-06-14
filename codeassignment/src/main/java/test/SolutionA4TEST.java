package test;

import com.java.cd.test.codeassignment.model.Bird;
import com.java.cd.test.codeassignment.model.ParrotLivingWithCat;
import com.java.cd.test.codeassignment.model.ParrotLivingWithDog;
import com.java.cd.test.codeassignment.model.ParrotLivingWithRooster;

public class SolutionA4TEST {

	public static void main(String[] args) {
	
		ParrotLivingWithDog parrotLivingWithDog = new ParrotLivingWithDog(new Bird());
		System.out.println("parrotLivingWithDog");
		parrotLivingWithDog.sing();
		
		ParrotLivingWithCat parrotLivingWithCat = new ParrotLivingWithCat(new Bird());
		System.out.println("parrotLivingWithCat");
		parrotLivingWithCat.sing();
		
		ParrotLivingWithRooster parrotLivingWithRooster = new ParrotLivingWithRooster(new Bird());
		System.out.println("parrotLivingWithRooster");
		parrotLivingWithRooster.sing();
	}

}
