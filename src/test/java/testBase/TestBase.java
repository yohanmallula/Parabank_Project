package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void set_Up()
	{
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
		
		
	}
	
	
	 @AfterClass
	public void tearDown() {
		driver.close(); 
	}
	

}
