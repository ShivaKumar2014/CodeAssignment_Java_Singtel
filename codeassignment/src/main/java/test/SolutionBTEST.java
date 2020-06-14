package test;

import com.java.cd.test.codeassignment.model.Bird;
import com.java.cd.test.codeassignment.model.ClownFish;
import com.java.cd.test.codeassignment.model.Fish;
import com.java.cd.test.codeassignment.model.Fish.Colour;
import com.java.cd.test.codeassignment.model.Fish.Size;
import com.java.cd.test.codeassignment.model.SharkFish;

public class SolutionBTEST {
	
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.walk();
		bird.sing();
		bird.fly();
		
		
		Fish fish = new Fish();
		System.out.println("Fish");
		fish.swim();
		
		ClownFish clownFish = new ClownFish(Size.SMALL, Colour.ORANGE);
		System.out.println("clownFish");
		clownFish.makeJokes();
		
		SharkFish sharkFish = new SharkFish(Size.LARGE, Colour.GREY);
		System.out.println("sharkFish");
		sharkFish.eat(clownFish);
	}

}
