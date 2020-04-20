package workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Browser.ChromeBrowserLaunch;
import Utilities.Support;

public class test1 extends ChromeBrowserLaunch
{
	
	@Test
	public void learning() throws InterruptedException
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("isacsalomon@rediffmail.com");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(2000);
	    Support.alertdismiss(driver);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	    Support.alertAccept(driver);
	    
	
	}
	}


