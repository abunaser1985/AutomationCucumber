package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AccountPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	 
	AccountPage accountpage;
	 
	@Before
	public void setUp() {
			initDriver();
			accountpage = PageFactory.initElements(driver, AccountPage.class);
	 }
	
	
	@Given("^\"([^\"]*)\" button exists$")
	   public void button_exists(String arg1) { 
		      System.out.println("Blue Background Color Button Exist");
	   }

	   @When("^I click on the button$")
	   public void i_click_on_the_button(){
		   accountpage.setBlueBackgroungButton();
		   
	   }
		
	   @Then("^the background color will change to sky blue$")
	   public void the_background_color_will_change_to_sky_blue()  {
		   String a = driver.findElement(By.xpath("//*[contains(text(),'skyblue')]")).getCssValue("background-color");
			
	    	Assert.assertEquals("validation successful","rgba(0, 0, 0, 0)", a);
		   
		 
	   }
	   @After
		public void tearDown()  {
			
			driver.quit();
		}
	  
	   
	  
	}