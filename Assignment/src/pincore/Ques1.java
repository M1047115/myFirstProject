package pincore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {

	static WebDriver driver;
	public void q1()
	{
		String pathChromeDriver="C:\\Users\\M1047115\\eclipse-workspace\\test\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",pathChromeDriver);
		 driver= new ChromeDriver();
		driver.get("https://pimcore.com/en/try");
		List<WebElement> l=driver.findElements(By.xpath("//a[contains(text(),'Products')]"));
		for(WebElement e:l)
			System.out.println(e.getText());
	}
	public static void main(String args[])
	{
		Ques1 q=new Ques1();
		q.q1();
	}
}
