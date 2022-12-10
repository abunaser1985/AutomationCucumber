package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.gecko.marionett", "Driver/geckodriver");
		driver = new FirefoxDriver();
	    driver.get("https://techfios.com/test/101/index.php/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
	
	public void teardown() {
		driver.quit();
	}
}