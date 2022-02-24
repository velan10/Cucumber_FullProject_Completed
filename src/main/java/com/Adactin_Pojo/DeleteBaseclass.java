package com.Adactin_Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DeleteBaseclass {
	public static WebDriver driver;  //-> null 
	
	public static WebDriver Browser(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromeDriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "path");
			driver = new FirefoxDriver();

		}else if (type.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", "path");
			driver = new InternetExplorerDriver();

		}
		return driver;
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}

	public static void Clickonelement(WebElement element) {
		element.click();
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void gettext() {

	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void url(String Url) {
		driver.get(Url);
	}

	public static void geturl() {

	}

	

}
