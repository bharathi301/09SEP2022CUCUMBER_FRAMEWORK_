package stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
		@Given("user is in login page")
		public void user_is_in_login_page() 
		{
			System.setProperty("webdriver.chrome.driver","C://Users//Dell//Downloads//chromedriver_win32//chromedriver.exe");
		     driver=new ChromeDriver();
		    driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		}

		@When("user enters valid user name")
		public void user_enters_valid_user_name() 
		{
			driver.findElement(By.id("ap_email")).sendKeys("9972651840");
		    System.out.println("username  entered succesfully");
		}

		@When("user clicks on continue button")
		public void user_clicks_on_continue_button() 
		{
			driver.findElement(By.id("continue")).click();
		}

		@When("user enters valid password")
		public void user_enters_valid_password() {
			driver.findElement(By.name("password")).sendKeys("divyaflora@123");
		    System.out.println("user entered password");
		}
		@When("user clicks on login button")
		public void user_clicks_on_login_button() 
		{
			driver.findElement(By.id("signInSubmit")).click();
		    System.out.println("user clicks on login button");
		}

		@Then("the home page should be displayed")
		public void the_home_page_should_be_displayed() 
		{
			String expected_title = "Amazon Sign-In";
			Assert.assertEquals(expected_title,driver.getTitle());
			System.out.println("home page is displayed");
		}



		

	}


