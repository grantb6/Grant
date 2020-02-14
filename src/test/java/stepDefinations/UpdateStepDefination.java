package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.base;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)

public class UpdateStepDefination extends base {
	
	    WebDriver driver = null;

	    @Given("^I am logged in as a Customer$")
	    public void i_am_logged_in_as_a_customer() throws Throwable {
	    	
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babs\\Selenium - Nov 2018\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("SeleniumTesting@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Selenium123");
		driver.findElement(By.id("SubmitLogin")).click();
	    }
	    
	    @And("^I update my first name to \"([^\"]*)\" and enter Current Password as \"([^\"]*)\"$")
	    public void i_update_my_first_name_to_something_and_enter_current_password_as_something(String strArg1, String strArg2) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("AndyB");
		driver.findElement(By.xpath("//input[@id='old_passwd']")).sendKeys("Selenium123");
	    }

	    @Then("^my Personal Information has been successfully updated$")
	    public void my_personal_information_has_been_successfully_updated() throws Throwable {
	    driver.findElement(By.linkText("ORDER HISTORY AND DETAILS")).click();
	    }
	    
	    @When("^I click 'MY PERSONAL INFORMATION' link$")
	    public void i_click_MY_PERSONAL_INFORMATION_link() throws Throwable {
	    driver.findElement(By.linkText("MY PERSONAL INFORMATION")).click();
	    }
	    
	    @And("^I click 'Save' button$")
	    public void i_click_save_button() throws Throwable {
	    driver.findElement(By.xpath("//button[@name='submitIdentity']")).click();
	    }
	    
	    @And("^I click 'ORDER HISTORY AND DETAILS' link$")
	    public void i_click_order_history_and_details_link() throws Throwable {
	    driver.findElement(By.linkText("Back to your account")).click();
	    }

	}


