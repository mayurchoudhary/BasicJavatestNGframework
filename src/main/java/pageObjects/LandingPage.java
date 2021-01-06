package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public  WebDriver driver;
	
	private  By country_image=By.xpath("//img[@class='countryImg']");
	private By Select_Country=By.xpath("//div[@class='searchInputWrapper']/input[@type='text']");
	private By CountryInd=By.xpath("//span[@class='mat-option-text']");
	private By signin=By.xpath("//input[@placeholder='Enter phone number']");
	private By mobileentergoogle= By.xpath("//input[@id='EligibiltyRequest.mdn']");
	private By title_text=By.xpath("//span[@id='headerText']/span");
	private By numbersubmit= By.xpath("//button[text()='Submit']");
	private By Submit_button=By.xpath("//button[text()='Submit']");
	private  By footer=By.xpath("//div[@id='copyRight']");
	private By mobileenterapple= By.xpath("//input[@id='EligibiltyRequest.mdn']");
	private By accountnotfound= By.xpath("//div/h1[text()='Account Not Found']");
	private By accountnotfoundtryagain= By.xpath("//button[text()='Submit']");
	private By Termsofservicelink= By.xpath("//a[@href='http://www.squaretrade.com.au/terms']");
	private By PrivacyPolicy= By.xpath("//a[@href='http://www.squaretrade.com.au/privacypolicy']");
	private By FAQ= By.xpath("//a[@href='https://common-aws1-us-east-1-api-wlpc.cloud.synchronoss.net/web/app/public#/faq']");
	private By Cookies= By.xpath("//a[@href='https://common-aws1-us-east-1-api-wlpc.cloud.synchronoss.net/web/app/public#/cookies']");
	
	
	
public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp=new LoginPage(driver);
		 return lp;
		 
		 }
	
	public WebElement getTermsofservicelink()
	{
		return driver.findElement(Termsofservicelink);
	}
	public WebElement getPrivacyPolicy()
	{
		return driver.findElement(PrivacyPolicy);
	}
	public WebElement getFAQ()
	{
		return driver.findElement(FAQ);
	}
	public WebElement getCookies()
	{
		return driver.findElement(Cookies);
	}
	public WebElement getnumbersubmit()
	{
		return driver.findElement(numbersubmit);
	}
	public WebElement getaccountnotfoundtryagain()
	{
		return driver.findElement(accountnotfoundtryagain);
	}
	
	public WebElement getaccountnotfound()
	{
		return driver.findElement(accountnotfound);
	}
	public WebElement getcountry_image()
	{
		return driver.findElement(country_image);
	}
	public WebElement getSelect_Country()
	{
		return driver.findElement(Select_Country);
	}
	public WebElement getCountryInd()
	{
		return driver.findElement(CountryInd);
	}
	public WebElement getmobileentergoogle()
	{
		return driver.findElement(mobileentergoogle);
	}
	public CodeValidation submit_signin()
	{
		driver.findElement(Submit_button).click();
		return new CodeValidation(driver);
	}
	public WebElement gettitle_text()
	{
		return driver.findElement(title_text);
	}
	public WebElement getfooter()
	{
		return driver.findElement(footer);
	}
	public WebElement getmobileenterapple()
	{
		return driver.findElement(mobileenterapple);
	}
	
}
