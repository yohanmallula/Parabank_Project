package TestCases;

import org.testng.annotations.Test;

import pageObjects.Customer_care_Page;
import testBase.TestBase;

public class TC__007_Customer_care extends TestBase {
	
	@Test
	public void Customer_care() {
		Customer_care_Page Customer = new Customer_care_Page(driver);
		Customer.Customer_button();
		Customer.name();
		Customer.email();
		Customer.phone();
		Customer.message();
		Customer.Send_button();
	}
	
	

}
