package com.Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "testData")
	private void data(String username,int password) {
System.out.println("Username :"+username);
System.out.println("Password :"+password);
	
	
	
	}
@DataProvider	
private Object[][] testData() {
	
return new Object[][] {
	{"velan",565465895},
	{"velli",4586952}
};
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
