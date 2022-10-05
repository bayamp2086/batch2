package lib.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bayamp.selenium.generic.BasePage;

public class HomePage extends BasePage {


	public HomePage(WebDriver driver) {
		//super(driver);
	}

	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return isElementPresent(By.xpath("//a[@class='button-logout']"));
	}
}
