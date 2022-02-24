package com.Testing;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups ={"Homepage"})
private void homepage() {
System.out.println("Homepage testing");
}
	@Test(groups ={"Homepage"})
	private void homepage1() {
System.out.println("Homepage testing");
	}
	@Test(groups ={"Loginpage"})
private void loginpage() {
System.out.println("LoginPage Testing");
}
	@Test(groups ={"Loginpage"})
private void loginpage1() {
System.out.println("LoginPage Testing");
}
	@Test(groups ={"Vivo"})
private void vivo1() {
System.out.println("vivo Testing");
}
	@Test(groups ={"Vivo"})
private void vivo2() {
System.out.println("vivo Testing");
}
	@Test(groups ={"Lenovo"})
private void lenovo1() {
System.out.println("Lenovo Testing");
}
	@Test
private void lenovo2() {
System.out.println("Lenovo Testing");
}



}
