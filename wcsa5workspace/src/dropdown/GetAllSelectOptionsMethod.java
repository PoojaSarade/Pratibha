package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectOptionsMethod {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///C:/Users/user/Desktop/HTml/dropM.html");
			
			//identify dropDown
			
			WebElement dropDownElement = driver.findElement(By.id("i1"));
			
			//handle the dropDown
			
			Select sel = new Select(dropDownElement);
			
			//select multiple options from dropDown
			
			for(int i=2; i<=5;i++)
			{
				Thread.sleep(2000);
				sel.selectByIndex(i);
			}
			

	}

}
