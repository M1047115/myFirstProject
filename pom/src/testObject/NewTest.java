package testObject;

import org.testng.annotations.Test;

import pageObject.NewRequest;
import pageObject.RaiseRequest;
import utilities.Constant;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	static WebDriver driver;
  @Test
  public void f() {
	  NewRequest ob=new NewRequest();
	  
	  ob.request(driver);
  }
  @Test
  public void f1() throws InterruptedException
  {
	  RaiseRequest ob=new RaiseRequest();
	  ob.raise();
  }
  @BeforeSuite
  public void beforeSuite() {
	  String pathChromeDriver="Constant.url";
	  	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
	  	driver= new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
	 driver.close();
  }
  
  public static void main(String args[]) throws InterruptedException
  {
	  NewTest ob=new NewTest();
	  ob.f();
	  ob.f1();
  }

}