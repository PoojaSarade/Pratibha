package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Case6Dependant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    ChromeOptions co=new ChromeOptions();
    co.addArguments("--disable-notification");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//div[text()='HP Spectre Folio Core i7 10th Gen - (16 GB/512 GB SSD/Windows 10 Home) 13-ak1004TU 2 in 1 Laptop']/../..//div[text()='₹2,39,759']"));

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("123asdf");
		
}

}