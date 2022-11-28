package steps;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 



public class StepDefinition1 {
	 
	   WebDriver driver = null; 
	   
	   @Given("^\"([^\"]*)\" button exists1$")
	   public void button_exists1(String arg1) {
			      driver = new ChromeDriver(); 
			      driver.navigate().to("https://techfios.com/test/101/index.php/"); 
			      
	   }

	   @When("^I click on the button1$")
	   public void i_click_on_the_button1() {
		   driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();
	   }
		
	   @Then("^the background color will change to sky white$")
	   public void the_background_color_will_change_to_white()  {
	       driver.get("https://techfios.com/test/101/index.php/");
	   }
		
	  
	}
	
