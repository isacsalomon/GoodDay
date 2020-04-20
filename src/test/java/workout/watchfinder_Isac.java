package workout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.ChromeBrowserLaunch;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class watchfinder_Isac extends ChromeBrowserLaunch{
	
	@Test
	public void openBrowser() throws InterruptedException {
		Actions action=new Actions(driver);
		driver.get("https://mail.google.com/mail");
		driver.findElement(By.id("identifierId")).sendKeys("isacsalomon@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		//driver.findElement(By.xpath(By."//input[@type='text'][@id='twotabsearchtextbox']")).sendKeys("watch",Keys.ENTER);
		//Thread.sleep(2000);
		//WebElement elementLocator=driver.findElement(By.xpath("//img[@data-image-index='7']"));
		//action.doubleClick(elementLocator).perform();
		
		//driver.findElement(By.id("//input[@id='add-to-cart-button']")).click();

        }
		
		
		
		
	}

