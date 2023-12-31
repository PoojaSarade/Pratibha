package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-3im63i8:81/login.do");
		
		Flib flib = new Flib();
		
		for(int i=1;i<=8; i++)
		{
			String invalidUsername = flib.readExcelData("./data/ActitimeTestData.xlsx","invalidcreds", i , 0);
			
			String invalidPassword = flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds", i , 1);
			
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("username")).clear();
			
			
		}
	}

}
