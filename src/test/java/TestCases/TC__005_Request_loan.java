package TestCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Request_Loan;
import testBase.TestBase;

public class TC__005_Request_loan extends TestBase {
    
	@Test
	public void Request_loan_amount() {
		HomePage login = new HomePage(driver);
		login.Username();
		login.password();
		login.loginbutton();
		
		
		
		Request_Loan requestLoan = new Request_Loan(driver);
		requestLoan.Request_loan();
		requestLoan.Request_loan_amount();
		requestLoan.Down_payment();
		requestLoan.Apply_now_button();
				
	}
}
