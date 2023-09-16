package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://orangehrm.com/");
		
		Actions act = new  Actions(driver);
		
		 WebElement orange = driver.findElement(By.xpath("//a[text()='Why OrangeHRM']"));
		 
		WebElement solution = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/div/div/div/div/ul/li[1]"));
		
		WebElement jugad = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button"));
		
		Thread.sleep(2000);
		act.moveToElement(orange).build().perform();
		Thread.sleep(2000);
		act.moveToElement(solution).build().perform();
		Thread.sleep(2000);
		act.moveToElement(jugad).click().build().perform();
		Thread.sleep(2000);
		
	}

}
