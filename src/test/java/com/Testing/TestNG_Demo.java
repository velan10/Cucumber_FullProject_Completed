package com.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Adactin_Pojo.Home_Pojo;

public class TestNG_Demo {

	WebDriver driver;
	
	
	@Test()
	private void openChrome() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");	
	}
	
	
	
	@Test
	private void title() {
 String til = driver.getTitle();
	System.out.println("The title is :"+til);
	Assert.assertEquals(til, "Facebook – log in or sign up");
	}
			
	@Test(priority = 1)
	private void isdisp() {
	WebElement element = driver.findElement(By.id("email"));
	boolean displayed = element.isDisplayed();
System.out.println("Is displayed :"+displayed);	}
	
	@Test(priority = -1)
	private void user(String name) {
	driver.findElement(By.id("email")).sendKeys(name);
	driver.findElement(By.id("pass")).sendKeys("Velan@123456");
	
	}


	@AfterMethod
	private void browserClose() {
driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
