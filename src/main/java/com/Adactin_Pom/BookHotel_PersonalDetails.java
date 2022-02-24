package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_PersonalDetails {
	public WebDriver driver;
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
	
	public BookHotel_PersonalDetails(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
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
}
