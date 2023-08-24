import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Launchbrowser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Invoking the browser
		//ChormeBrowser- Chrome Driver
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish Chodisetti\\Documents\\Softwares");
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click();
		Robot r = new Robot();
	    List<WebElement> ele= driver.findElements(By.name("p"));
		for(WebElement e: ele)
		{
			if(e.getAttribute("type").equals("text"));
		}
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);

	}

}
