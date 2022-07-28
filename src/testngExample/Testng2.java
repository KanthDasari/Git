package testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng2 {
	@BeforeClass
	public void login() {
		System.out.println("Login Completed");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout Completed");
	}
	@Test
	public void addemp() {
		System.out.println("Add Emp");
		
	}
	@Test
	public void delemp() {
		System.out.println("Del Emp");
	}

}
