package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
@BeforeClass
public void BeforeClasss() {
	System.out.println("BEfore executiong alll methods in the class");
}
	
	@Test
	public void WebloginCarLoan() {
			
		System.out.println("Weblogin");
	}
	
	@Test
	public void MobileCarlogin() {
		System.out.println("Mobilelogin");
	}
	
	@BeforeMethod
	public void prerequestmethod() {
		System.out.println("Before every methods");
	}
	
	@Test(groups= {"smoke"})
	public void WebApicarloan() {
		System.out.println("Apilogin");
	}
	
	@BeforeTest
	public void prerequest() {
		System.out.println("i am no 1");
	}
	
	@BeforeSuite
	public void prerequestssss() {
		System.out.println("i will run first");
	}
}
