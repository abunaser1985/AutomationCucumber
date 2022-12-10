package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage extends TestBase {
	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;

	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement button;
	
	public void setBlueBackgroungButton() {
		button.click();
	}
	
	
	}
