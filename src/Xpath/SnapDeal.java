package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hameed Mubarak\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement username = driver.findElement(By.xpath("//div[@class='accountInner']"));
		username.click();
		WebElement userReg = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		userReg.click();
		WebElement usernum = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']"));
		usernum.sendKeys("9952994001");
		Thread.sleep(2000);
		WebElement Continue = driver.findElement(By.xpath("//button[@id='checkUser']"));
		Continue.click();
	}
}
