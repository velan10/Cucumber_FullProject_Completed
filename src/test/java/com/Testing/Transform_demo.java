package com.Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Transform_demo {

	@Test
	private void username() {
		 String exp_Username ="starc";
		 
		 String actual_Username = "smith";
		 
		// Assert.assertEquals(actual_Username, exp_Username);
		Assert.assertEquals(exp_Username, actual_Username);
	}
	
	
	@Test
	private void password() {
		 String exp_Password ="starc@123";
		 
		 String actual_Password = "smith@123";
		 Assert.assertEquals(exp_Password, actual_Password);
		// Assert.assertEquals(actual_Password, exp_Password);
				 
	}
	
	
}
