package com.Testing;

import org.testng.annotations.Test;

public class Dependency_Testing {
	
	@Test
	private void browserLunch() {
	System.out.println("Browser Lunches");

	}

	@Test(dependsOnMethods = "browserLunch")
	private void url() {
	System.out.println("Url");

	}
	@Test(dependsOnMethods = "url")
	private void refreshdone() {
	System.out.println("Refresh done");

	}
	
	
	@Test
	private void freshdone() {
	System.out.println("fresh done");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
