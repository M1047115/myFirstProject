package ques1.ques1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ques1Test {
  static WebDriver driver;
  @Parameters({ "username", "password" })
  @Test
  public void f(String username,String password) {
	  driver.findElement(By.xpath("\\input[@aria-label='First name']")).sendKeys(username);
  }
  @BeforeMethod
  public void beforeMethod() {
	  String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	  	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
	  driver= new ChromeDriver();
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
