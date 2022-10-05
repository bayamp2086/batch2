package com.bayamp.search.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.selenium.generic.BaseTest;
import com.bayamp.selenium.generic.Constants;

public class AmazonSearchTest extends BaseTest {


	@Test
	public void searchProductTest() throws InterruptedException {
			
		By amazonSearchFieldLocator = By.cssSelector("#twotabsearchtextbox");
		WebElement searchFieldLocatorWebElement = driver.findElement(amazonSearchFieldLocator);
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid yellow;');", searchFieldLocatorWebElement);
		 
		searchFieldLocatorWebElement.sendKeys("TV");
		
		//use 
		Thread.sleep(Constants.SLEEP_TIME);
		
		By searchImageIcon = By.cssSelector("#nav-search-submit-button");
		driver.findElement(searchImageIcon).click();
		
		//user java script executor to click the button
		
		//Thread.sleep(6000);
		
		By priceLocator = By.xpath("//*[@data-component-type='s-search-results']/div[2]/div[5]//span[@class='a-price']");
		String price = driver.findElement(priceLocator).getText();
		
		By coverageLinkLocator = By.linkText("Coverage");
		
	
		driver.findElement(coverageLinkLocator).click();
		

		Reporter.log("The price of the TV is :" + price,true);
		
		
	}
	

	
	
}
