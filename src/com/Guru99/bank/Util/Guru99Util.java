/**
 * 
 */
package com.Guru99.bank.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author umutx
 *
 */
public class Guru99Util {

	public static Object fetchPropertiesValue(String key) throws IOException
	{
		
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\umutx\\eclipse-workspace\\GURU99LiveSupport\\Config\\Config.properties");
		
		Properties property = new Properties();
		
		property.load(file);
		
		return property.get(key);
	}
	
	
	
	public static String fetchElementLocaterValue(String key) throws IOException
	{
		
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\umutx\\eclipse-workspace\\GURU99LiveSupport\\Config\\Elements.properties");
		
		Properties property = new Properties();
		
		property.load(file);
		
		return property.get(key).toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
