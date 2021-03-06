package com.squaretrade.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CodeValidation;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.SqtdWebElement;
import resources.DriverController;

public class SignininvalidTests extends BaseTest{

	 public static Logger log =LogManager.getLogger(DriverController.class.getName());
	
	@Test(dataProvider="getData")
	
	public void baseGoogleInvalidTest(String Username,String Password,String text) throws IOException, InterruptedException
	{
		
		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		
		LandingPage l=new LandingPage(driver);
		
		l.getcountry_image().click();
		l.getSelect_Country().sendKeys("india");
		l.getCountryInd().click();
		l.getmobileentergoogle().sendKeys("8860316162");
	    
	    CodeValidation codeValidationPage= l.submit_signin();
	    String codestorage = codeValidationPage.getaccesscode().getText();
	    codeValidationPage.getcodeenter().sendKeys(codestorage);
	    codeValidationPage.getSubmitCode().click();
	    LoginPage loginPage = codeValidationPage.doGoogleLogin(Username,Password);
	    loginPage.gettryagain().click();
	    Thread.sleep(10000);
		log.info(driver.getCurrentUrl());
		
			}



	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][3];
		//0th row
		data[0][0]="tweettest14@gmail.com";
		data[0][1]="userdemo1212";
		data[0][2]="Googleinvalid User";
		//1st row
//		data[1][0]="tweettest14@gmail.com";
//		data[1][1]="userdemo1212";
//		data[1][2]= "Google user";
//		
		return data;
		
		
		
		
		
		
	}
	
}
