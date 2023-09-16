package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioMartCssSelectorNo6 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		driver.findElement(By.cssSelector("a[id='nav_link_2']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='nav_link_6047']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='nav_link_8582']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='nav_link_5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class='nav_link_4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='hamburger_menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='mstar_api_baseurl']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='mst_api_cart_pin_baseurl']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='egift_url']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='gtm_status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='url_pincode']")).click();

	}

}
