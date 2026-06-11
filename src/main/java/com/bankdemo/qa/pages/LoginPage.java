package com.bankdemo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bankdemo.qa.base.TestBase;

public class LoginPage extends TestBase{

	//PageFactory---Object Repo
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-btn")
	WebElement LoginBtn;
	
	//Initializing Page Factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public DashboardPage Login(String us,String pwd) {

	    System.out.println("Entering username");
	    username.sendKeys(us);

	    System.out.println("Entering password");
	    password.sendKeys(pwd);

	    System.out.println("Clicking login");
	    LoginBtn.click();

	    System.out.println("Login clicked");

	    return new DashboardPage();
	}
}
