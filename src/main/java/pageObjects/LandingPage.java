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
	private By mobileenter= By.xpath("//input[@id='EligibiltyRequest.mdn']");
	private By title_text=By.xpath("//span[@id='headerText']");
	private By Submit_button=By.xpath("//button[text()='Submit']");
	private  By footer=By.xpath("//footer[@id='appFooter']");
	
	
	
	
	
	
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
	public WebElement getmobileenter()
	{
		return driver.findElement(mobileenter);
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
	
	
}
