package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoCssSelectorNo8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		//driver.findElement(By.cssSelector("input[id='b-query']")).sendKeys("selenium",Keys.ENTER);
		
		driver.findElement(By.cssSelector("span[id='home']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[value='volvox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[value='swiftx']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[value='Hyundai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[value='audix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select[id='drop1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[id='ironman1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[id='ironman2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[id='ironman3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("option[id='ironman4']")).click();
		driver.findElement(By.cssSelector("option[id='ironman5']")).click();
	}

	}


