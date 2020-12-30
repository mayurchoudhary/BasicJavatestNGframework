package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class CodeValidation {

	
	public WebDriver driver;
	
	By Backtologin=By.xpath("//span[text()=' Back to Login ']");
	By accesscode=By.xpath("//p[@id='accessCodeRef']");
	By codeenter=By.xpath("//input[@id='SmsRequestObj.rx_access_code']");
	By codetext=By.xpath("//div[text()='Please enter the code that was sent to your device to continue login.']");
	By SubmitCode = By.xpath("//button[text()='Submit']");
	By login_google=By.xpath("//div/button[@type='button']");
	
	
	
	
	public CodeValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}



//public ForgotPassword forgotPassword()
//{
//	driver.findElement(forgotPassword).click();
//	return new ForgotPassword(driver);
//	
//}
	public WebElement getBacktologin()
	{
		return driver.findElement(Backtologin);
	}
	public WebElement getcodeenter()
	{
		return driver.findElement(codeenter);
	}

	public WebElement getaccesscode()
	{
		return driver.findElement(accesscode);
	}
	
	public WebElement getcodetext()
	{
		return driver.findElement(codetext);
	}
	public WebElement getSubmitCode()
	{
		return driver.findElement(SubmitCode);
	}
	public WebElement getlogin_google()
	{
		return driver.findElement(login_google);
	}



	public void doGoogleLogin(String username, String password) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(20000);
		driver.findElement(login_google).click();
		LoginPage LP= new LoginPage(driver) ;
		Thread.sleep(10000);
		
		LP.getEmail().sendKeys(username);
		WebElement element =LP.getNext_button();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		LP.getPassword().sendKeys(password);

		
	}
	
}
