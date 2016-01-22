/**
 * This class is just a utility class which can be used in the project for  
 * common purposes like reading a file etc.
 */
package GmailPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;


public class Util{
	
	public static ArrayList readexcel(String filePath, String fileName, String sheetName) throws IOException{
		
				
		String username = new String();
		String password = new String();
		
		ArrayList<LoginObj> userlist = new ArrayList<LoginObj>();
		
		File file = new File(filePath + "\\" + fileName);
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wbk  = new XSSFWorkbook(fis);	
		
		Sheet wbkSheet = wbk.getSheet(sheetName);
		 
	    //Find number of rows in excel file
	 
	    int rowCount = wbkSheet.getLastRowNum()-wbkSheet.getFirstRowNum();
	 
	    //Create a loop over all the rows of excel file to read it
	 
	    for (int i = 0; i < rowCount+1; i++) 
	    {
	 
	        Row row = wbkSheet.getRow(i);
	        
	        if(i==0)
	        {
	        	System.out.println("Reading Username and Password from xls");
	        }
	        else
	        {	        
        		for (int j = 0; j < row.getLastCellNum(); ++j) 
        		{     		 
        			
	                //Print excel data in console	     
	                //System.out.print(row.getCell(j).getStringCellValue()+"|| ");	                
					username = row.getCell(j).getStringCellValue();					
					password = row.getCell(++j).getStringCellValue();				
					
        			userlist.add(new LoginObj(username, password));			
        								     
        		}
	        
	        }
	        
	    }
	    return userlist;
	}

}
