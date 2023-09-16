package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "Login Method!!")
  public void method1() {
	  Reporter.log("Method 1 from flag1");
  }
  @Test(description = "LogOut Method!!")
  public void method2() {
	  Reporter.log("Method2 from flag1");
  }
}
