package com.bayamp.training.DataProviderPractise;

import java.io.File;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "getAdditionData",dataProviderClass = com.bayamp.training.DataProviderPractise.NumberDataProvider.class)
	public void addTwoNumbersTest1(int num1, int num2, int expectedTotal) {

		int total = num1 + num2; // AdditionUtils.add(num1,num2);
		Reporter.log("The Input numbers : " + num1 + " " + num2, true);
		Reporter.log("Expected Total : " + expectedTotal, true);
		Reporter.log("Actual Total  : " + total, true);
		Reporter.log("**********", true);
		Assert.assertEquals(total, expectedTotal);

	}

	
}
