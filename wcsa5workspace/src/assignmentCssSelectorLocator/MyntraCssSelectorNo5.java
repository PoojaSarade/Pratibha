package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraCssSelectorNo5 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.cssSelector("a[data-group*='men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-group*='women']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-group*='kids']")).click();
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[data-group*='home-&-living']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[data-group*='beauty']")).click();
        Thread.sleep(2000);
    	driver.findElement(By.cssSelector("a[data-group*='studio']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("span[class='desktop-userTitle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("formal dresses");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class*=' desktop-iconUser sprites-header']")).click();
		driver.findElement(By.cssSelector("input[id='tel']")).sendKeys("9567432187");
		
    	
		

	}

	}


