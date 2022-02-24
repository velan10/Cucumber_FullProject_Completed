package com.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Adactin_Pojo.DeleteBaseclass;

public class delete extends DeleteBaseclass{
public static void main(String[] args) {
	
	Browser("chrome");
	maxi();
	//quit();
	url("https://www.google.com/");
	WebElement searchcontent = driver.findElement(By.xpath("//input[@type='text']"));
sendkeys(searchcontent, "I LOVE YOU");
}
}
