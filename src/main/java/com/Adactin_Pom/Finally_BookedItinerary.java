package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finally_BookedItinerary {
	public WebDriver driver;
	@FindBy(name = "logout")
	private WebElement logout;
	
	public Finally_BookedItinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLogout() {
		return logout;
	}

}
