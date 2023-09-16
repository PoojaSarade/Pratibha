package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-3im63i8:81/login.do");
		
		 WebElement usnTB = driver.findElement(By.name("username"));
		
		WebElement passTB = driver.findElement(By.name("pwd"));
		
		usnTB.sendKeys("admin");
		
		passTB.sendKeys("MANAGER");
		usnTB.clear();
		passTB.clear();

	}

}
