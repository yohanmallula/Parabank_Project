package TestCases;

import org.testng.annotations.Test;

import pageObjects.Adminisation_Page;
import pageObjects.HomePage;
import testBase.TestBase;

public class TC__006_Adminisation extends TestBase {
	
	@Test
	public void Adminisation() throws InterruptedException {
		HomePage login = new HomePage(driver);
		login.Username();
		login.password();
		login.loginbutton();
		
		
		Adminisation_Page Admin = new Adminisation_Page(driver);
		
		Admin.Admin_Page();
		//Admin.initialize();
		//	Admin.clean();
		

		
		// Admin.Startup();
		Admin.Soap_RadioButton();
		Admin.Rest_adiobutton();
		Admin.JDC_Radio_button();
		
		Admin.endPoint();
		Admin.submit();
		
		
	}
	
	

}
