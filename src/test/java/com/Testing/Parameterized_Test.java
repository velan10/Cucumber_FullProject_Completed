package com.Testing;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({"username","password","ganesh"})
	private void credentias(@Optional("VElli")String user,@Optional("VElli@1995")String password,@Optional("***")String off) {

		System.out.println("The username is :" + user);
		System.out.println("The Pasword is :" + password);
		System.out.println("The Dash is :" + off);
		
	}
}
