package automationAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("pooja@123gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("6763456288");
		Thread.sleep(3000);

		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("a[id='u_0_0_8h']"));
	driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")).click();
		
		driver.close();
	}

}
