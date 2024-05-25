package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

	 @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
	 WebElement firstname;
	 
	 @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
	 WebElement secondname;
	
	 
	 @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
	 WebElement Address;
	 
	 @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
	 WebElement City;
	 
	 @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
	 WebElement State;
	 
	 @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
	 WebElement pincode;
	 
	 @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
	 WebElement number;
	 
	 @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
	 WebElement SSn;
	 
	 @FindBy(xpath = "//*[@id=\"customer.username\"]")
	 WebElement username;
	
	 @FindBy(xpath = "//*[@id=\"customer.password\"]")
	 WebElement password;
	 
	 @FindBy(xpath = "//*[@id=\"repeatedPassword\"]")
	 WebElement Conforampassword;
	 
	 @FindBy(xpath = "//*[@value=\"Register\"]")
	 WebElement register;
	 
	public void Firstname()
	{
		firstname.sendKeys("yohan");
	}
	
	public void secondName()
	{
		secondname.sendKeys("mallula");
	}
	
	public void Address()
	{
		Address.sendKeys("adress kajdfbsbbfkbkbdfghbdfhgfhg");
	}

	
	
	
	public void City()
	{
		City.sendKeys("hyb");
	}
	
	public void State()
	{
		State.sendKeys("andhra paraesh");
	}
	
	public void pincode() {
		pincode.sendKeys("696969");
	}
	
	public void number()
	{
		number.sendKeys("1234567890");
	}
	
	public void SSN() {
		SSn.sendKeys("12345");
	}
	
	
	public void username()
	{
		username.sendKeys("yohan1");
	}
	
	public void password()
	{
		password.sendKeys("Y0h@n(1234)");
	}

	public void ConformPassword(String password)
	{
		Conforampassword.sendKeys(password);
	}
	
	public void regbutton()
	{
		register.submit();
	}
}
