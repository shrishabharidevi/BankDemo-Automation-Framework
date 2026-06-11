package com.bankdemo.qa.pages;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;
//import com.bankdemo.qa.pages.TransactionsPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.bankdemo.qa.base.TestBase;

public class DashboardPage extends TestBase {

	 public DashboardPage() {
	        PageFactory.initElements(driver, this);
	    }

	    public String getDashboardTitle() {
	        return driver.getTitle();
	    }
	    @FindBy(id="brand-name")
	    WebElement dashboardHeading;

	    public boolean validateDashboardHeading() {
	        return dashboardHeading.isDisplayed();
}
	    @FindBy(id="add-account-link")
    	WebElement createAccountBtn;
	    
	    @FindBy(id = "account-name")
	    WebElement accountName;

	    @FindBy(id="account-type")
	    WebElement accountTypeDropdown;
	    
	    @FindBy(id="initial-balance-field")
	    WebElement balanceField;

	    @FindBy(id="save-account-btn")
	    WebElement saveBtn;
	    
	    public TransactionsPage createAccountdetails(String accName, String accType, double balance) {
	    	 createAccountBtn.click();
	    	 accountName.sendKeys(accName);
	    	 accountTypeDropdown.sendKeys(accType);
	    
	    	 balanceField.sendKeys(String.valueOf(balance));

	         saveBtn.click();
	         
	         return new TransactionsPage();
	     }
	    }
	    	
	    
    


