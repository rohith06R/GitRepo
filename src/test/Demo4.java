package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo4 {
	@Test
	public void WebloginHomeLoan() {
			
		System.out.println("Weblogin");
	}
	
	@Test
	public void MobileHomelogin() {
		System.out.println("Mobilelogin");
	}
	
	@Test
	public void WebApiHomeloan() {
		System.out.println("Apilogin");
	}
	
	
	@AfterTest
	public void third() {
		System.out.println("Last");
	}
}
