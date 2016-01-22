/**
 * This is the class used for composing and sending the email to the mail id
 * specified in the "to" field.
 */
package GmailPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author tarunam.nair
 *
 */
public class ComposeMail {

	public static void composingemail(WebDriver driver) {
		
		
		//Click on the compose button to write an email
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();		  
	  	
		//Fill the "to" field to send an email
 	    driver.findElement(By.cssSelector("textarea[class='vO']")).sendKeys(Constants.Toemail);
 	    
 	    //Fill the "subject" field 
	    driver.findElement(By.cssSelector("input[class='aoT']")).sendKeys(Constants.Subjemail);
	  
	    //Write the body of email.
	    driver.findElement(By.cssSelector("div[class='Am Al editable LW-avf']")).click();
	    driver.findElement(By.cssSelector("div[class='Am Al editable LW-avf']")).sendKeys(Constants.Mailbody);
	  
	    //Click on the send button to send the email
	    driver.findElement(By.xpath("//div[text()='Send']")).click();
	  
	    // Click on the image icon present in the top right navigational Bar
	    driver.findElement(By.cssSelector("a[class='gb_b gb_4a gb_R']")).click();
	  
	    //Click on 'Logout' Button
	    driver.findElement(By.linkText("Sign out")).click();
		  
		//Close the browser.
		driver.switchTo().alert().accept();
		
	}
	
	

}
