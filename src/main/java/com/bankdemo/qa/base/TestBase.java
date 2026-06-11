package com.bankdemo.qa.base;

import java.io.FileInputStream;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bankdemo.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = LogManager.getLogger(TestBase.class);
	
	
	
	public TestBase() {
		
		try
		{
			prop = new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\shri9\\eclipse-workspace\\SampleProject\\BankDemo\\src\\main\\java\\com\\bankdemo\\qa\\config\\config.properties");
		
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	public static void initialization() {
		String BrowserName= prop.getProperty("browser");
		if(BrowserName.equals("chrome")) {
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shri9\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		    driver= new ChromeDriver();
		}
		log.info("Launching browser");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT)));
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(TestUtil.IMPLICIT_WAIT)));
		driver.get(prop.getProperty("url"));
	}
}
	
	

