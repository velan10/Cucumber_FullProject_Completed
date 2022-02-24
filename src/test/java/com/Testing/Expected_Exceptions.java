package com.Testing;

import org.testng.annotations.Test;

public class Expected_Exceptions {

	
	@Test(expectedExceptions = NullPointerException.class)
	private void demo() {
		
	
int age =10;
System.out.println(age/0);
	}
}
