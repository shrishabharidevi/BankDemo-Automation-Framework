package com.bankdemo.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.bankdemo.qa.base.TestBase;

public class TransactionsPage extends TestBase{
	 public TransactionsPage() {
	        PageFactory.initElements(driver, this);
	    }

}
