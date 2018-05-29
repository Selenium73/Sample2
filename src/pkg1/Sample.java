package pkg1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Sample {
	
	public WebDriver driver;
	
	@BeforeClass
	public void class_1(){
		//driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void method_1(){
	System.out.println("inside before method");
	}
	

  @Test
  public void test1(){
	 // int i = 1/0;
		System.out.println("Inside test method");
	  
  }
  
  @Test(dependsOnMethods = "test1")
  public void test2() throws InterruptedException{
	 
	System.out.println("Test Complete");
	
  }
  
  @Test
  public void test3() throws InterruptedException{
	 
	System.out.println("Inside Complete");
  }
  
  @AfterMethod
  public void method_2(){
	  System.out.println("Inside after method");
  }
  
  
  public void class_2(){
		System.out.println("Inside after class");
	}
  
}
