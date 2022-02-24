package com.Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Testing {

  // Simple Annotations
 
	@BeforeClass
 	private void url() {
System.out.println("facebook Url");
	}
	
	@BeforeTest
	private void browserlunch() {
System.out.println("Chrome Browser");
	}

	
	@BeforeMethod
	private void login() {
		System.out.println("login");
		
	}
	@Test
	private void bwomen() {
System.out.println("women");
	}
//	@BeforeSuite
//	private void setProperty() {
//System.out.println("ChromeDriver");
//	}
//	
	@Test
	private void amen() {
System.out.println("men");
	}
	
	@Test
	private void cKids() {
System.out.println("Kids");
	}
	
	
	@AfterMethod
	private void logout() {

		System.out.println("logout");
	}
	
@AfterClass
private void verifyingHomepage() {
System.out.println("verify home page");
}
@AfterTest
private void close() {
System.out.println("close");
}
//@AfterSuite
//	private void deleteAllCookies() {
//System.out.println("Deleted All Cookies");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
