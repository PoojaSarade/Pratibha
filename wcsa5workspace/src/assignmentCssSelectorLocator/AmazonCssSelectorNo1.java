package assignmentCssSelectorLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCssSelectorNo1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_e&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=13382143600809904501&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062089&hvtargid=kwd-316976916880&hydadcr=5841_2362028");
		
		driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
		
		driver.findElement(By.cssSelector("input[id='ap_email']")) .sendKeys("9567432187");
		
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		
		driver.findElement(By.cssSelector("span[class='hm-icon-label]")).click();
	}
	
 
}
