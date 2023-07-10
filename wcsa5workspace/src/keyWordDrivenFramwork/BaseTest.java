package keyWordDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Flib implements IautoConstant{
	
	//it is use to open and close the browser(by reading a data from property
	
	public void openBrowser()  throws IOException
	{
		Flib flib = new Flib();
		
 String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
 String url = flib.readPropertyData(PROP_PATH,"Url");
 
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_PATH);
		
		driver = new ChromeDriver();
	}
	else if(browserValue.equalsIgnoreCase("firefox))"
			{
				System.setProperty(GECKO_KEY, GECKO_PATH);
				driver = new FirefoxDriver();
				
			}
			else if(browserValue.equalsIgnoreCase("edge"))
			{
				System.setProperty(EDGE_KEY, EDGE_PATH);
				driver = new EdgeDiver();
			}
			else
			{
				System.out.println("Enter valid browserValue!!!");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	}
			
			
			
			
			
			
			
			
			
			
			
			
}
