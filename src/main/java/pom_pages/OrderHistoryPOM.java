package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPOM {

		//Field that reference WebDriver Object
		WebDriver driver;
		
		//Constructor that receives WebDriver Object and reference PageFactory
		public OrderHistoryPOM (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Description of UI Elements
		@FindBy(xpath = "//html/head/title") WebElement PageTitle;
		@FindBy(linkText = "Sign in") WebElement SignIn;
		@FindBy(xpath = "//input[@id = 'email']") WebElement email;
		@FindBy(xpath = "//input[@id = 'passwd']") WebElement password;
		@FindBy(id = "SubmitLogin") WebElement SubmitLogin;
		@FindBy(linkText = "T-SHIRTS") WebElement TShirts;
		@FindBy(xpath = "//div[@class='product-container']") WebElement QuickView;
		@FindBy(linkText = "Add to cart") WebElement AddToCart;		
		@FindBy(linkText = "Proceed to checkout") WebElement CheckOutOne;	
		@FindBy(linkText = "Proceed to checkout") WebElement CheckOutTwo;	
		@FindBy(xpath = "//button[@name='processAddress']") WebElement ProcessAddress;
		@FindBy(xpath = "//input[@id = 'cgv']") WebElement TermsOfService;
		@FindBy(xpath = "//button[@name='processCarrier']") WebElement ProcessCarrier;
		@FindBy(xpath = "//a[@class='bankwire']") WebElement BankWire;
		@FindBy(xpath = "//*[@id='cart_navigation']/button") WebElement OrderConfirmation;
		@FindBy(xpath = "//a[@class='account']") WebElement CustomerAccount;
		@FindBy(linkText = "ORDER HISTORY AND DETAILS") WebElement OrderHistory;
	
		//Methods for interating with UI Elements
		public void clickSignIn () {
			SignIn.click();
		}
		public void clearemail () {
			email.clear();
		}
		public void setemail (String stremail) {
			email.sendKeys(stremail);
		}
		public void clearpassword () {
			password.clear();
		}
		public void setpassword (String strpassword) {
			password.sendKeys(strpassword);
		}
		public void clickSubmitLogin () {
			SubmitLogin.click();
		}
		public void clickTShirts () {
			TShirts.click();
		}
		public void clickQuickView () {
			QuickView.click();
		}
		public void clickAddToCart () {
			AddToCart.click();
		}
		public void clickCheckOutOne () {
			CheckOutOne.click();
		}
		public void clickCheckOutTwo () {
			CheckOutTwo.click();
		}
		public void clickProcessAddress () {
			ProcessAddress.click();
		}
		public void clickTermsOfService () {
			TermsOfService.click();
		}
		public void clickProcessCarrier () {
			ProcessCarrier.click();
		}
		public void clickBankWire () {
			BankWire.click();
		}
		public void clickOrderConfirmation () {
			OrderConfirmation.click();
		}
		public void clickCustomerAccount () {
			CustomerAccount.click();
		}
		public void clickOrderHistory () {
			OrderHistory.click();
		}
}
