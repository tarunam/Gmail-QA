/**
 * This is the main class of the Gmail loging and Composing email functionality.
 * 
 */
package GmailPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author tarunam.nair
 *
 */
public class MainGmail {
	
	public static void main(String[] args) throws InterruptedException, IOException{	 
		
		  WebDriver driver = new FirefoxDriver();		  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get(Constants.URL);
		  
		  driver.manage().window().maximize();
		  
		  LoginObj.logintogmail(driver);		  
		   
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  ComposeMail.composingemail(driver);	  	   
		
		  System.out.println("Success");
		  driver.close();
		
	}

}
