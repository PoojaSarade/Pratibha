package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoXpathNo1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//span[@id='home']")).click();
		
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("prabhav");
		
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		
    	driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		driver.findElement(By.xpath("//p[@id='testdoubleclick']")).click();
		
		
	}

}
