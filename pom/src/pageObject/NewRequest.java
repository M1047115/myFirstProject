package pageObject;

import org.openqa.selenium.By;

import utilities.Constant;

public class NewRequest {
public void request()
{
	Constant.driver.findElement(By.xpath("//input[@value='New Request']")).click();
}
}
