package workout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Browser.ChromeBrowserLaunch;

public class DropdownSelection extends ChromeBrowserLaunch
{
	@Test
	public void Drpdownselection() throws InterruptedException
	{
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown=driver.findElement(By.cssSelector("#searchLanguage"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByValue("ta");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("tamil language",Keys.ENTER);
		
		
		
		
		
		
	}

}
