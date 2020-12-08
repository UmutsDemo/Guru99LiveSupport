/**
 * 
 */
package com.Guru99.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Guru99.AccountLogin.AccountLogin;
import com.Guru99.AccountLogin.AccountLogin.*;

/**
 * @author umutx
 *
 *
 *         Test Case: 1.Go to APP URL==>2. Click "Visit button" of Generate
 *         Access section====>
 *
 *         3. System will auto generate Temp login Credentials==>4. Enter User
 *         ID on User ID section.====>
 * 
 *         5.Enter User PWD in PWD section==>6.Click Login button and system
 *         will check credential then direct user to Homepage.
 *
 *
 */




/**
 * Test Case 1. Enter Valid User ID & Valid Passwrod.
 *
 */

public class Base {

	public class ValidateRegisterAccount extends com.Guru99BankApp.driverset.DriverInstances {

		@Test
		(priority=1)
		public void UserLogin() throws Exception {

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			AccountLogin Login = new AccountLogin(driver);
			
			Reporter.log("Currently running TC01 ");
			Login.EnterUserId();
			Reporter.log("Enter Valid User name ! ");
			Login.EnterUserPWD();
			Reporter.log("Enter Valid Password ! ");
			Login.ClickSignInBtn();
			Reporter.log("Clicked Signed Button ! ");

			System.out.println("<===========================>");
			System.out.println("<=========Account Login is compelete !!!! ========>");
			System.out.println("<===========================>");
			//WebElement el = driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a"));
			//el.click();
			
			
			
			driver.quit();
			Reporter.log("Driver has been closed for TC01 !!! ");
			System.out.println("<============Driver Has Been Close TC-01 !!!===============>");
		}

	

	
	
	/**
	 * Test Case 2. Enter InValid User ID & Valid Passwrod.
	 *
	 */
	
		
		
	@Test
	(priority=2)
	public void TC02() throws Exception{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AccountLogin invalidUID = new AccountLogin(driver);
		Reporter.log("Currently running TC02 ");
		
		invalidUID.EnterInValidUserId();
		Reporter.log("Enter InValid User Id !");
		invalidUID.EnterUserPWD();
		Reporter.log(" Enter Valid User Pssword ! ");
		invalidUID.ClickSignInBtn();
		Reporter.log("Clicked Signed Button ! ");
		
		
		System.out.println("<===========================>");
		System.out.println("<=========Account Login with InValid UID is compelete !!!! ========>");
		System.out.println("<===========================>");
		driver.quit();
		Reporter.log("Driver has been closed for TC02 !!! ");
		System.out.println("<============Driver Has Been Close TC-02 !!!===============>");
		
		
		
		
		
		
		
	}
	
	 
	
	
	
	/**
	 * Test Case 3. Enter Valid User ID & InValid Passwrod.
	 *
	 */
	
		
		
	@Test
	(priority=3)
	public void TC03() throws Exception{
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AccountLogin InValidPWD = new AccountLogin(driver);
		Reporter.log("Currently running TC03 ! ");
		
		InValidPWD.EnterUserId();
		Reporter.log("Enter Valid User name ! ");
		InValidPWD.EnterInValidUserPWD();
		Reporter.log("Enter InValid User Password ! ");
		InValidPWD.ClickSignInBtn();
		Reporter.log("Clicked Signed Button ! ");
		
		
		
		System.out.println("<===========================>");
		System.out.println("<=========Account Login with InValid PWD is compelete !!!! ========>");
		System.out.println("<===========================>");
		driver.quit();
		Reporter.log("Driver has been closed for TC03 !!! ");
		System.out.println("<============Driver Has Been Close TC-03 !!!===============>");
	
	
	}
	
	 
	
	/**
	 * Test Case 4. Enter InValid User ID & InValid Passwrod.
	 *
	 */
	
		
		
	@Test
	(priority=4)
	public void TC04() throws Exception{
	
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AccountLogin InValidUIDPWD = new AccountLogin(driver);
		Reporter.log("Currently running TC04 ! ");
		
		InValidUIDPWD.EnterInValidUserId();
		Reporter.log("Enter InValid User Id !");
		InValidUIDPWD.EnterInValidUserPWD();
		Reporter.log("Enter InValid User Password !");
		InValidUIDPWD.ClickSignInBtn();
		Reporter.log("Clicked Signed Button ! ");
		
		
		System.out.println("<===========================>");
		System.out.println("<=========Account Login with InValid PWD & InValid PWD is compelete !!!! ========>");
		System.out.println("<===========================>");
		driver.quit();
		Reporter.log("Driver has been closed for TC04 !!! ");
		System.out.println("<============Driver Has Been Close TC-04 !!!===============>");
	
	
	
	}
	
	 
	
		/**
		 * Test Case 5. Login with Valid Credentials===> Add New Customer 
		 *
		 */
		
		@Test
		(priority=5)
		public void TC05() throws Exception{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		AccountLogin AddNewCustomer = new AccountLogin(driver);
			
		Reporter.log("Currently running TC05 ");
		AddNewCustomer.EnterUserId();
		Reporter.log("Enter Valid User name ! ");
		AddNewCustomer.EnterUserPWD();
		Reporter.log("Enter Valid Password ! ");
		AddNewCustomer.ClickSignInBtn();
		Reporter.log("Clicked Signed Button ! ");
			
			
		System.out.println("<===========================>");
		System.out.println("<=========Account Login is compelete !!!! ========>");
		System.out.println("<===========================>");
		
		
		
		Reporter.log("Click New Customer Button ! ");
		AddNewCustomer.ClickNewCustomerBtn();
		Reporter.log("Enter  User name ! ");
		AddNewCustomer.NewCustomerName();
		Reporter.log("Enter Valid Customer Gender ! ");
		AddNewCustomer.NewCustomerGender();
		Reporter.log("Enter Valid Customer Date Of Birth! ");
		AddNewCustomer.NewCustomerDOB();
		Reporter.log("Enter Valid Customer Address ! ");
		AddNewCustomer.NewCustomerAddress();
		Reporter.log("Enter Valid Customer City! ");
		AddNewCustomer.NewCustomerCity();
		Reporter.log("Enter Valid Customer State ! ");
		AddNewCustomer.NewCustomerState();
		Reporter.log("Enter Valid Customer PIN ! ");
		AddNewCustomer.NewCustomerPin();
		Reporter.log("Enter Valid Customer MObile Number ! ");
		AddNewCustomer.NewCustomerMobileNumber();
		Reporter.log("Enter Customer Emial ! ");
		AddNewCustomer.NewCustomerEmail();
		Reporter.log("Enter Valid Customer Passeord ! ");
		AddNewCustomer.NewCustomerPassword();
		//AddNewCustomer.NewCustomerSubmitBtn();
		Thread.sleep(5000);
		
		driver.quit();
		Reporter.log("Driver has been closed for TC01 !!! ");
		System.out.println("<============Driver Has Been Close TC-05 !!!===============>");
	
		
		
		
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
