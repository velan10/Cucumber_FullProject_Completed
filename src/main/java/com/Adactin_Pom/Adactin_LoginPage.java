package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_LoginPage {
	public WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login_button;
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement location;
	
	public Adactin_LoginPage(WebDriver driver2) {
		this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
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
}
