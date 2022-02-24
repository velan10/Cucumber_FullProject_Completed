package com.Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Priority_Features {
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
		
	}
	@Test(priority = 0)
	private void awomen() {
System.out.println("women");
	}
	
	@Test(priority = -1)
	private void men() {
System.out.println("men");
	}
	
	@Test
	private void Kids() {
System.out.println("Kids");
	}
	
	
	@AfterMethod
	private void logout() {

		System.out.println("logout");
	}
	
}
