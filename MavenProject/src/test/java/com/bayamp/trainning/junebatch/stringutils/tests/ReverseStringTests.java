package com.bayamp.trainning.junebatch.stringutils.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilis.StringUtils;

public class ReverseStringTests {

	@Test(description = "This will verify the positive Scenario")
	public void reverseStringTestPhrase() {
		String expected = "eulb si yks";

		String str = "sky is blue";

		String acutalResponse = StringUtils.reverseString(str);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This will verify the positive Scenario")
	public void reverseStringTestPWord() {
		String expected = "pmayab";

		String str = "bayamp";

		String acutalResponse = StringUtils.reverseString(str);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This will verify the method when the input string is null")
	public void specialCaseNull() {

		String str = null;
		try {
			String acutalResponse = StringUtils.reverseString(str);
		} catch (RuntimeException e) {
			Assert.assertEquals(e.getMessage(),"null and empty value for input string is not allowed");
		}
	}

	@Test(description = "This will verify the method when the input string is empty")
	public void specialCaseEmpty() {

		String str = "";
		try {
			String acutalResponse = StringUtils.reverseString(str);
		} catch (RuntimeException e) {
			Assert.assertEquals(e.getMessage(), "null and empty value for input string is not allowed");
		}
	}
}
