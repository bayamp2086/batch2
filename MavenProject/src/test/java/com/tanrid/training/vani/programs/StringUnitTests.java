package com.tanrid.training.vani.programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tanrid.string.utils.StringUtils;

@Test(groups = { "regression", "smoke" }, alwaysRun = true, priority = 2)
public class StringUnitTests {

	@Test(groups = { "positive", "p1", "strings" })
	public void reverseStringValidTest() {

		Reporter.log("Reverse Single Word String Valid Test", true);

		String input = "BayAmp";
		String expectedOutput = "pmAyaB";
		String actualOutput = StringUtils.reverse(input);

		// validations
		Assert.assertEquals(actualOutput, expectedOutput);
	}

	@Test(priority = 1, dependsOnMethods = "reverseEmptyStringValidTest")
	public void reverseStringMultipleWordsValidTest() {

		Reporter.log("Reverse Single Multiple String Valid Test", true);

		String input = "Hello BayAmp";
		String expectedOutput = "pmAyaB olleH";
		String actualOutput = StringUtils.reverse(input);

		// validations
		Assert.assertEquals(actualOutput, expectedOutput);
	}

	@Test(priority = 3)
	public void reverseEmptyStringValidTest() {

		Reporter.log("Reverse Empty String Valid Test", true);

		String input = "";
		String expectedOutput = "";
		String actualOutput = StringUtils.reverse(input);

		// validations
		Assert.assertEquals(actualOutput, expectedOutput);
	}
}
