package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[text()='Register']")
	WebElement Register;
	
	@FindBy(xpath = "//*[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath = "//*[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@value=\"Log In\"]")
	WebElement Login;
	
	public void Register() {
		Register.click();
	}
	
	public void Username() {
		username.sendKeys("yohan1");
	}
	
	public void password() {
		password.sendKeys("Y0h@n(1234)");
	}
	
	public void loginbutton()
	{
		Login.submit();
	}

}
