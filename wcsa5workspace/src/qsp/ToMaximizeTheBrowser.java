package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToMaximizeTheBrowser {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		 Scanner scann = new Scanner(System.in);

		System.out.println("Enter The Browser Name That You Want To Open");

		String browserValue =  scann.next();

		if(browserValue.equalsIgnoreCase("Chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		    driver = new ChromeDriver();

			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}

		else if(browserValue.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

			 driver = new FirefoxDriver();
			
			
			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.close();
		} 
		
		else {
			System.out.println("PLEASE ENTER VALID BROWSER NAME");
		}

	}
}




