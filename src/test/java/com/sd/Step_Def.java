package com.sd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Adactin_Baseclass.BaseClass;
import com.Adactin_Pom.Adactin_Separate_Method;
import com.Cucumber.Test_Runner;
import com.Filereader.Page_Object_manager;
import com.helper.File_Reader_Manager;
import com.practice_cucumber.Tester;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Step_Def extends BaseClass {
	
	public static WebDriver driver= Tester.driver;
	
	
	public static Page_Object_manager pom = new Page_Object_manager(driver);

	
	@Before
	public void beforeHooks(Scenario s) {
String name = s.getName();
System.out.println("Scenario Name :"+name);
System.out.println("Scenario Started");
	
	}
	
	@After
	public void afterhooks(Scenario s) throws Throwable {
		
	if (s.isFailed()) {
		//screenshot("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\Screenshot");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\Screenshot");
		FileUtils.copyFile(source, destination);
		
	}	
	String status = s.getStatus();
	System.out.println("Scenario Name  :"+status);
	}
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
	implicitwait(30);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		String getusername = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		inputvalues(pom.getLogin().getUsername(), username);

	}
	@When("^user Enter The \"([^\"]*)\"In Password Filed$")
	public void user_Enter_The_In_Password_Filed(String password) throws Throwable {
		String getpassword = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpasswword();
		inputvalues(pom.getLogin().getPassword(), password);	
	}


	@When("^user Enter The \"([^\"]*)\"Password\"([^\"]*)\"In Password Filed$")
	public void user_Enter_The_Password_In_Password_Filed(String password) throws Throwable {
		String getpassword = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpasswword();
		inputvalues(pom.getLogin().getPassword(), password);	

	}

	
	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOptions(pom.getLogin().getLogin_button());
	}
	@When("^user Search And Select The Location> In Location Dialbox \"([^\"]*)\"$")
	public void user_Search_And_Select_The_Location_In_Location_Dialbox(String location) throws Throwable {
		dropselect(pom.getSearching().getLocation(), "byvisibletext", location);
	}

//	@When("^user Search And Select The Location In Location Dialbox$")
//	public void user_Search_And_Select_The_Location_In_Location_Dialbox(String location) throws Throwable {
//		dropselect(pom.getSearching().getLocation(), "byvisibletext", location);
//	
//	}
	@Given("^user Search And Select The Hotels In The Hotel Dialbox$")
	public void user_Search_And_Select_The_Hotels_In_The_Hotel_Dialbox() throws Throwable {
		dropselect(pom.getSearching().getHotel(), "byvalue", "Hotel Hervey");

	}

	@Given("^user Search And Select The Roomtype  In The Roomtype Dialbox$")
	public void user_Search_And_Select_The_Roomtype_In_The_Roomtype_Dialbox() throws Throwable {
		dropselect(pom.getSearching().getRoom_type(), "byvisibletext", "Deluxe");

	}

	@Given("^user Search And Select The Number_Of_Rooms  In The Numberofrooms Dialbox$")
	public void user_Search_And_Select_The_Number_Of_Rooms_In_The_Numberofrooms_Dialbox() throws Throwable {
		dropselect(pom.getSearching().getRoom_nos(), "byvalue", "5");

	}

	@When("^user  Select The Check_In_Date  In The Checkindate Dialbox$")
	public void user_Select_The_Check_In_Date_In_The_Checkindate_Dialbox() throws Throwable {
	

		delete(pom.getSearching().getDatecheckin());
		inputvalues(pom.getSearching().getDatecheckin(), "25/12/2021");
	}

	@When("^user  Select The Check_Out_Date  In The Check_Out_Date Dialbox$")
	public void user_Select_The_Check_Out_Date_In_The_Check_Out_Date_Dialbox() throws Throwable {
		delete(pom.getSearching().getDatecheckout());
		inputvalues(pom.getSearching().getDatecheckout(), "30/12/2021");
		}

	@When("^user Select Adults_Per_Room  In The Dialbox$")
	public void user_Select_Adults_Per_Room_In_The_Dialbox() throws Throwable {
		dropselect(pom.getSearching().getAdultroom(), "byvalue", "2");
	}

	@When("^user Select The Children_Room In The Correct Dialbox$")
	public void user_Select_The_Children_Room_In_The_Correct_Dialbox() throws Throwable {
		dropselect(pom.getSearching().getChildroom(), "by value", "1");
	}

	@Then("^user Click The Search_Button And It Navigate To HotelSelection Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_HotelSelection_Page() throws Throwable {
		clickOptions(pom.getSearching().getSubmit());
	}

	@When("^user Select The Radi_Button In the Selected Hotel_List$")
	public void user_Select_The_Radi_Button_In_the_Selected_Hotel_List() throws Throwable {
		clickOptions(pom.getSelection().getRadiobutton());
	}

	@Then("^user Click The Continue Button And  It navigate To The Payment Details$")
	public void user_Click_The_Continue_Button_And_It_navigate_To_The_Payment_Details() throws Throwable {
		clickOptions(pom.getSelection().getContinue_Button());
	}

	@When("^user Enter The Firstname In The Firstname Field$")
	public void user_Enter_The_Firstname_In_The_Firstname_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		inputvalues(pom.getDetails().getFirst_name(), firstname);
	}

	@When("^user Enter The Lastname In The Lastname Field$")
	public void user_Enter_The_Lastname_In_The_Lastname_Field() throws Throwable {
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		inputvalues(pom.getDetails().getLast_name(), lastname);
	}

	@When("^user Enter The Billing-Address In The Billing_Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getaddress();
		
		inputvalues(pom.getDetails().getAddress(), address);
	}

	@When("^user Enter The Card_Number In The Card_Number Field$")
	public void user_Enter_The_Card_Number_In_The_Card_Number_Field() throws Throwable {
		String cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcreditcard_number();

		inputvalues(pom.getDetails().getCc_num(), cardnumber);
	}

	@When("^user Select The Card_Type In The Card_Type Field$")
	public void user_Select_The_Card_Type_In_The_Card_Type_Field() throws Throwable {
		dropselect(pom.getDetails().getCc_type(), "byvalue", "VISA");
	}

	@When("^user Select The Expiry_Date And Month$")
	public void user_Select_The_Expiry_Date_And_Month() throws Throwable {
		dropselect(pom.getDetails().getCc_exp_month(), "byvisibletext", "December");
		dropselect(pom.getDetails().getCc_exp_year(), "byvalue", "2022");
	}

	@When("^user Enter The Card_CVV In The Filed$")
	public void user_Enter_The_Card_CVV_In_The_Filed() throws Throwable {
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvv();

		inputvalues(pom.getDetails().getCc_cvv(), cvv);
	}

	@Then("^user Click The Booknow Button And It Navigate To The Booking Conformation Page$")
	public void user_Click_The_Booknow_Button_And_It_Navigate_To_The_Booking_Conformation_Page() throws Throwable {
		clickOptions(pom.getDetails().getBook_now());
	}


	@When("^user Click The Itinerary Button It Navigate To Booked Itinerary$")
	public void user_Click_The_Itinerary_Button_It_Navigate_To_Booked_Itinerary() throws Throwable {
		clickOptions(pom.getConform().getMy_itinerary());
	}

	@Then("^user Finally Click The Logout Button$")
	public void user_Finally_Click_The_Logout_Button() throws Throwable {
		clickOptions(pom.getFinallybook().getLogout());
	}


}
