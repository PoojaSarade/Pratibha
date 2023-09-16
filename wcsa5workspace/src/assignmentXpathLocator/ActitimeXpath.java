package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeXpath {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://desktop-3im63i8:81/login.do");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(1000);
        driver.findElement(By.linkText("Projects & Customers")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@size='57']")).sendKeys("abcsd123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("ads,jhdg,2562,iudif,6538");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Projects & Customers")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//select[@name='customerId']")).sendKeys("dsdshd12");
	    Thread.sleep(1000);
	    
	        
		

	}

}
