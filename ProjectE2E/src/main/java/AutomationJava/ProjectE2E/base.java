package AutomationJava.ProjectE2E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fIS = new FileInputStream(
				"C:\\Users\\jhali\\eclipse-workspace\\ProjectE2E\\src\\main\\java\\AutomationJava\\ProjectE2E\\data.properties");
		prop.load(fIS);
		String browserName = prop.getProperty("browser");
		String driverType = System.setProperty(prop.getProperty("driver"), prop.getProperty("path"));

		if (browserName.equals("chrome")) {
			System.setProperty(prop.getProperty("driver"), prop.getProperty("path"));
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} else if (browserName.equals("firefox")) {

		} else if (browserName.equals("IE")) {

		} else if (browserName.equals("microsoft edge")) {

		} else if (browserName.equals("opera")) {

		}

		return driver;

	}
}
