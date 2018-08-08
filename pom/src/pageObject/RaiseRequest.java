package pageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Constant;

public class RaiseRequest {
public void raise() throws InterruptedException
{
	WebDriver driver=Constant.driver;
	driver.findElement(By.xpath("//select[@id='ddlRequestType']//option[@value='1']")).click();
  	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  	LocalDate localDate = LocalDate.now();
  	driver.findElement(By.xpath("//input[@name='requestFromDate']")).sendKeys(dtf.format(localDate));
    Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[@id='drpFromTime']")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[@id='drpFromTime']//option[@value='8:00 PM']")).click();
  	driver.findElement(By.xpath("//input[@name='requestToDate']")).sendKeys(dtf.format(localDate));
  	driver.findElement(By.xpath("//select[@id='drpToTime']")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//select[@id='drpToTime']//option[@value='10:30 PM']")).click();
  	driver.findElement(By.xpath("//textarea[@id='requestorComments']")).sendKeys("Going out");
  	driver.findElement(By.xpath("//input[@name='None']")).click();
  	driver.findElement(By.xpath("//input[@id='submit']")).click();

}
}
