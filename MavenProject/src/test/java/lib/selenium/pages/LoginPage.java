package lib.selenium.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.bayamp.selenium.generic.BasePage;

public class LoginPage extends BasePage {

	private final static Logger logger = Logger.getLogger(LoginPage.class);

	public boolean login(String user, String password) throws InterruptedException {

		Reporter.log("Login with user name :" + user, true);
		
		/*
		 * sendKeys("input[id='user']",user);
		 * 
		 * webdriver.findElement(By.xpath("//input[@id='user']")).sendKeys(user);
		 * Thread.sleep(1000);
		 * webdriver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password); //
		 * Click submit button Thread.sleep(1000);
		 * webdriver.findElement(By.xpath("//button[@name='login']")).click();
		 * click("button[name='login']"); Thread.sleep(2000);
		 * 
		 * try { webdriver.findElement(By.xpath("//a[@class='button-logout']")); return
		 * true; } catch (NoSuchElementException e) { return false; }
		 */

		return false;
	}

	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return isElementPresent(By.xpath("//button[@name='login']"));
	}

}
