package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Basic {

	
	
	
	@Test(groups= {"smoke"})
	public void Demo() {
		
		System.out.println("hello");
	}
   @Test
	public void second() {
		
		System.out.println("Hi");
	}

  @AfterSuite
public void prerequestSuite() {
	System.out.println("i am no last no 1");
}
}
