package AutomationJava.ProjectE2E;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class HomePage extends base{
	LoginPage loginPage;
	
	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("browser"));
		
		loginPage = new LoginPage(driver);
		loginPage.getEmailInput().sendKeys(prop.getProperty("email"));
		loginPage.getPasswordInput().sendKeys(prop.getProperty("pass"));
		loginPage.getLogInInput().click();
		
		
	}

}
