package steps;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 



public class StepDefinition {
	 
	   WebDriver driver = null; 
	   
	   @Given("^\"([^\"]*)\" button exists$")
	   public void button_exists(String arg1) {
			      driver = new ChromeDriver(); 
			      driver.navigate().to("https://techfios.com/test/101/index.php/"); 
			      
	   }

	   @When("^I click on the button$")
	   public void i_click_on_the_button() {
		   driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
	   }
		
	   @Then("^the background color will change to sky blue$")
	   public void the_background_color_will_change_to_sky_blue()  {
	       
	   }
		
	   
	  
	}
	
