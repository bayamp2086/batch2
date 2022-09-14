package com.bayamp.trainning.junebatch.stringutils.tests;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

//Made the changes into file

public class SubStringTests {

	@Test(description = "This will verify the positive Scenario")
	public void positiveTest() {
		boolean expected = true;

		String sentence = "Effective web content is about creating a conversation that is not only informative but also acts as ";
		String sub = "web";
		boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This verifies the negative Scenario")
	public void negativeTest() {
		boolean expected = false;

		String sentence = "Effective web content is about creating a conversation that is not only informative but also acts as ";
		String sub = "bayamp";
		boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This will verify the method when the main string is empty")
	public void specialCase1() {
		boolean expected = false;

		String sentence = " ";
		String sub = "bayamp";
		boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This will verify the method when the sub string is empty")
	public void specialCase2() {
		boolean expected = true;

		String sentence = "Effective web content is about creating a conversation that is not only informative but also acts as ";
		String sub = " ";
		boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This will verify the method when the main string and sub string are empty")
	public void specialCase3() {
		boolean expected = true;

		String sentence = " ";
		String sub = " ";
		boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);
		Assert.assertEquals(acutalResponse, expected);
	}

	@Test(description = "This will verify the method when the main string is null")
	public void specialCase4() {

		String sentence = null;
		String sub = "bayamp";
		try {
			boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);

		} catch (RuntimeException e) {
			Assert.assertEquals(e.getMessage(), "null value for sentence or substring are not allowed");
		}
	}

	@Test(description = "This will verify the method when the sub string is null")
	public void specialCase5() {

		String sentence = "Effective web content is about creating a conversation that is not only informative but also acts as ";
		;
		String sub = null;
		try {
			boolean acutalResponse = StringUtils.isSubStringPresent(sentence, sub);
		} catch (RuntimeException e) {
			Assert.assertEquals(e.getMessage(), "null value for sentence or substring are not allowed");

		}
	}

}
