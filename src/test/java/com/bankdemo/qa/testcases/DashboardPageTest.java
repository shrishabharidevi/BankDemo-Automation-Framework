package com.bankdemo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bankdemo.qa.base.TestBase;
import com.bankdemo.qa.pages.DashboardPage;
import com.bankdemo.qa.pages.LoginPage;
import com.bankdemo.qa.pages.TransactionsPage;
import com.bankdemo.qa.util.TestUtil;

public class DashboardPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    TransactionsPage transactionPage;
    String sheetName="acc_details";

    public DashboardPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {

        initialization();

        loginPage = new LoginPage();

        dashboardPage = loginPage.Login(
                prop.getProperty("username"),
                prop.getProperty("password"));
        System.out.println("After Login URL: " + driver.getCurrentUrl());
        System.out.println("After Login Title: " + driver.getTitle());
        System.out.println("Window Handles: " + driver.getWindowHandles());
    }

   
    @Test
    public void verifyDashboardPage() {

        Assert.assertTrue(
            dashboardPage.validateDashboardHeading(),
            "Dashboard heading is not displayed");
    }
    @DataProvider(name="bankDemo_testdata")
    public Object[][] getBanktestData() {
    Object data[][]= TestUtil.getTestData(sheetName);
    return data;
    }
    @Test(dataProvider="bankDemo_testdata")
    public void createAccount(String accountName,
                              String accountType,
                              String balanceField) {
        System.out.println("Data: " + accountName + ", "
                + accountType + ", "
                + balanceField);


        dashboardPage.createAccountdetails(
            accountName,accountType,
            Double.parseDouble(balanceField)
        );
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}