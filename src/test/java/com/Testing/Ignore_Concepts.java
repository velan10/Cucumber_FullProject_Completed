package com.Testing;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concepts {

	@Test
	private void facebook() {
System.out.println("Facebook");
	}
	
	@Test
	private void whatsapp() {
		System.out.println("whatsapp");
	}

	@Test
	private void spotify() {
		System.out.println("spotify");
	}

	@Test(enabled = false)
	private void wynkMusic() {
		System.out.println("Wynk Music");
	}

	@Ignore
	@Test
	private void books() {
		System.out.println("Books");
	}

}
