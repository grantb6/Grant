package AutomationPractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderHistory {
	    
		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babs\\Selenium - Nov 2018\\chromedriver.exe");
			
		//Instantiate Chrome
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver();
			
		//Login to URL
		driver.get("http://automationpractice.com");
		//log.info("Driver is initialised");
				
		//Maximize Browser
		driver.manage().window().maximize();
		
		//Instantiate Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						  
		//Login
		driver.findElement(By.linkText("Sign in")).click();
				
		//Email address
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("SeleniumTesting@gmail.com");
		
		//Password
		driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("Selenium123");
	
		//Sign In
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		Thread.sleep(3000);
		//T-Shirts
		driver.findElement(By.linkText("T-SHIRTS")).click();
		
		Thread.sleep(2000);
		
		//QuickView
		driver.findElement(By.xpath("//div[@class='product-container']")).click();

		//Add to cart
		driver.findElement(By.linkText("Add to cart")).click();
		
		//Proceed to checkout
		driver.findElement(By.linkText("Proceed to checkout")).click();
		
		//Proceed to checkout
		driver.findElement(By.linkText("Proceed to checkout")).click();
		
		//Proceed to checkout
		 driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		//Terms of service
		driver.findElement(By.xpath("//input[@id = 'cgv']")).click();
		
		//Proceed to checkout
		 driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		//Pay by bank wire
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		Thread.sleep(2000);
		//I confirm my order
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();
		
		Thread.sleep(5000);
		
		//Verify T-Shirt Purchase in Order History
		
		//View my customer account
		driver.findElement(By.xpath("//a[@class='account']")).click();
		
		//ORDER HISTORY AND DETAILS
		driver.findElement(By.linkText("ORDER HISTORY AND DETAILS")).click();
		
		}
	}


