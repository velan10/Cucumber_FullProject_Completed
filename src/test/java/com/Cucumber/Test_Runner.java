package com.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\Cucumber_Project\\Adactin.feature",
glue = "com.stepdef",

monochrome = true,
dryRun = false,
strict = false,
plugin = {
		"html:Report/Html_Report",
		"pretty", //console
		"json:Reports/JsonReport.json"
}

	
)
public class Test_Runner {

	public static WebDriver driver;
	@BeforeClass
	public  static void set_up() {
		driver = BaseClass.getBrowser("Chrome");
	}
	@AfterClass
	public static void tear_Down() {
		//driver.close();
	}
}
