package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority =0)
  public void f() {
	  System.out.println("f");
  }
  @Test
  public void i() {
	  System.out.println("i");
  }
  @Test(priority=3)
  public void z() {
	  
  }
  
}
