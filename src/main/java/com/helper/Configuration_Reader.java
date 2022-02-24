package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
//consector line
	
	public Configuration_Reader() throws Throwable{


		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
	}
	
	public String getUrl()  {


		String url = p.getProperty("url");
		System.out.println(url);
		return url;

	}

	public String getusername()  {

		
		String username = p.getProperty("username");
		System.out.println(username);
		return username;

	}

	public String getpasswword()  {

		
		 
		String password = p.getProperty("password");
		System.out.println(password);
		 return password;
	}

	public String getfirstname() {
		String firstname = p.getProperty("firstname");
	System.out.println(firstname);
		return firstname;
	
	}

	public String getlastname() {
		String lastname = p.getProperty("lastname");
	System.out.println(lastname);
		return lastname;
	
	}

	public String getaddress() {
		String address = p.getProperty("address");
	System.out.println(address);
		return address;
	
	}

	public String getcreditcard_number() {
		String cardnumber = p.getProperty("creditcard_number");
	System.out.println(cardnumber);
		return cardnumber;
	
	}

	public String getcvv() {
		String cardcvv = p.getProperty("cvv");
	System.out.println(cardcvv);
		return cardcvv;
	
	}

}
