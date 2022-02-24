package com.Adactin_Pom;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Adactin_Baseclass.BaseClass;
import com.Filereader.Page_Object_manager;
import com.helper.File_Reader_Manager;

public class Runner_Cucumber extends BaseClass {

	public static WebDriver driver = getBrowser("Chrome");
	public static Page_Object_manager pom = new Page_Object_manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Separate_Method.class);

	public static void main(String[] args) throws Throwable {
//		getBrowser("Chrome");
		PropertyConfigurator.configure("log4j.properties");
		implicitwait(30);
		log.info("Browser Launch");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
		log.info("Url Launch Successfully ");

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		inputvalues(pom.getLogin().getUsername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpasswword();
		inputvalues(pom.getLogin().getPassword(), password);
		clickOptions(pom.getLogin().getLogin_button());
		dropselect(pom.getSearching().getLocation(), "byvisibletext", "New York");
		dropselect(pom.getSearching().getHotel(), "byvalue", "Hotel Hervey");
		dropselect(pom.getSearching().getRoom_type(), "byvisibletext", "Deluxe");
		dropselect(pom.getSearching().getRoom_nos(), "byvalue", "5");
		delete(pom.getSearching().getDatecheckin());
		inputvalues(pom.getSearching().getDatecheckin(), "25/12/2021");
		delete(pom.getSearching().getDatecheckout());
		inputvalues(pom.getSearching().getDatecheckout(), "30/12/2021");
		dropselect(pom.getSearching().getAdultroom(), "byvalue", "2");
		dropselect(pom.getSearching().getChildroom(), "by value", "1");
		clickOptions(pom.getSearching().getSubmit());
		clickOptions(pom.getSelection().getRadiobutton());
		clickOptions(pom.getSelection().getContinue_Button());
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		inputvalues(pom.getDetails().getFirst_name(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		inputvalues(pom.getDetails().getLast_name(), lastname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getaddress();

		inputvalues(pom.getDetails().getAddress(), address);
		String cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcreditcard_number();

		inputvalues(pom.getDetails().getCc_num(), cardnumber);
		dropselect(pom.getDetails().getCc_type(), "byvalue", "VISA");
		dropselect(pom.getDetails().getCc_exp_month(), "byvisibletext", "December");
		dropselect(pom.getDetails().getCc_exp_year(), "byvalue", "2022");
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvv();

		inputvalues(pom.getDetails().getCc_cvv(), cvv);
		clickOptions(pom.getDetails().getBook_now());
		clickOptions(pom.getConform().getMy_itinerary());
		clickOptions(pom.getFinallybook().getLogout());
		driver.quit();

	}
}
