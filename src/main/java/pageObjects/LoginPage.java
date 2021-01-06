package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.xpath("//input[@aria-label='Email or phone'][@id='identifierId']");
	By identifiernext=By.xpath("//span[text()='Next']");
	By password=By.xpath("//input[@aria-label='Enter your password']");
	By forgotPassword = By.xpath("//span[text()='Forgot password?']");
	By tryagain = By.xpath("//button[text()='Try Again']");
	By passwordnext = By.xpath("//div[@id='passwordNext']");
	By anotheraccount = By.xpath("//div[text()='Use another account']");
	By appleemail=By.xpath("//input[@id='account_name_text_field']");
	By appleemailnext=By.xpath("//button[@id='sign-in']");
	By appleemailpassword=By.xpath("//input[@type='password']");
	By applepassnext=By.xpath("//i[@class='icon icon_sign_in']");
	By appletrust=By.xpath("//button[text()='Trust']");
	By applecontinue=By.xpath("//div[text()='Continue']");
	By applecancel=By.xpath("//div[text()='Cancel']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}



//public ForgotPassword forgotPassword()
//{
//	driver.findElement(forgotPassword).click();
//	return new ForgotPassword(driver);
//	
//}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpasswordnext()
	{
		return driver.findElement(passwordnext);
	}
	public WebElement getanotheraccount()
	{
		return driver.findElement(anotheraccount);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getidentifiernext()
	{
		return driver.findElement(identifiernext);
	}
	public WebElement gettryagain()
	{
		return driver.findElement(tryagain);
	}
	
	public WebElement getappleemail()
	{
		return driver.findElement(appleemail);
	}
	public WebElement getappleemailnext()
	{
		return driver.findElement(appleemailnext);
	}
	public WebElement getappleemailpassword()
	{
		return driver.findElement(appleemailpassword);
	}
	public WebElement getapplepassnext()
	{
		return driver.findElement(applepassnext);
	}
	public WebElement getappletrust()
	{
		return driver.findElement(appletrust);
	}
	public WebElement getapplecontinue()
	{
		return driver.findElement(applecontinue);
	}
	public WebElement getapplecancel()
	{
		return driver.findElement(applecancel);
	}
	
}
