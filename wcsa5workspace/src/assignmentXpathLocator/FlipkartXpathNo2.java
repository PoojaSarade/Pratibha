package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpathNo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//span[@class='_2I9KP_']")).click();
		driver.findElement(By.xpath("//img[@class='_396cs4']")).click();
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("//img[@loading='loading']")).click();
		driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
		
		driver.findElement(By.xpath("")).sendKeys("abcd@gmail.com");

	}

}
