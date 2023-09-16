package bluestonPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneAssignmentHandlePopup {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
	
		driver.findElement(By.id("denyBtn")).click();
	
		
		//handle the frame by switch the controls to frame
	
		Thread.sleep(2000);
	//	WebElement frameElement = driver.findElement(By.xpath(""));
	
		//driver.switchTo().frame(5);
		
		driver.switchTo().frame("fc_widget");
	
		driver.findElement(By.id("chat-icon")).click();
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
	//	wait.until(ExpectedConditions.e)
		
		
	//	driver.findElement(By.id("chat-fc-name")).sendKeys("abcsdf");
		
	//	driver.findElement(By.id("chat-fc-email")).sendKeys("gfdj12@gmail.com");
		
	//	driver.findElement(By.id("chat-fc-phone")).sendKeys("989655898");
		
		//switch the contols again to the main webpage
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("abcsdf");
		
		driver.findElement(By.id("chat-fc-email")).sendKeys("gfdj12@gmail.com");
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("989655898");
		
	
	

	}

}
