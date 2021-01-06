package com.squaretrade.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import resources.DriverController;

public class BaseTest extends DriverController {
	public static Logger log = LogManager.getLogger(DriverController.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
		 
		 driver.get(prop.getProperty("url"));
			log.info("Navigated to Home page");
		
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}
	
	public void clickusingjavascript(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

}
