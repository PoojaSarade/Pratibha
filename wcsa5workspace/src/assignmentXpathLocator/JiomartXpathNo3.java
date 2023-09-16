package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JiomartXpathNo3 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		
		driver.findElement(By.xpath("//a[@id='nav_link_2']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav_link_6047']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav_link_8582']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav_link_4']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav_link_5']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search JioMart']")).sendKeys("kitchen");
		
		driver.findElement(By.xpath("//span[@class='jm-body-xs deliver-to']")).click();
		
		driver.findElement(By.xpath("//img[@src='https://www.jiomart.com/assets/ds2web/images/jiomart_beta_logo.svg']")).click();
	}
	

}
