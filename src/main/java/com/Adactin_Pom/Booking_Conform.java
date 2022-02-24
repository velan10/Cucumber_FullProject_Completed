package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conform {
	public WebDriver driver;
	@FindBy(name = "my_itinerary")
	private WebElement my_itinerary;

	public Booking_Conform(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
}
