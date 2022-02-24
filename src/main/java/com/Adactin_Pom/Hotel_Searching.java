package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Searching {
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement room_type;
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	@FindBy(name = "datepick_in")
	private WebElement datecheckin;
	@FindBy(name = "datepick_out")
	private WebElement datecheckout;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(name = "child_room")
	private WebElement childroom;
	@FindBy(name = "Submit")
	private WebElement Submit;

	
	public Hotel_Searching(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDatecheckin() {
		return datecheckin;
	}
	public WebElement getDatecheckout() {
		return datecheckout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return Submit;
	}

}
