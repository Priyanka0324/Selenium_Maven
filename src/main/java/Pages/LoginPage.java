package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Globally declaring the Webdriver driver
	WebDriver driver; 




	//********************************object****************************

	@FindBy(linkText = "Log in" )
	WebElement LoginLink;

	@FindBy(name = "user_login" )
	WebElement userID;

	@FindBy(id = "password" )
	WebElement Pswd;

	@FindBy(className = "rememberMe" )
	WebElement Checkbox;

	@FindBy(name = "btn_login" )
	WebElement Login;

	// using constructor here as the class object is created in Simplilearnlogin test
	public LoginPage(WebDriver basedriver) {
		this.driver = basedriver;
		// Adding Pagefactory class to support and intialize the object i.e. @FindBy
		PageFactory.initElements(basedriver, this);
	}
	
	//********************************Methods****************************
	public void Login(String UserNameValue,String Passvalue) {

		// Step1. Click on login link
		LoginLink.click();

		// Step2. Enter userID
		userID.sendKeys(UserNameValue);

		// Step3. Enter pswd
		Pswd.sendKeys(Passvalue);

		// Step4. click on the checkbox
		Checkbox.click();

		// Step5. Click on login button
		Login.click();
	}

}
