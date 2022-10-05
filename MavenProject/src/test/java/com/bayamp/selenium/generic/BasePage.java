package com.bayamp.selenium.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	//protected ThreadLocal<WebDriver> context = new ThreadLocal<>();

	// have all protected methods here

	protected boolean isElementPresent(By locator) {
		
		//WebDriverWait wait = new WebDriverWait(context.get(), 10);

		try {
			//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			return false;
		}
		
		return true;
		
	}

}
