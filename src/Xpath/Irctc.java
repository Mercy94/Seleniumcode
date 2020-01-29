package Xpath;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Irctc {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hameed Mubarak\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement userfrom = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		Robot r= new Robot();
		
		
		
		
		
		//WebElement userfrom = driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']"));
		//userfrom.sendKeys("chennai");
		//Robot r= new Robot();
		//WebElement userto = driver.findElement(By.xpath("//span[text()='COIMBATORE JN - CBE']"));
		//userto.sendKeys("COIMBATORE JN - CBE");
		
		
		
		
}
}

