package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	public WebDriver driver;
	
	By email=By.xpath("//input[@aria-label='Email or phone'][@id='identifierId']");
	By Next_button=By.xpath("//span[text()='Next']");
	By password=By.xpath("//input[@aria-label='Enter your password']");
	By forgotPassword = By.xpath("//span[text()='Forgot password?']");
	
	
	
	
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
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getNext_button()
	{
		return driver.findElement(Next_button);
	}
	
	
	
	
}
