package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "Login Method!!",enabled=true)
  public void method1() {
	  Reporter.log("Method1 from falg2", true);
  }
  @Test(description = "LogOut Method!!",enabled=true)
  public void method2() {
	  Reporter.log("Method1 from falg2", true);
  }
}
