package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Selection {
	public WebDriver driver;
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(name = "continue")
	private WebElement continue_Button;
	
	public Hotel_Selection(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinue_Button() {
		return continue_Button;
	}
}
