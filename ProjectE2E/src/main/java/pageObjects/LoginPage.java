package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email_Input  = By.xpath("*//form/div/div/input[@type='{}' and @name='{}']");
	By pass_Input   = By.xpath("*//form/div/div/input[@type='{}' and @name=' {}']");
	By log_In_Input = By.xpath("*//form/div/div/input[@type='{}' and @name='{}']");

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailInput() {
		return driver.findElement(email_Input);
	}

	public WebElement getPasswordInput() {
		return driver.findElement(pass_Input);
	}
	public WebElement getLogInInput() {
		return driver.findElement(pass_Input);
	}
	
	public class vi{
		
		
	}
}

