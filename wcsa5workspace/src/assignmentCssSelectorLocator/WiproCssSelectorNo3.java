package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproCssSelectorNo3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.microsoftonline.com/258ac4e4-146a-411e-9dc8-79a9e12fd6da/saml2");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='i0116']")) .sendKeys("addf@123.com");
	}

}
