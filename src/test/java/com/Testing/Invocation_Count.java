package com.Testing;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	
@Test(priority = -1)
private void browserLunch() {
System.out.println("Browser Lunches");

}

@Test(priority = 0)
private void url() {
System.out.println("Url");

}
@Test(priority = 5,invocationCount = 3)
private void refreshdone() {
System.out.println("Refresh done");

}


}
