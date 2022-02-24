package com.Adactin_Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Pojo {
	public WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login_button;
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
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(name = "continue")
	private WebElement continue_Button;
	@FindBy(name = "first_name")
	private WebElement first_name;
	@FindBy(name = "last_name")
	private WebElement last_name;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement cc_num;
	@FindBy(name = "cc_type")
	private WebElement cc_type;
	@FindBy(name = "cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(name = "cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(name = "cc_cvv")
	private WebElement cc_cvv;
	@FindBy(name = "book_now")
	private WebElement book_now;
	@FindBy(name = "my_itinerary")
	private WebElement my_itinerary;
	@FindBy(name = "logout")
	private WebElement logout;

	public Home_Pojo(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
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

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue_Button() {
		return continue_Button;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

}
