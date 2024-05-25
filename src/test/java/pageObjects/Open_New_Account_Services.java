package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Open_New_Account_Services extends BasePage {

	WebDriver driver;

	public Open_New_Account_Services(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[text() = \"Open New Account\"]")
	WebElement New_account;

	@FindBy(xpath = "//select[@id=\"type\"]")
	WebElement AccountType;

	@FindBy(xpath = "//*[@id=\"openAccountForm\"]/form/div/input")
	WebElement Open_New_Account_button;

	@FindBy(xpath = "//*[text() = \"Transfer Funds\"]")
	WebElement Transfaer;

	@FindBy(xpath = "//*[@value=\"Transfer\"]")
	WebElement tranforbutton;

	public void New_acccount() {
		New_account.click();
	}

	public void Acccount_Type() {
		// WebElement dropdown = driver.findElement((By) AccountType);

		// select class object
		Select Saving = new Select(AccountType);
		Saving.selectByVisibleText("SAVINGS");
		System.out.println("dropdown select  and Yohan");
	}

	public void Open_New_Account_button() {
		Open_New_Account_button.click();
		System.out.println("New Account create By Yohan ");

	}

	public void Transfaer() {
		Transfaer.click();

	}

	public void tranforbutton() {
		tranforbutton.submit();

	}

}
