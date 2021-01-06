package com.squaretrade.tests;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.DriverController;

public class ValidateHeaderandFooter extends BaseTest {
	
	LandingPage l;
	public static Logger log = LogManager.getLogger(DriverController.class.getName());

	
	@Test
	
	public void validateAppTitle() throws IOException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		 l=new LandingPage(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.gettitle_text().getText(), "Hope you're doing great today!");
		 log.info("Successfully validated Text message");
		 System.out.println("Test completed");
		 }
@Test
	
	public void validatefooter() throws IOException
	{
		
       Assert.assertEquals(l.getfooter().getText(), "©  2021  Synchronoss. All rights Reserved");
       log.info("Successfully validated Text message");
       System.out.println("Test completed");
		}
	@Test

	public void URLCheckTest() throws IOException, InterruptedException {
		l = new LandingPage(driver);

	//	clickusingjavascript(l.getTermsofservicelink());
	//	String URL = driver.getCurrentUrl();
		Assert.assertEquals(l.getTermsofservicelink().getAttribute("href"), prop.getProperty("termsofservice"));
		log.info("Successfully validated url");
		
		//executor.executeScript("window.history.go(-1)");

       Assert.assertEquals(l.getPrivacyPolicy().getAttribute("href"), prop.getProperty("privacypolicy"));
		log.info("Successfully validated url");

		//executor.executeScript("window.history.go(-2)");
		
		Assert.assertEquals(l.getFAQ().getAttribute("href"), prop.getProperty("fAQ"));
		log.info("Successfully validated url");
		Assert.assertEquals(l.getCookies().getAttribute("href"), prop.getProperty("cookies"));
		
		System.out.println("Test completed");

	}

	

}
