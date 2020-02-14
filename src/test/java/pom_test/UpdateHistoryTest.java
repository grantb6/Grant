package pom_test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_pages.UpdateHistoryPOM;

public class UpdateHistoryTest {

	//Property to store the driver instance
	static WebDriver driver;
	static String baseURL = "http://automationpractice.com";
	static StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babs\\Selenium - Nov 2018\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Maximize Browser
		driver.manage().window().maximize();
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
		//Instantiate a new UpdateHistoryPOM object
		UpdateHistoryPOM login = new UpdateHistoryPOM(driver);
		
		//Method calls to perform the login process:
		login.clickSignIn();
		login.clearEmail();
		login.setEmail("SeleniumTesting@gmail.com");
		login.clearPassword();
		login.setPassword("Selenium123");
		login.clickSubmitLogin();
		login.clickPERSONALINFORMATION();
		login.clearFirstName();
		login.setFirstName("AndyB");
		login.setPasswd("Selenium123");
		login.clickSubmitIdentity();
		login.clickNavigateToAccount();
		login.clickOrderHistory();
		
	}

}