package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Adminisation_Page extends BasePage {
	
	WebDriver driver;
	
	public Adminisation_Page(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath = "//*[text() = \"Admin Page\"]")
	WebElement Admin_Page;
	
	@FindBy(xpath = "(//button[@name=\"action\"])[1]")
	WebElement initialize;
	
	@FindBy(xpath = "(//button[@name=\"action\"])[2]")
	WebElement clean;
	
	@FindBy(xpath = "//*[@value=\"Startup\"]")
	WebElement Starup;
	
	@FindBy(xpath = "//*[@id=\"accessMode1\"]")
	WebElement Soap_RadioButton;
	
	@FindBy(xpath = "//*[@id=\"accessMode2\"]")
	WebElement Rest_adiobutton;
	
	@FindBy(xpath = "//*[@id=\"accessMode4\"]")
	WebElement JDC_Radio_button;
	
	
	@FindBy(xpath = "//*[@id=\"soapEndpoint\"]")
	WebElement endPoint;
	
	@FindBy(xpath = "//*[@value=\"Submit\"]")
	WebElement submit;
	
	public void Admin_Page()
	{
		Admin_Page.click();
	}
	
	public void initialize() {
		initialize.submit();
	}
	
	public void clean()
	{
		clean.submit();
	}
  public void Startup()
  {
	  Starup.click();
  }
  
  public void Soap_RadioButton()
  {
	  Soap_RadioButton.click();

  }
  
  public void Rest_adiobutton() {
	  Rest_adiobutton.click();
  }
  
  public void JDC_Radio_button()
  {
	  JDC_Radio_button.click();
  }
  
  public void endPoint()
  {
	  endPoint.sendKeys("yohan mallula");
  }
  
   public void submit()
  {
	  submit.click();
  } 
}
