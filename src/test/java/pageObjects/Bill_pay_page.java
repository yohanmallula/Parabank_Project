package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bill_pay_page extends BasePage {
	WebDriver driver;

	public Bill_pay_page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[text() = \"Bill Pay\"]")
	WebElement BillPay;

	@FindBy(xpath = "//*[@name=\"payee.name\"]")
	WebElement Payy__Name;

	@FindBy(xpath = "//*[@name=\"payee.address.street\"]")
	WebElement Address;

	@FindBy(xpath = "//*[@name=\"payee.address.city\"]")
	WebElement City;

	@FindBy(xpath = "//*[@name=\"payee.address.state\"]")
	WebElement State;

	@FindBy(xpath = "//*[@name=\"payee.address.zipCode\"]")
	WebElement PinCode;

	@FindBy(xpath = "//*[@name=\"payee.phoneNumber\"]")
	WebElement number;

	@FindBy(xpath = "//*[@name=\"payee.accountNumber\"]")
	WebElement account_amount;

	@FindBy(xpath = "//*[@name=\"verifyAccount\"]")
	WebElement ccoform_account_amount;

	@FindBy(xpath = "//*[@name=\"amount\"]")
	WebElement amount;

	@FindBy(xpath = "//*[@value=\"Send Payment\"]")
	WebElement SendMoney;

	@FindBy(xpath = "//*[text() = \"See Account Activity for more details.\"]")
	WebElement Bill_Final_Text;

	public void Bill_Pay_option() {
		BillPay.click();
	}

	public void Payy__Name() {
		Payy__Name.sendKeys("Yohan");
	}

	//
	public void Address() {
		Address.sendKeys("narasapur");
	}

	public void City_hamm() {
		City.sendKeys("hammmmm");
	}

	public void State() {
		State.sendKeys("Andhra Pradesh");
	}

	public void PinCode() {
		PinCode.sendKeys("696969");
	}

	public void number() {
		number.sendKeys("098765432");
	}
	// 14787

	public void account_amount() {
		account_amount.sendKeys("14787");
	}

	public void ccoform_account_amount() {
		ccoform_account_amount.sendKeys("14787");
	}

	public void amount() {
		amount.sendKeys("123");
	}

	public void SendMoney() {
		SendMoney.click();
	}

	
	
}
