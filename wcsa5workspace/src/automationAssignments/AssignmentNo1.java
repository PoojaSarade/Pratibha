package automationAssignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Dimension size = new Dimension(500, 400);
		driver.manage().window().setSize(size);
		
        Thread.sleep(4000);
        
        
       Point point = new Point(400, 500);
       driver.manage().window().setPosition(point);
       
       driver.close();
	}

}
