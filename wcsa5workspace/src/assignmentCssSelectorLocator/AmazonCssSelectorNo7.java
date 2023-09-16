package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCssSelectorNo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home wall decor",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home wall decor clearance",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home decor clearance bedroom furniture",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home decor clearance living room wall art metal",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home decor clearance bedroom rustic modern",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home decor clearance sale under 20",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("home wall art aesthetic",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("neutral home decor aesthetic wall art",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("neutral wall art",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("neutral wall art framed",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='hm-icon-label']")).click();
		
		
		
		

	}

}
