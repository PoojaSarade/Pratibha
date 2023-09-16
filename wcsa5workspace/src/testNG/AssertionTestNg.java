package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestNg {
  @Test
  public void verificationMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-3im63i8:81/login.do");
		//non critical features
		String actualTitle=driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), actualTitle);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		System.out.println("title mached test case passed!!!");
		sa.assertAll();
		String actualTitleOfHomePage=driver.getTitle();
		Assert.assertEquals(driver.getTitle(),"Pooja");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
  }
}
