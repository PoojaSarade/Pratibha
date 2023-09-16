package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathNo6 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("kitchen");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("//a[@data-menu-id='2']")).click();
		
		driver.findElement(By.xpath("//a[@data-menu-id='3']")).click();
		
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		
		

	}

}
