package Xpath;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipkartSelect {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hameed Mubarak\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement mobcase= driver.findElement(By.xpath("//div[text()='Designer Back Covers']"));
delay(2000);

Actions a =new Actions(driver);
a.contextClick(mobcase).perform();

		Robot r =new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_A);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_A);
		//delay(2000);
		
		for (int i=0;i<2;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_X);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_X);
		
		
		
		//r.keyPress(KeyEvent.VK_TAB);
		
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent. VK_V);
		
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent. VK_V);
	}

	private static void delay(int i) {
		// TODO Auto-generated method stub
		
	}
}


