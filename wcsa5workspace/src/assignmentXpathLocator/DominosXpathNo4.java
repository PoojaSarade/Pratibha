package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosXpathNo4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://pizzaonline.dominos.co.in/");

		driver.findElement(By.xpath("//div[@class='prf-grp-txt']")).click();
		
		driver.findElement(By.xpath("//input[@name='loginNumber']")).sendKeys("6754382123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[@class='lgn__cntr_inpt-txt']")).sendKeys("345212");
		
		driver.findElement(By.xpath("//div[@class='rsnd ']")).click();
		
		driver.findElement(By.xpath("//div[@class='overlay']")).sendKeys("asbdvdg");
	}

}
