package com.squaretrade.tests;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.DriverController;

public class ValidateErrorMessage extends BaseTest{
	
	public JavascriptExecutor executor;
	
	LandingPage l;
	 public static Logger log =LogManager.getLogger(DriverController.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
		 
		
	}
	@Test
	
	public void validateerrormessages() throws IOException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		 l=new LandingPage(driver);
		 l.getmobileenterapple().sendKeys("7983793369");
		 l.getnumbersubmit().click();
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.getaccountnotfound().getText(), "Account Not Found");
		 log.info("Successfully validated Text message");
		
		 
		 clickusingjavascript(l.getaccountnotfoundtryagain());
		System.out.println("Test completed");
		 }

//	
//	public void validatefooter() throws IOException
//	{
//		
//System.out.println("2020  Synchronoss. All rights Reserved");
//Assert.assertEquals(l.getfooter().getText(), "2020  Synchronoss. All rights Reserved");
//		}



	

	
}
