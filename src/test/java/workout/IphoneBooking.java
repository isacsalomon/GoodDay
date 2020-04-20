package workout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Browser.ChromeBrowserLaunch;

public class IphoneBooking extends ChromeBrowserLaunch
{
@Test
public void ratechecker() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	//List<WebElement>links=driver.findElements(By.tagName("a"));
	//System.out.println("Total no of links in the wiki home page is "+ links.size());
	//for (WebElement ele : links)
	//{
	//	System.out.println(ele.getText());
	//driver.findElement(By.name("q")).sendKeys("Manual Testing",Keys.ENTER);
	//driver.findElement(By.className("gLFyf gsfi")).sendKeys("Testing",Keys.ENTER);
	driver.findElement(By.name("email")).sendKeys("isacsalomon@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Johan@2013");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Watch']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Sathiyam TV']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Latest V')]")).click();
	
	//driver.findElement(By.xpath("//div[starts-with(@class,'_3d2d')]")).sendKeys("Testing",Keys.ENTER);
	
	
	//driver.findElement(By.xpath(""))
//	List<WebElement>links=driver.findElements(By.tagName("a"));
//	driver.findElement(By.xpath("//div[@class='fbChatSidebar fixed_always _5pr2']")).l
//	for(WebElement ele :links)
//	{
//	System.out.println(ele.getText());
//	}
//	//<WebElement> element= new WebElement();
//	//driver.findElement(By.xpath("//div[contains(text(),'Watch'")).click();
//	//driver.findElement(By.className("_1vp5")).click();
//}
}

}





