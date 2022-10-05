package com.bayamp.training.selenium.webmail.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProgram {
	
	
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver" ,"/Users/harish/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://webmail.tanrid.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement myUserField = driver.findElement(By.xpath("//input[@id='user']"));
		myUserField.sendKeys("user1@tanrid.com");
		
		Thread.sleep(2000);
		
		WebElement myPasswordField = driver.findElement(By.xpath("//input[@id='pass']"));
		myPasswordField.sendKeys("user1");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@name='login']"));
		submitButton.click();
		
		Thread.sleep(2000);
	
		driver.quit();
		
		
	}

}
