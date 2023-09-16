package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		//to call the WebElement of login page create the object of login page class
		
		LoginPage lp = new LoginPage(driver);
		
		lp.validLoginMehtod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		
		//use homePage Elements create object of HomePage POM
		
		HomePage hp = new HomePage(driver);
		
		hp.clickOnLogoutLink();
		
	}

}
