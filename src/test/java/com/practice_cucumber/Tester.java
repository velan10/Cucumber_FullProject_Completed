package com.practice_cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Project\\Feature\\Project.feature",
       glue ="com.sd",
       dryRun = false,
       monochrome = true,
     //  strict = true,
     //  tags = ("@Ad1,@Ad2"),
       plugin = {
    			"html:Report/Html_Report",
    			//"pretty", //console
    			"json:Reports/JsonReport.json",
    			"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/exReport.html"
}
)
  

public class Tester extends BaseClass {

	
	public static WebDriver driver;

	@BeforeClass
	public static  void set_Up()  {
	driver=	BaseClass.getBrowser("Chrome");
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
}
}