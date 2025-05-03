package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookHomePageSteps {

	@Given("user navigates to Facebook Home Page")
	public void user_navigates_to_facebook_home_page() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/sujatasingh/Downloads/chromedriver-mac-x64 3/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("username1");
		driver.findElement(By.id("password")).sendKeys("password1");
		
		
	}
	
	@When("user enters username1 as email and password1 as Password")
	public void user_enters_username1_as_email_and_password1_as_password() {
	   
	}
	
	@When("user enters username2 as email and password2 as Password")
	public void user_enters_username2_as_email_and_password2_as_password() {
	
	}
	@Then("Login should be success for Facebook Home Page")
	public void login_should_be_success_for_facebook_home_page() {
	   
	}
}
