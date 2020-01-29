package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathFb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hameed Mubarak\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("9952994001");
		WebElement userpasswd = driver.findElement(By.xpath("//input[@id='pass']"));
		userpasswd.sendKeys("Mercy");
		
		WebElement userlogin = driver.findElement(By.xpath("//input[@aria-label='Log In']"));
		userlogin.click();
		
		
		
}
}

