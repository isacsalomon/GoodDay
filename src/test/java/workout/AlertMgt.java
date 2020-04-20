package workout;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import Browser.ChromeBrowserLaunch;

public class AlertMgt extends ChromeBrowserLaunch
{

	@Test
	public void almgmt() throws InterruptedException
	{
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.cssSelector(".signin")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("isacsalomon@rediffmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert action=driver.switchTo().alert();
		action.accept();
	}
	
	
	
	
	
	
	
}
