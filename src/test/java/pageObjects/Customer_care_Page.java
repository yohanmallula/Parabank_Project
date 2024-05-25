package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer_care_Page extends BasePage {
	
	
	WebDriver driver;
	public Customer_care_Page(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//*[text() = \"contact\"]")
	WebElement Customer_button;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath = "//*[@name=\"email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement phone;
	
	
	@FindBy(xpath = "//*[@id=\"message\"]")
	WebElement message;
	
	@FindBy(xpath ="//*[@value=\"Send to Customer Care\"]")
	WebElement Send_button;
	
	public void Customer_button()
	{
		Customer_button.click();
	}
	
	public void name()
	{
		name.sendKeys("yohan mallula");
	}
	
	public void email()
	{
		email.sendKeys("Yohan@gmail.com");
	}
	
	public  void phone() {
		phone.sendKeys("987654321");
	}
	
	public void message() {
		message.sendKeys("jhsfbvjhsfbgvhsdfgbvlhkjdfgbvklsdfhvgbldsfhgvbhsdfkhgshdgfshfdgush");
	}
	
	
	public void Send_button()
	{
		Send_button.submit();
	}
}
