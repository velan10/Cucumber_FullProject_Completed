package com.Filereader;

import org.openqa.selenium.WebDriver;

import com.Adactin_Pom.Adactin_LoginPage;
import com.Adactin_Pom.BookHotel_PersonalDetails;
import com.Adactin_Pom.Booking_Conform;
import com.Adactin_Pom.Finally_BookedItinerary;
import com.Adactin_Pom.Hotel_Searching;
import com.Adactin_Pom.Hotel_Selection;

public class Page_Object_manager {
public static WebDriver driver;
	private Adactin_LoginPage login;
	private BookHotel_PersonalDetails details;
	private Booking_Conform conform;

	private Finally_BookedItinerary finallybook;
	private Hotel_Searching searching;
	private Hotel_Selection selection;
	
	
	
	public Page_Object_manager(WebDriver driver2) {
	this.driver= driver2;
	}
	public Adactin_LoginPage getLogin() {
		if (login ==null) {
			 login = new Adactin_LoginPage(driver);
		}		return login;
	}
	public BookHotel_PersonalDetails getDetails() {
		if (details==null) {
			details = new BookHotel_PersonalDetails(driver);
		}
		return details;
	}
	public Booking_Conform getConform() {
		if (conform==null) {
			conform= new Booking_Conform(driver);
			
		}
		return conform;
	}
	public Finally_BookedItinerary getFinallybook() {
		
		if (finallybook==null) {
			finallybook = new Finally_BookedItinerary(driver);
			
		}	
		return finallybook;
	}
	public Hotel_Searching getSearching() {
	if (searching==null) {
		searching= new Hotel_Searching(driver);
		
	}
		return searching;
	}
	public Hotel_Selection getSelection() {
		if (selection==null) {
			selection= new Hotel_Selection(driver);	
		}
		
		return selection;
	}
	
}
