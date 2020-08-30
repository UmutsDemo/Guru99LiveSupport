/**
 * 
 */
package com.Guru99BankApp.driverset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.Guru99.bank.Util.*;
import com.Guru99.bank.Util.Guru99Util.*;

/**
 * @author umutx
 *
 */
public class DriverInstances {
	
	
public static WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception
	
	{
		
		if(Guru99Util.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/GURU99LiveSupport/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
	

		else if(Guru99Util.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\umutx\\eclipse-workspace\\GURU99LiveSupport\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
	
		else if(Guru99Util.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.ie.driver", "/GURU99LiveSupport/Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	
	
		else 
		{
			System.setProperty("webdriver.chrome.driver", "/GURU99LiveSupport/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
	
	
	
		driver.get(Guru99Util.fetchPropertiesValue("appURL").toString());
	
	
	
	
	
	
	
	
	
	
	}
		
	
	
	
	
	
	
	
	

	@AfterMethod
	
	
public void closeDriverInstance()
	
	
	{
		
		driver.quit();
		System.out.println("driver has been close!!!");
		
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


