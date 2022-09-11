package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class SimplilearnLoginTest extends BaseClass {
	
	@Test
	public void Test1() {

		LoginPage lp = new LoginPage(driver);
		lp.Login("Priya@gmail.com","Abc@1234");
		
		// step6. Validate the error message
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActualError = Error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActualError, ExpError);
		
	}
		@Test
		@Parameters({"uname","Pwd"})
		public void Test2(String UserName,String Password) {

			LoginPage lp = new LoginPage(driver);
			lp.Login(UserName,Password);
		
		}
		@Test
		public void Test3() {
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
        LoginPage lp = new LoginPage(driver);
		lp.Login(UserName,Password);
		}
}
