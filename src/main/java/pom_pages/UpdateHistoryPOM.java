package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateHistoryPOM {
	
	//Field that reference WebDriver Object
	WebDriver driver;
	
	//Constructor that receives WebDriver Object and reference PageFactory
	public UpdateHistoryPOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Description of UI Elements
	@FindBy(xpath = "//html/head/title") WebElement PageTitle;
	@FindBy(linkText = "Sign in") WebElement SignIn;
	@FindBy(xpath = "//input[@id = 'email']") WebElement Email;
	@FindBy(xpath = "//input[@id = 'passwd']") WebElement Password;
	@FindBy(id = "SubmitLogin") WebElement SubmitLogin;
	@FindBy(linkText = "MY PERSONAL INFORMATION") WebElement PERSONALINFORMATION;
	@FindBy(xpath = "//input[@id='firstname']") WebElement FirstName;
	@FindBy(xpath = "//input[@id='old_passwd']") WebElement Passwd;
	@FindBy(xpath = "//button[@name='submitIdentity']") WebElement SubmitIdentity;
	@FindBy(linkText = "Back to your account") WebElement NavigateToAccount;
	@FindBy(linkText = "ORDER HISTORY AND DETAILS") WebElement OrderHistory;
	
	//Methods for interating with UI Elements
	public void clickSignIn () {
		SignIn.click();
	}
	public void clearEmail () {
		Email.clear();
	}
	public void setEmail (String strEmail) {
		Email.sendKeys(strEmail);
	}
	public void clearPassword () {
		Password.clear();
	}
	public void setPassword (String strPassword) {
		Password.sendKeys(strPassword);
	}
	public void clickSubmitLogin () {
		SubmitLogin.click();
	}
	public void clickPERSONALINFORMATION () {
		PERSONALINFORMATION.click();
	}
	public void clearFirstName () {
		FirstName.clear();
	}
	public void setFirstName (String strFirstName) {
		FirstName.sendKeys(strFirstName);
	}
	public void setPasswd (String strPasswd) {
		Passwd.sendKeys(strPasswd);
	}
	public void clickSubmitIdentity () {
		SubmitIdentity.click();
	}
	public void clickNavigateToAccount () {
		NavigateToAccount.click();
	}
	public void clickOrderHistory () {
		OrderHistory.click();
	}

	}
