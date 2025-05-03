package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageSteps {
	
	@Given("Google Page open")
	public void google_page_open() {
		System.setProperty("webdriver.chrome.driver", "/Users/sujatasingh/Downloads/chromedriver-mac-x64 3/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	    
	}

	@Given("Search Text box is present and enabled in Home Page")
	public void search_text_box_is_present_and_enabled_in_home_page() {
	   
	}

	@When("User enters Cucumber Tutorial keyword in Search box")
	public void user_enters_cucumber_tutorial_keyword_in_search_box() {
	    
	}

	@When("hit enter Button")
	public void hit_enter_button() {
	   
	}

	@Then("All relevant details related to cucumber should be displayed")
	public void all_relevant_details_related_to_cucumber_should_be_displayed() {
	    
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	  
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	  
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {

	}

	@When("User enters Selenium Tutorial keyword in Search box")
	public void user_enters_selenium_tutorial_keyword_in_search_box() {
	
	}
	@Then("All relevant details related to Selenium should be displayed")
	public void all_relevant_details_related_to_selenium_should_be_displayed() {
	   
	}

	
	@Given("Search Text box is present and enabled in Google Home Page")
	public void search_text_box_is_present_and_enabled_in_google_home_page() {
	    
	}
}
