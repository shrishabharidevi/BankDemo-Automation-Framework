package com.bankdemo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bankdemo.qa.base.TestBase;
import com.bankdemo.qa.pages.DashboardPage;
import com.bankdemo.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	DashboardPage dashboardPage;
 public LoginPageTest() {
	 super();
	
 }
 @BeforeMethod
 public void setup() {
	 initialization();
	 loginPage= new LoginPage();	
 }
 
 @Test
 public void loginTest() {
	 dashboardPage= loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	          
	}

 
 @AfterMethod
 public void teardown() {
	 driver.quit();
 }
 
}
