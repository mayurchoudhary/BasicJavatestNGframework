package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SqtdWebElement extends RemoteWebElement {
	WebDriverWait wait = new WebDriverWait(DriverController.driver,30);
	WebElement webelement;

	public SqtdWebElement(WebElement element) {
		webelement=element;
	}
	
	@Override
	public void click() {
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
		webelement.click();
	}
	
	
}
