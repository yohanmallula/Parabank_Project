package TestCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.TestBase;

public class TC__002__LoginPage extends TestBase {
	
	@Test
	public void login()
	{
		HomePage Login = new HomePage(driver);
		Login.Username();
		Login.password();
		Login.loginbutton();
	}
	

}
