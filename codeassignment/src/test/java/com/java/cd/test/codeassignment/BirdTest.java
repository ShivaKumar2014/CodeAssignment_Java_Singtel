package com.java.cd.test.codeassignment;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.java.cd.test.codeassignment.model.Bird;

/**
 * Unit test for simple App.
 */
public class BirdTest
{
	
	@Test
	public void testFly() {
		Bird b = new Bird();
		
		assertThat(b.fly()).isEqualToIgnoringCase("I am flying");
	}
	
	@Test
	public void testSing() {
		Bird b = new Bird();
		
		assertThat(b.sing()).isEqualToIgnoringCase("I am singing");
	}


    
}
