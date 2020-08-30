/**
 * 
 */
package com.Guru99BankApp.Verify;
import org.openqa.selenium.WebDriver;


/**
 * @author umutx
 *
 */
public class VerifyPage {

	/**
	 * @param args
	 */
	
		public static boolean verifyPageURL(WebDriver driver, String ExpURL) 
		
		{
			
			boolean flag = false; 
			if(driver.getCurrentUrl().equalsIgnoreCase(ExpURL));
			{
				
				flag = true;
				
			}
				return flag; 
			
			
			
		}
		
		
		
		public static boolean verifyPageSectionInfo(WebDriver driver, String ExpTitle) 
		
		{
			
			boolean flag = false; 
			if(driver.getTitle().equalsIgnoreCase(ExpTitle));
			{
				
				flag = true;
				
			}				return flag; 
		}
}