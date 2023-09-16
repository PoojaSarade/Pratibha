package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAndleDisabledWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/user/Desktop/HTml/scroll.html");
		
		//to handle Disabled webElement
		
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		driver.findElement(By.id("i2")).sendKeys("manager");
		
	}
		
		
		

}
