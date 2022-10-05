package lib.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.selenium.generic.BasePage;

public class SendEmailPage extends BasePage {
	

	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return isElementPresent(By.xpath("//a[@class='button-logout']"));
	}

}
