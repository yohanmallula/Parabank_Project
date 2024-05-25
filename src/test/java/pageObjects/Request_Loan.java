package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Request_Loan extends BasePage {

	WebDriver driver;
	
	public Request_Loan(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[text() = \"Request Loan\"]")
	WebElement Request_loan;
	
	@FindBy(xpath = "//*[@id=\"amount\"]")
	WebElement Request_loan_amount;
	
	@FindBy(xpath = "//*[@id=\"downPayment\"]")
	WebElement Down_payment;
	
	@FindBy(xpath = "//*[@value=\"Apply Now\"]")
	WebElement Apply_now_button;
	
	public void Request_loan()
	{
		Request_loan.click();
	}
	
	public void Request_loan_amount()
	{
		Request_loan_amount.sendKeys("1000");
	}
	
	public void Down_payment() {
		Down_payment.sendKeys("900");
	}
	
	public void Apply_now_button()
	{
		Apply_now_button.click();
	}
}
