package com.bayamp.trainning.junebatch.stringutils.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilis.StringUtils;

public class PalindromeCheck {

	@Test(priority = 1, groups = "positive", description = "Positive test senario : Enter the single word, and verify if it is palindrome")
	public void isWordPalindromePositiveTest() {
		Reporter.log("Start the palindrome test positive tets case : isWordPalindromePositiveTest",true);
		boolean expected = true;
		Reporter.log("Expected Response : " + expected);
		String str = "madam";
		Reporter.log("Input Word : " + str);
		boolean acutalResponse = StringUtils.palindromecheck(str);
		Reporter.log("Actual Response : " + acutalResponse);
		Assert.assertEquals(acutalResponse, expected);
		Reporter.log("End the palindrome test positive tets case : isWordPalindromePositiveTest");
	}

	@Test(priority = 2, groups = "positive", description = "Positive test senario : Enter the single character, and verify if it is palindrome")
	public void isCharPalindromePositiveTest() {
		boolean expected = true;

		String str = "c";

		boolean acutalResponse = StringUtils.palindromecheck(str);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(priority = 3, groups = "positive", description = "Positive test senario : Enter the Phrase, and verify if it is palindrome")
	public void isPhrasePalindromePositiveTest() {
		boolean expected = true;

		String str = "Taco cat";

		boolean acutalResponse = StringUtils.palindromecheck(str);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(priority = 4, groups = "positive", description = "Positive test senario : Verify if empty string is palindrome")
	public void isEmptyStringPalindromePositiveTest() {

		String str = "";
		try {
			boolean acutalResponse = StringUtils.palindromecheck(str);

		}
		catch(RuntimeException e) {
			Assert.assertEquals(e.getMessage(), "null & empty value for input string is not allowed");
		} 
       
	}

	@Test(priority = 5, groups = "negative", description = "Negative test senario : Enter the single word, and verify if it is palindrome")
	public void isWordPalindromeNegativTest() {
		boolean expected = false;

		String str = "test";

		boolean acutalResponse = StringUtils.palindromecheck(str);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(priority = 6, groups = "negative", description = "Negative test senario : Enter the Phrase, and verify if it is palindrome")
	public void isPhrasePalindromeNegativTest() {
		boolean expected = false;

		String str = "cat is brown";

		boolean acutalResponse = StringUtils.palindromecheck(str);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(priority = 7, description = "This will verify the method when the input string is null")
	public void specialCaseNullString() {

		String str = null;
		try {
			boolean acutalResponse = StringUtils.palindromecheck(str);
		} catch (RuntimeException e) {
			Assert.assertEquals(e.getMessage(), "null & empty value for input string is not allowed");
		}
	}

}
