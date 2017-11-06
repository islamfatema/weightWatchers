package Weight_Watchers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class WebDriverFactory {
	public static WebDriver driver = null;
	

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass

	public void initializeDriver() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/fatemaislam/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   getDriver().manage().window().maximize();

	}
}
