package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class NewTest {
	static WebDriver driver;
	
  @Test
  public void f() {
  	driver.findElement(By.xpath("//div[@id='account']")).click();
  	
  }
 @Test
  public void f1()
  {
	  driver.findElement(By.xpath("//input[@id='log']")).sendKeys("ankitsahu9");
	  	driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("pass");
	  	driver.findElement(By.xpath("//input[@id='login']")).click();
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	String actual=driver.findElement(By.linkText("Lost your password?")).getText();
	  	System.out.println(actual);
	  	String expected="Lost your password?";
	  	if(actual.equals(expected))
	  		System.out.println("Incorrect id or password");
	  	else
	  		System.out.println("abc");
  }
  
  @BeforeSuite
  public void beforeMethod() {
	  String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
  	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
  	 driver= new ChromeDriver();
  	driver.get("https://store.demoqa.com");
  }

  @AfterSuite
  public void afterMethod() {
	  driver.close();
  }
  public static void main(String args[])
  {
	  NewTest ob=new NewTest();
	  ob.f();
	  ob.f1();
  }

}