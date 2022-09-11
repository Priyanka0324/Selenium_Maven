package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver; 
	// constructor to use the same driver
	public HomePage(WebDriver basedriver) {
		this.driver = basedriver;
	}

}
