package methodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		//get the address of current or child window
		
		String parentHandle = driver.getWindowHandle();

		System.out.println("address of parent window : "+parentHandle);
		
		driver.findElement(By.partialLinkText("open a popup window")).click();
		Thread.sleep(2000);
		
	//	String childHandle = driver.getWindowHandle();
		
	//System.out.println("address of parent window : "+childHandle);
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			System.out.println(wh);
		}
			
	}


	}


