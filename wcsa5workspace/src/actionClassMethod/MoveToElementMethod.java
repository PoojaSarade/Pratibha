package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.bluestone.com/");
			
			driver.findElement(By.id("denyBtn")).click(); //handle the popup
			Thread.sleep(2000);
			WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
			
			//To perform mouse actions on webElement
			
		Actions act = new Actions(driver);
		
		//To perform mouseHover action
		
		act.moveToElement(target).perform();
		//WebElement target = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		driver.findElement(By.xpath("//a[.='Band']")).click();


	}

}
