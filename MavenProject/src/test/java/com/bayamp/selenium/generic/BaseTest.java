package com.bayamp.selenium.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcases.login.tests.LoginTest;

public class BaseTest {
	
	private final static Logger logger = Logger.getLogger(BaseTest.class);
	protected WebDriver driver;
	protected Properties props;
	protected PageUtils pageUtils;
	
	@BeforeMethod
	protected void initialize() throws InterruptedException, IOException {
		
		InputStream inputConfigFile = new FileInputStream(Constants.CONFI_FILE);
		props = new Properties();
		props.load(inputConfigFile);
		
		String url = props.getProperty("app.url");
		
		String browerType = props.getProperty("brower.type");
		
		Reporter.log("The Application URL is :" + browerType);
		
		Reporter.log("Browser to launch is  :" + url);
		
		if("chrome".equals(browerType)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		if("firefox".equals(browerType)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		if("edge".equals(browerType)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		pageUtils = new PageUtils(driver);
		
		driver.get(url);
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	
	@AfterMethod
	protected void cleanUp() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
