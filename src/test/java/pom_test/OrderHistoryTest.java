package pom_test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom_pages.OrderHistoryPOM;

public class OrderHistoryTest {
	
	public static Logger log = LogManager.getLogger(OrderHistoryTest.class.getName());

	//Property to store the driver instance
	static WebDriver driver;
	static String baseURL = "http://automationpractice.com";
	static StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babs\\Selenium - Nov 2018\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		log.info("Navigated to Home page");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Maximize Browser
		driver.manage().window().maximize();
		log.info("Browser maximized");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
	
	@Test
	public void test() throws InterruptedException {		
		//instantiate a new LoginPOM object (our POM) here
		OrderHistoryPOM login = new OrderHistoryPOM(driver);
		
		//Method calls to perform the login process:
		login.clickSignIn();
		login.clearemail();
		login.setemail("SeleniumTesting@gmail.com");
		login.clearpassword();
		login.setpassword("Selenium123");
		login.clickSubmitLogin();
		login.clickTShirts();
		login.clickQuickView();
		login.clickAddToCart();
		login.clickCheckOutOne();
		login.clickCheckOutTwo();
		login.clickProcessAddress();
		login.clickTermsOfService();
		login.clickProcessCarrier();
		login.clickBankWire();
		login.clickOrderConfirmation();
		login.clickCustomerAccount();
		login.clickOrderHistory();
		
		log.info("Item displayed in Order History");
	}
		
}