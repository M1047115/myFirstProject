package asgn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ques {		
		public void ques1()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
		public void ques2()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.navigate().refresh();
		}
		
		public void ques7()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver = new ChromeDriver();
			driver.get("https://gmail.com");

			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mydemo12345678@gmail.com");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Demo@123");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			driver.manage().window().maximize();
		}
		public void ques16()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			try{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{}
			
			driver.switchTo().frame("iframeResult");
			System.out.println("hello");
			driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
			

		}
		public void ques10()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://pimcore.com/en/try");
			 driver.manage().window().maximize();
		}
		public void ques14()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			driver.findElement(By.xpath("//a[@title='QFX K11 Basic Feature Dual Sim Mobile Phone (Black)']")).click();
		}
		public void ques9()
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
			try{Thread.sleep(3000);}catch(InterruptedException e) {}
			String s=driver.findElement(By.id("email")).getText();
			System.out.println(s);
			if(s.equals("9040290007"))
				System.out.println("Verified mail id");
			else
				System.out.println("Not same");
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
		}
		public void ques5()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Actions builder = new Actions(driver);

			Action move = builder.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools'] //a[@data-nav-role='signin']"))).build();
			move.perform();

			Actions click = builder.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin']"))).click();
			click.perform();
		        Action letters = builder.keyDown(Keys.SHIFT).sendKeys("finished").keyUp(Keys.SHIFT).build();
			letters.perform();
		}
		public void ques11()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			WebDriver driver=new ChromeDriver();
			driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
			System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13'] //tbody //tr[1] //td[2]")).getText());
			driver.findElement(By.xpath("//table[@class='tsc_table_s13'] //tbody //tr[1] //a")).click();
		}
		public void ques15()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			  WebDriver driver=new ChromeDriver();
			  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
              driver.findElement(By.xpath("//div[@class=\"wO nr l1\"] //textarea[@name=\"to\"]")).sendKeys("hello");
              driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).sendKeys("hello");
              driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("hello");
              driver.findElement(By.xpath("//div[@id=':te']")).click();
		}
		public void ques13()
		{
			String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver",pathChromeDriver);
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://toolsqa.com/automation-practice-table/");
			 List<WebElement> a=driver.findElements(By.xpath("//tr[@class='odd']"));
			 for(WebElement b:a)
			 {
				System.out.println(b.getText()); 
			 }
			String s= driver.findElement(By.xpath("//table[@class='tsc_table_s13']//td[contains(text(),'Dubai')]")).getText();
			 System.out.println(s);
		}
		public static void main(String[] args) {
			Ques ob=new Ques();
			ob.ques13();
			
	}
		
}
	
	 