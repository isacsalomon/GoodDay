package workout;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MozillaFB {

	protected WebDriver driver;
	
	@BeforeClass
	public void mofb()throws IOException
		{
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fops=new FirefoxOptions();
		fops.setAcceptInsecureCerts(true);
		driver=new FirefoxDriver();
	}
//	@AfterClass
//	public void closure()throws InterruptedException
//	{
//		Thread.sleep(2000);
//		driver.close();
	}
	

