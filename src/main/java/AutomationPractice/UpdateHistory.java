package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdateHistory {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babs\\Selenium - Nov 2018\\chromedriver.exe");
			
		//Instantiate Chrome
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver();
			
		//Login to URL
		driver.get("http://automationpractice.com");
				
		//Maximize Browser
		driver.manage().window().maximize();
				
		//Instantiate Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						  
		//Login
		driver.findElement(By.linkText("Sign in")).click();
				
		//Email
		driver.findElement(By.id("email")).sendKeys("SeleniumTesting@gmail.com");
				
		//Password
		driver.findElement(By.id("passwd")).sendKeys("Selenium123");
				
		//Sign In
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(3000);
		
		//My Personal Information
		driver.findElement(By.linkText("MY PERSONAL INFORMATION")).click();
		
		//First name
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("AndyB");
		
		//Current Password
		driver.findElement(By.xpath("//input[@id='old_passwd']")).sendKeys("Selenium123");
		
		//Save
		driver.findElement(By.xpath("//button[@name='submitIdentity']")).click();
		
		//Order Confirmation
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Back to your account")).click();
		driver.findElement(By.linkText("ORDER HISTORY AND DETAILS")).click();
		
		 //Assert.assertEquals(driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText(), "Your personal information has been successfully updated");
		//System.out.println(driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText());
		
		
		
		
		
		
		
		
		
		
		

	}

}
