package TestCases;

import org.testng.annotations.Test;

import pageObjects.Bill_pay_page;
import pageObjects.HomePage;
import testBase.TestBase;

public class TC__004_BillPay extends TestBase {
	
	@Test
	public void Bill_Pay() {
		
		HomePage login = new HomePage(driver);
		login.Username();
		login.password();
		login.loginbutton();
		
		Bill_pay_page  BillPay = new Bill_pay_page(driver);
		BillPay.Bill_Pay_option();
		BillPay.Payy__Name();
		BillPay.Address();
		BillPay.City_hamm();
		BillPay.State();
		BillPay.PinCode();
		BillPay.number();
		BillPay.account_amount();
		BillPay.ccoform_account_amount();
		BillPay.amount();
		BillPay.SendMoney();
		
		
		
	}
	

}
