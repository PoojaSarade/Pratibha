package testNGAnnotations_Flags;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {
  @Test
  public void method1() {
	  Reporter.log("TestAnnotation", true);
  }
  @AfterMethod
  public void method2() {
	  Reporter.log("AftreAnnotation", false);
	  
  }
  @BeforeMethod
  public void method3() {
	  Reporter.log("AftreAnnotation", false);
  }
  @BeforeClass
  public void method4() {
	  Reporter.log("BeforeClassAnnotation", false);
  }
  @AfterClass
  public void method5() {
	  Reporter.log("AftreClassAnnotation", false);
	  
  }
  @BeforeSuite
  public void method6() {
	  Reporter.log("BeforeSuiteAnnotation", false);
  }
  @AfterSuite
  public void method7() {
	  Reporter.log("AftreSuiteAnnotation", false);
  }
  @BeforeTest
  public void method8() {
	  Reporter.log("BeforeTestAnnotation", false);
  }
  @AfterTest
  public void method9() {
	  Reporter.log("AftreTestAnnotation", false);
  }
  @Test
  public void method10()
  {
	  Reporter.log("TestAnnotation2", true);
  }
}
