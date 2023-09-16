package assignmentXpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2ByUsingTextFunction {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		
		driver.findElement(By.xpath("//i[@class='icon-user-line soul-icon NAV_ICON_FONT_SIZE']")).click();
		
		driver.findElement(By.xpath("//span[text()='Log In' and (@class=' ON_IMAGE BUTTON2_SEMIBOLD ')]")).click();
		
	}

}
