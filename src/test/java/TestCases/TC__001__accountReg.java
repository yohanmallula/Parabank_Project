package TestCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.TestBase;

public class TC__001__accountReg extends TestBase{
	
	@Test
	public void regestion() {
		
		HomePage home = new HomePage(driver);
		home.Register();
		
		
	     AccountRegistrationPage AccountReg = new AccountRegistrationPage(driver);
		
	     AccountReg.Firstname(); 
	     AccountReg.secondName();
	     AccountReg.Address();
	     AccountReg.City();
	     AccountReg.State();
	     AccountReg.pincode();
	     AccountReg.number();
	     AccountReg.SSN();
	     AccountReg.username();
	     AccountReg.password();
	     AccountReg.ConformPassword("Y0h@n(123)");
	     AccountReg.regbutton();
		
	}

}
