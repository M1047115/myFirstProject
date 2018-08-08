package ams;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class NewTest {
	static WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@value='New Request']")).click();
  }
  @Test
  public void f1() throws InterruptedException
  {
	  driver.findElement(By.xpath("//select[@id='ddlRequestType']")).click();
  	driver.findElement(By.xpath("//select[@id='ddlRequestType']//option[@value='1']")).click();
  	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  	LocalDate localDate = LocalDate.now();
  	driver.findElement(By.xpath("//input[@name='requestFromDate']")).sendKeys(dtf.format(localDate));
    Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[@id='drpFromTime']")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[@id='drpFromTime']//option[@value='8:00 PM']")).click();
  	driver.findElement(By.xpath("//input[@name='requestToDate']")).sendKeys(dtf.format(localDate));
  }
  @Test
  public void f2() throws InterruptedException
  {
  	driver.findElement(By.xpath("//select[@id='drpToTime']")).click();
  	Thread.sleep(2000);
  }
  @Test
  public void f3()
  {
	  driver.findElement(By.xpath("//select[@id='drpToTime']//option[@value='10:30 PM']")).click();
  	driver.findElement(By.xpath("//textarea[@id='requestorComments']")).sendKeys("Going out");
  	driver.findElement(By.xpath("//input[@name='None']")).click();
  	driver.findElement(By.xpath("//input[@id='submit']")).click();
  }
  @BeforeSuite
  public void beforeMethod() {
	  String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
  	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
  	driver= new ChromeDriver();
  	driver.get("https://corpapps.mindtree.com/ams/StayOut/GetCampusStayOutRequest");
  }
  

  @AfterSuite
  public void afterMethod() {
	  driver.close();
  }

}
