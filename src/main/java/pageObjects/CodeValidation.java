package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.SqtdWebElement;
import resources.DriverController;

//rahulonlinetutor@gmail.com
public class CodeValidation extends BasePage {

	public JavascriptExecutor executor;
	

	By Backtologin = By.xpath("//span[text()=' Back to Login ']");
	By accesscode = By.xpath("//p[@id='accessCodeRef']");
	By codeenter = By.xpath("//input[@id='SmsRequestObj.rx_access_code']");
	By codetext = By.xpath("//div[text()='Please enter the code that was sent to your device to continue login.']");
	By SubmitCode = By.xpath("//button[text()='Submit']");
	By login_google = By.xpath("//div[1]/button[@type='button']");
	By Login_apple = By.xpath("//div[2]/button[@type='button']");
	SqtdWebElement loginGoogleBtn;
	// SqtdWebElement loginAppleBtn;

	public CodeValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
        super(driver);
		
		}


	public WebElement getBacktologin() {
		return driver.findElement(Backtologin);
	}

	public WebElement getcodeenter() {
		return driver.findElement(codeenter);
	}

	public WebElement getaccesscode() {
		return driver.findElement(accesscode);
	}

	public WebElement getcodetext() {
		return driver.findElement(codetext);
	}

	public WebElement getSubmitCode() {
		return driver.findElement(SubmitCode);
	}

	public WebElement getlogin_google() {
		return (driver.findElement(login_google));
	}

	public WebElement getLogin_apple() {
		return driver.findElement(Login_apple);
	}

	public LoginPage doGoogleLogin(String username, String password) throws InterruptedException {
		Thread.sleep(10000);
		clickusingjavascript(getlogin_google());
	
		// TODO Auto-generated method stub
		// getlogin_google().click();

		LoginPage LP = new LoginPage(driver);
		// Thread.sleep(10000);

		LP.getEmail().sendKeys(username);
	
		clickusingjavascript(LP.getidentifiernext());
		
		LP.getPassword().sendKeys(password);
		LP.getpasswordnext().click();

		return LP;
	}

	public LoginPage doapplelogin(String username, String password) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(10000);
		clickusingjavascript(getLogin_apple());
		LoginPage LP = new LoginPage(driver);

		LP.getappleemail().sendKeys(username);
		
		clickusingjavascript(LP.getappleemailnext());
		LP.getappleemailpassword().sendKeys(password);
		LP.getapplepassnext().click();
		return LP;
	}
}