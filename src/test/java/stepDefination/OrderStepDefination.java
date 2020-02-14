package stepDefination;

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
	
	public class OrderStepDefination extends base {
		
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

	    @When("^I confirm my payment method$")
	    public void i_confirm_my_payment_method() throws Throwable {
	    driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	    }

	    @Then("^Order Confirmation is displayed$")
	    public void order_confirmation_is_displayed() throws Throwable {
	    driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();
	    }

	    @Then("^Order is displayed in Order History$")
	    public void order_is_displayed_in_order_history() throws Throwable {
	    driver.findElement(By.linkText("ORDER HISTORY AND DETAILS")).click();
	    }
	    

	    @Given("^I click 'TSHIRTS' link$")
	    public void i_click_TSHIRTS_link() throws Throwable {
	    driver.findElement(By.linkText("T-SHIRTS")).click();
	    }

	    @Given("^I added a TShirt to my shopping cart$")
	    public void i_added_a_TShirt_to_my_shopping_cart() throws Throwable {
	    driver.findElement(By.xpath("//div[@class='product-container']")).click();
	    driver.findElement(By.linkText("Add to cart")).click();
	    driver.findElement(By.linkText("Proceed to checkout")).click();
	    driver.findElement(By.linkText("Proceed to checkout")).click();
	    }
	    
	    @Given("^I confirmed my delivery address$")
	    public void i_confirmed_my_delivery_address() throws Throwable {
	    driver.findElement(By.xpath("//button[@name='processAddress']")).click();
	    }

	    @Given("^I confirmed my shipping option and agreed to Terms of service$")
	    public void i_confirmed_my_shipping_option_and_agreed_to_Terms_of_service() throws Throwable {
	    driver.findElement(By.xpath("//input[@id = 'cgv']")).click();
	 	driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	    }

	    @And("^I click 'ORDER HISTORY AND DETAILS' link$")
	    public void i_click_order_history_and_details_link() throws Throwable {
	    driver.findElement(By.xpath("//a[@class='account']")).click();
			
		
	    }

	}


	
