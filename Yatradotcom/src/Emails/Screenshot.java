package Emails;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Screenshot {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	@Test
	public void Setup()
	{
		System.out.println("Hello");
	}

}
