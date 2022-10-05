package com.bayamp.selenium.generic;

import org.openqa.selenium.WebDriver;

import lib.selenium.pages.HomePage;
import lib.selenium.pages.LoginPage;
import lib.selenium.pages.SendEmailPage;

public class PageUtils extends BasePage {
	
	
	public PageUtils(WebDriver driver){
		//context.set(driver);
		
	}
	
	public LoginPage getLoginPage() {
	
		LoginPage loginPage = new LoginPage();
		
		if(loginPage.isLoaded()) {
			return loginPage;
		}
		

		throw new RuntimeException(LoginPage.class.getName() +" could not be loaded");
	}
	
	public SendEmailPage getSendEmailPage() {
		
		SendEmailPage homePage = new SendEmailPage();
		
		if(homePage.isLoaded()) {
			
		}
		return null;
	}
}
