/**
 * 
 */
package com.Guru99.AccountLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Guru99.bank.Util.Guru99Util;
import com.Guru99.bank.Util.Guru99Util.*;


/**
 * Test Scenario: Verify The Login Section.
 *
 */
public class AccountLogin {

	
	
	WebDriver driver;

	public AccountLogin(WebDriver driver) {

		this.driver = driver;

	}

	/**
	 * Test Case 1. Enter Valid User ID & Valid Passwrod.
	 *
	 */
	
	
	public void EnterUserId() throws Exception {
		String UserID = "mngr280950";

		// type UID
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_UserID_name"))).sendKeys(UserID);

		return;

	}

	public void EnterUserPWD() throws Exception {
		String UserPWD = "mUbAsYm";

		// TypePWD
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_PWD_name"))).sendKeys(UserPWD);

		return;
	}

	public void ClickSignInBtn() throws Exception {

		// click sign in Btn
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_loginBtn_name"))).click();

		return;
	}


	
	public void EnterInValidUserId() throws Exception {
		String UserID = "mngr280959";

		// type UID
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_UserID_name"))).sendKeys(UserID);

		return;

	}

	public void EnterInValidUserPWD() throws Exception {
		String UserPWD = "mUbAsYa";

		// TypePWD
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_PWD_name"))).sendKeys(UserPWD);

		return;
	}


	
	
	/**
	 * Test Case 4. Click on New Customer Button to add a new customer.
	 *
	 */
	
	
	public void ClickNewCustomerBtn() throws Exception {
		

		// Click New Customer Btn
		
		driver.findElement(By.linkText(Guru99Util.fetchElementLocaterValue("login_NewCustomerAdd_linkText"))).click();

		return;
	}

	
	public void NewCustomerName() throws Exception{
		
		// type customer name
		// Test data Name: +"Tom"+"NewTech"+"Advanced"
		String TestNames = "Mike";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerName_name"))).sendKeys(TestNames);
		
		
		return;
	}

	public void NewCustomerGender() throws Exception{
	
		// Select Gender: Male
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerGender_name"))).click();
		
		
	return;	
		
	}
	
	public void NewCustomerDOB() throws Exception{
		
		// Select Data of Brith
		
		String TestDOB= "03/24/1985";
		
		driver.findElement(By.id(Guru99Util.fetchElementLocaterValue("login_NewCustomerDOB_id"))).sendKeys(TestDOB);
		
		
		return;
		
		
	}
	
	
	public void NewCustomerAddress() throws Exception{
		
		// Type Customer Address
		String TestAddress = "321 New AV Nw";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerAddress_name"))).sendKeys(TestAddress);
		
		return;
	}
	
	
	public void NewCustomerCity() throws Exception{
		
		// select City
		String TestCity = "New York";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerCity_name"))).sendKeys(TestCity);
		
		return;
	}
	
	public void NewCustomerState() throws Exception{
		// type customer state
		String TestState = "New York";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCusotmerState_name"))).sendKeys(TestState);
		
		
		return;
	}
	
	public void NewCustomerPin() throws Exception{
		// Enter customer PIN
		String TestPIN= "802105";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCusotmerPin_name"))).sendKeys(TestPIN);
		
		
		return;
	}
	
	public void NewCustomerMobileNumber() throws Exception{
		// enter mobile number
		String TestMobileNumber = "+13237653465";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerMobileNumber_name"))).sendKeys(TestMobileNumber);
		
		return;
	}
	
	
	public void NewCustomerEmail() throws Exception{
		// type Email 
		String TestEmail = "jiddiixlar@gmail.com";
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerEmailAddress_name"))).sendKeys(TestEmail);
		
		
		return;
	}
	
	public void NewCustomerPassword() throws Exception{
		// Enter/edit customer password
		String TestPwd = "umut8021059";
		
		
		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerPassword_name"))).sendKeys(TestPwd);
		
		
		return;
	}
	
	public void NewCustomerSubmitBtn() throws Exception {
		// click submit btn

		driver.findElement(By.name(Guru99Util.fetchElementLocaterValue("login_NewCustomerSubmitBtn_name"))).click();

		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
