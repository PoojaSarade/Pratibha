package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramXpathNo7 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("975489322");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@123");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email, Phone, or Username']")).sendKeys("13245678");
		
		driver.findElement(By.xpath("//span[@class='_ab37']")).click();
		
		driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']")).click();
	}

}
