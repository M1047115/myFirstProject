package com.mindtree.selenium.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws InterruptedException
    {
        App ob=new App();
        ob.test6();
    }
    public void test1()
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.google.com");
    	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("flipkart");
    	driver.findElement(By.xpath("//input[@value='Google Search']")).click();
    	//web.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	//WebDriverWait
    }
    public void test2()
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://store.demoqa.com");
    	driver.findElement(By.xpath("//div[@id='account']")).click();
    	driver.findElement(By.xpath("//input[@id='log']")).sendKeys("ankitsahu9");
    	driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("pass");
    	driver.findElement(By.xpath("//input[@id='login']")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	String actual=driver.findElement(By.linkText("Lost your password?")).getText();
    	System.out.println(actual);
    	String expected="Lost your password?";
    	if(actual.equals(expected))
    		System.out.println("Incorrect id or password");
    	else
    		System.out.println("abc");
    	
    }
    public void test3()
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https:/flipkart.com");
    	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
    	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
    	
    	   }
    public void test4()
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https:/amazon.in");
    	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
    	driver.findElement(By.xpath("//input[@value='Go']")).click();
    	String expected=driver.findElement(By.xpath("//a[@title='Redmi 5 (Gold, 32GB)']")).getText();
    	System.out.println(expected);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    	//driver.findElement(By.xpath("//h2[@data-attribute='Redmi 5 (Gold, 32GB)']//ancestor::div[@class='a-row a-spacing-none']")).click();
    	driver.findElement(By.xpath("//div[@class='s-item-container']//ancestor::li[@id='result_4']//h2[@data-attribute='Redmi 5 (Gold, 32GB)']")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	//String expected=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
    	//System.out.println(expected);
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//driver.findElement(By.xpath("//h2[@data-attribute='Redmi 5 (Gold, 32GB)']//ancestor::div[@class='s-item-container']")).click();
    	for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		} 
    	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    	driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
    	String actual=driver.findElement(By.xpath("//span[@class='a-size-medium sc-product-title a-text-bold']")).getText();
    	System.out.println(actual);
    	if(expected.equals(actual))
    		System.out.println("Verified");
    }
    
    public void test5()
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https:/flipkart.com");
    	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    	driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']//span[contains(text(),'Electronics')]")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.linkText("Mobiles")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_3b7jyH']//img[@alt='Mi']")).click();
    	
    	//driver.findElement(By.xpath("//a[@hr/ef='mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles\']")).click();
    }
    public void test6() throws InterruptedException
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https:/gmail.com");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("ankitsahu9");
    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("wunder@123");
    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    	String s=driver.findElement(By.xpath("//div[@aria-label='Primary']")).getText();
    	if(s.equals("Primary")) {
    		System.out.println("Verified");
    	}
    		Thread.sleep(3000);
    		List<WebElement> a= driver.findElements(By.xpath("\\table[@id=':34']"));
    		int count=a.size();
    		System.out.println(count);
    	
    	
    }
    public void test7() throws InterruptedException
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://corpapps.mindtree.com/ams/StayOut/GetCampusStayOutRequest");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@value='New Request']")).click();
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
    	driver.findElement(By.xpath("//select[@id='drpToTime']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//select[@id='drpToTime']//option[@value='10:30 PM']")).click();
    	driver.findElement(By.xpath("//textarea[@id='requestorComments']")).sendKeys("Going out");
    	driver.findElement(By.xpath("//input[@name='None']")).click();
    	driver.findElement(By.xpath("//input[@id='submit']")).click();
    }
    public void test8() throws InterruptedException
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("https:/gmail.com");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("ankitsahu9");
    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("wunder@123");
    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
    	String s=driver.findElement(By.xpath("//div[@aria-label='Primary']")).getText();
    	if(s.equals("Primary")) {
    		System.out.println("Logged in");
    }
    	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
    	//String s1=driver.findElement(By.xpath("//div[id=':n2']")).getText();
    	driver.findElement(By.xpath("//div[@id=':l2']"));
    	System.out.println("Verified compose");
    	driver.findElement(By.xpath("//textarea[@id=':oi']")).sendKeys("saurabh@qatechhub.com");
    	driver.findElement(By.xpath("//input[@id=':o0']")).sendKeys("Test mail");
    	driver.findElement(By.xpath("//div[@id=':nq']")).click();
    	
}
    public void test9() throws InterruptedException
    {
    	String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
    	WebDriver driver= new ChromeDriver();
    	driver.get("http://toolsqa.com/");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-17611 has-children']//a[@data-level='1']")).click();
    	driver.findElement(By.xpath("//span[contains(text(),'E-Commerce Demo Site')]")).click();
    	Thread.sleep(2000);
    	for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		} 
    	Thread.sleep(5000);
    	//String a=driver.findElement(By.xpath("//span[contains[text(),'Home']")).getText();
    	//System.out.println(a);
    	
    	int count=0;
    	List<WebElement> a=driver.findElements(By.xpath("//nav[@class='group']//ul[@id='menu-main-menu']//li"));
    	
    	for(WebElement b:a)
    	{
    		//count++;
    		//if(b.getText()!=" ")
    		System.out.println(b.getText());
    	}
    	//System.out.println(count);
    }
}