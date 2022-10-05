package com.bayamp.search.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenSearchTests {
	
	
	
	private WebDriver driver;
	
	@BeforeClass
	public void initialize() throws InterruptedException {
		Reporter.log("\nInitialize test data",true);
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void searchDependencyTest() throws InterruptedException {
		Reporter.log("\nBegin Search dependency test in maven",true);
		
		
		//search field  locator
		By mavenSearchTextField = By.cssSelector("#query");
		driver.findElement(mavenSearchTextField).sendKeys("SLF4J");
		
		By searchButton = By.cssSelector(".button");
		driver.findElement(searchButton).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
	

}
