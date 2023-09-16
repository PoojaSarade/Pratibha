package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1ByUsingUniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abdc@.com");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@type='password'and (@name='pass')]")).sendKeys("12345678");
		
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//button[@type='submit' and  text()='Log in']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='_9ai5']")).click();
	    
	    driver.findElement(By.xpath("//a[@class='_97w4'  and text()='Forgotten password?']")).click();

	    
	    driver.findElement(By.xpath("//a[@id='u_0_0_38']")).click();
	   
	    //driver.findElement(By.xpath("//a[@id='u_0_0_82' and text()='Create new account']")).click();
	    
	    
	    driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy' and text()='Yes, Continue'] ")).click();
	    
	    driver.findElement(By.xpath("//a[@class='_97w4'  and text()='Forgotten password?']")).click();
	   
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[contains(@name, 'firstname')]")).sendKeys("abcd");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[contains(@name, 'lastname' )]")).sendKeys("xyz");
	    Thread.sleep(1000);
	    
	    
				

	}

}
