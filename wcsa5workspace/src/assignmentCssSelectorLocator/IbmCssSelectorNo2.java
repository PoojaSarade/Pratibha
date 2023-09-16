package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IbmCssSelectorNo2 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.ibm.com/in-en");
			
			
			driver.findElement(By.cssSelector("div[class^='product-display']")).click();
			
			driver.findElement(By.cssSelector("body[id='ibm-com']")).click();
			
	}

}
