/**
 * This class is used for locating the web elements of the login screen. 
 */
package GmailPackage;

import org.openqa.selenium.*;


/* This is used for the login functionality */
public class Login {
	
	public static WebElement txtbx_UserName(WebDriver driver){
		 
        WebElement element = driver.findElement(By.id("Email"));

        return element;

        }
	
	public static WebElement btn_Next(WebDriver driver){
		
    	WebElement element = driver.findElement(By.cssSelector("#next"));

        return element;

        }

    public static WebElement txtbx_Password(WebDriver driver){

    	WebElement element = driver.findElement(By.id("Passwd"));
    	
        return element;

        }

    public static WebElement btn_LogIn(WebDriver driver){

    	WebElement element = driver.findElement(By.cssSelector("#signIn"));

        return element;

        }

}
