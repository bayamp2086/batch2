package testcases.login.tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.selenium.generic.BaseTest;

import lib.selenium.pages.LoginPage;

public class LoginTest extends BaseTest {

	private final static Logger logger = Logger.getLogger(LoginTest.class);

	@Test
	public void loginWithValidCredentialsTest() throws InterruptedException {

		// Reporter.log("Login with Valid Credentials Test",true);

		logger.info("Login with Valid Credentials Test");
		LoginPage loginPage = pageUtils.getLoginPage();

		boolean result = loginPage.login("user1@tanrid.com", "user1");

		Assert.assertTrue(result);

	}

	@Test
	public void loginWithInValidCredentialsTest() throws InterruptedException {

		LoginPage loginPage = pageUtils.getLoginPage();
		boolean result = loginPage.login("user1@tanrid.com", "invalidpassword");

		Assert.assertFalse(result);

	}

}
