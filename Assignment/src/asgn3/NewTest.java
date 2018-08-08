package asgn3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
public class NewTest {
	static WebDriver driver;
	 
	public void gen()
	{
		Select str=new Select(driver.findElement(By.name("passCount")));
		 str.selectByIndex(3); 
		// Select str1=new Select(driver.findElement(By.name("fromPort")));
		// str1.selectByIndex(3); 
		 Select str2=new Select(driver.findElement(By.name("fromMonth")));    
		 str2.selectByIndex(10); 
		 Select str3=new Select(driver.findElement(By.name("fromDay")));    
		 str3.selectByIndex(18);   
		 //Select str4=new Select(driver.findElement(By.name("toPort")));
		 //str4.selectByIndex(2);
		 Select str5=new Select(driver.findElement(By.name("toMonth")));
		 str5.selectByIndex(10); 
		 Select str6=new Select(driver.findElement(By.name("toDay")));
		 str6.selectByIndex(19); 
		 driver.findElement(By.xpath("//input[@value='First']")).click();
		 Select str7=new Select(driver.findElement(By.name("airline")));
		 str7.selectByIndex(2);
		 driver.findElement(By.xpath("//input[@type='image']")).click();
		 driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		 driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		 driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
		 driver.findElement(By.xpath("//input[@type='image']")).click();
		 driver.findElement(By.name("passFirst0")).sendKeys("Tester1");
		 driver.findElement(By.name("passLast0")).sendKeys("LN1");
		 driver.findElement(By.name("passFirst1")).sendKeys("Tester2");
		 driver.findElement(By.name("passLast1")).sendKeys("LN2");
		 driver.findElement(By.name("passFirst2")).sendKeys("Tester3");
		 driver.findElement(By.name("passLast2")).sendKeys("LN3");
		 driver.findElement(By.name("passFirst3")).sendKeys("Tester4");
		 driver.findElement(By.name("passLast3")).sendKeys("LN4");
		 Select str8=new Select(driver.findElement(By.name("pass.0.meal")));
		 str8.selectByIndex(3);
		 Select str9=new Select(driver.findElement(By.name("pass.1.meal")));
		 str9.selectByIndex(5);
		 Select str10=new Select(driver.findElement(By.name("pass.2.meal")));
		 str10.selectByIndex(4);
		 Select str11=new Select(driver.findElement(By.name("pass.3.meal")));
		 str11.selectByIndex(0);
		 Select str12=new Select(driver.findElement(By.name("creditCard")));
		 str11.selectByIndex(0);
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("234234");
		 Select str13=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		 str13.selectByIndex(0);
		 Select str14=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		 str14.selectByIndex(0);
		 driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
		 driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("101 Notting Hill");
		 driver.findElement(By.xpath("//input[@name='billCity']")).clear();
		 driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("New Jersey");
		 driver.findElement(By.xpath("//input[@name='billState']")).clear();
		 driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("NJ");
		 driver.findElement(By.xpath("//input[@name='billZip']")).clear();
		 driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("07342");
		 Select str15=new Select(driver.findElement(By.name("billCountry")));
		 str15.selectByVisibleText("UNITED STATES");
		 driver.findElement(By.xpath("//input[@name='delAddress1']")).clear();
		 driver.findElement(By.xpath("//input[@name='delAddress1']")).sendKeys("131 Bills road");
		 driver.findElement(By.xpath("//input[@name='delCity']")).clear();
		 driver.findElement(By.xpath("//input[@name='delCity']")).sendKeys("Alpharetta");
		 driver.findElement(By.xpath("//input[@name='delState']")).clear();
		 driver.findElement(By.xpath("//input[@name='delState']")).sendKeys("GA");
		 driver.findElement(By.xpath("//input[@name='delZip']")).clear();
		 driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys("30001");
		 Select str16=new Select(driver.findElement(By.name("delCountry")));
		 str16.selectByVisibleText("UNITED STATES");
		 driver.findElement(By.xpath("//input[@type='image']")).click();
		 driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	}
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='image']")).click();
	  Select str1=new Select(driver.findElement(By.name("fromPort")));
		 str1.selectByIndex(3); 
		 Select str4=new Select(driver.findElement(By.name("toPort")));
		 str4.selectByIndex(2);
		 gen();
  }
  @Test
  public void f1()
  {
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='image']")).click();
	  Select s1=new Select(driver.findElement(By.name("fromPort")));
		 s1.selectByIndex(1); 
		 Select s2=new Select(driver.findElement(By.name("toPort")));
		 s2.selectByIndex(2);
		 gen();
  }
  @Test
  public void f2()
  {
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='image']")).click();
	  driver.findElement(By.xpath("//input[@value='oneway']")).click();
	  Select s3=new Select(driver.findElement(By.name("fromPort")));
		 s3.selectByIndex(9); 
		 Select s4=new Select(driver.findElement(By.name("toPort")));
		 s4.selectByIndex(4);
	     gen();
  }
  @BeforeMethod
  public void beforeSuite() {
	  String path ="C:\\\\Users\\\\M1047115\\\\eclipse-workspace\\\\test\\\\driver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
  }

  @AfterMethod
  public void afterSuite() {
	  driver.close();
  }
  public static void main(String args[])
  {
	  NewTest ob= new NewTest();
	  ob.f();
	  ob.f1();
	  ob.f2();
  }

}