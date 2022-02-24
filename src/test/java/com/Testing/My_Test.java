package com.Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {

	
	@Test(retryAnalyzer = Rerun.class)
	private void username() {
		 String exp_Username ="starc";
		 
		 String actual_Username = "smith";
		 
		// Assert.assertEquals(actual_Username, exp_Username);
		Assert.assertEquals(exp_Username, actual_Username);
	}
	
	
	@Test(retryAnalyzer = Rerun.class)
	private void password() {
		 String exp_Password ="starc@123";
		 
		 String actual_Password = "smith@123";
		 Assert.assertEquals(exp_Password, actual_Password);
		// Assert.assertEquals(actual_Password, exp_Password);
				 
	}
	
	
	
	
	
	
	
}
