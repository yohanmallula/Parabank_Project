package TestCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Open_New_Account_Services;
import testBase.TestBase;

public class TC__003_New_Account_Services extends TestBase {

	@Test
	public void New_account_open() {
		HomePage Login = new HomePage(driver);
		Login.Username();
		Login.password();
		Login.loginbutton();

		Open_New_Account_Services NewAccount = new Open_New_Account_Services(driver);
		NewAccount.New_acccount();
		NewAccount.Acccount_Type();
		NewAccount.Open_New_Account_button();
		// NewAccount.Transfaer();
		// NewAccount.tranforbutton();
	}

}
