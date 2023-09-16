package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandligMultiSelectDropdown {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("file:///C:/Users/user/Desktop/HTml/dropM.html");
				
				WebElement multiSelectDD = driver.findElement(By.id("menu"));
				
				Select sel = new Select(multiSelectDD);
				
				Thread.sleep(2000);
				
				sel.selectByIndex(1);
				
				//To using Index
				
				Thread.sleep(2000);
				
				sel.selectByVisibleText(" Vadapav ");
				
				Thread.sleep(2000);
				
				sel.selectByValue("v5");
				
				// To deselect using Index
				sel.deselectByIndex(3);
				
				Thread.sleep(2000);
				
				//To deselect using Visible Text
				
				sel.deselectByVisibleText(" Doda ");
				
				
				Thread.sleep(2000);
				
				//To deselect Using value
				
				sel.deselectByValue("v5");
				
				//To select Multiple options using loop
				
				for(int i=0; i<5; i++)
				{
					sel.selectByIndex(i);
					
					Thread.sleep(2000);
				}
				Thread.sleep(2000);
}

}
