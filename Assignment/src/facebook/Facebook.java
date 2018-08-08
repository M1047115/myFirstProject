package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
static WebDriver driver;

public void t1() throws InterruptedException
{
	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
	WebDriver driver= new ChromeDriver();
	driver.get("http://facebook.com/");
	driver.findElement(By.id("email"));
	System.out.println("Email tab present");
	driver.findElement(By.id("email")).sendKeys("9040290007");
	driver.findElement(By.id("pass"));
	System.out.println("Password tab present");
	driver.findElement(By.id("pass")).sendKeys("abcd");
	Thread.sleep(3000);
	String s=driver.findElement(By.id("email")).getText();
	System.out.println(s);
	if(s.equals("9040290007"))
		System.out.println("Verified mail id");
	else
		System.out.println("Not same");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
public static void main(String args[])
{
	Facebook ob=new Facebook();
	try {
		ob.t1();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}