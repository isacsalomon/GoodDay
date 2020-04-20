package Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Support {

	public static void alertAccept(WebDriver driver) throws InterruptedException {

	      Alert alert =  driver.switchTo().alert();
	      String alertmsg=alert.getText();
	      System.out.println("ALert title : "+ alertmsg);
	        Thread.sleep(2000);
	      alert.accept();
	      
	}
	
		public static void alertdismiss(WebDriver driver) throws InterruptedException {
			{
		      Alert alert =  driver.switchTo().alert();
		      System.out.println("ALert title : "+alert.getText());
		        Thread.sleep(2000);
		      alert.dismiss();
			}
		
	}
			public static void Alertmessage(WebDriver driver) throws InterruptedException {
				{
			      Alert alert =  driver.switchTo().alert();	
			      
			
	}
}
}