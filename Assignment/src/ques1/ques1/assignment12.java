package ques1.ques1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment12 {
	public static void main(String args[])
	{
		String path ="C:\\Users\\M1046820\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 Select oSelect = new Select(driver.findElement(By.id("continents")));
			oSelect.selectByVisibleText("Europe");
			//Thread.sleep(2000);
			oSelect.selectByIndex(2);
			List<WebElement> oSize = oSelect.getOptions();
			int iListSize = oSize.size();
			for(int i =0; i < iListSize ; i++){	
				String sValue = oSelect.getOptions().get(i).getText();
				System.out.println(sValue);
				if(sValue.equals("Africa")){
					oSelect.selectByIndex(i);
					break;
					}
				}	   
			}
	}