package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoCssSelectorNo4 {

	public static void main(String[] args) throws InterruptedException {
		


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='sc-3o0n99-4 kAUthO']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("567894325");
		
		driver.findElement(By.cssSelector("span[class$='gXvQtR']")).sendKeys("234561");
		
	}

}
