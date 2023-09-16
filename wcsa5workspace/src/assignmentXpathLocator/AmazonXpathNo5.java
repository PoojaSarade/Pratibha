package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathNo5 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("567854329");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("768765432");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		driver.findElement(By.xpath("//span[@id='auth-create-account-link']")).click();
		
		driver.findElement(By.xpath("//a[@id='ap_change_login_claim']")).click();
		
		driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
		
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		

	}

}
