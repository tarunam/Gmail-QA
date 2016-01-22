/**
 * This class is used for logging into Gmail using the username and 
 * password provided in the xls.
 */
package GmailPackage;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class LoginObj {
	
	static String username;
	static String password;
	
	
	  public LoginObj(String username, String password) {
	    this.username = username;
	    this.password = password;
	  }
	  
	  public static void logintogmail(WebDriver driver) throws IOException{
		  
		  ArrayList loginDetails = new ArrayList();
		  ArrayList<LoginObj> userlist = new ArrayList<LoginObj>();
		  String filePath = System.getProperty("user.dir");		  
		  userlist = Util.readexcel(filePath, Constants.Filename, Constants.Sheetname);
		  
		  for(LoginObj lm: userlist) {
			  username = lm.username;
			  password = lm.password;
			  
			  Login.txtbx_UserName(driver).sendKeys(username);
			  
			  Login.btn_Next(driver).click();
			  
			  Login.txtbx_Password(driver).sendKeys(password);
			 
			  Login.btn_LogIn(driver).click();
			}
		  
		  
	  }

}
