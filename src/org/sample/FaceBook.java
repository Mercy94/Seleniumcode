package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hameed Mubarak\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("9952994001");
	WebElement userpasswd = driver.findElement(By.name("pass"));
	userpasswd.sendKeys("Mercy");
	Thread.sleep(2000);
	
	
}
}
