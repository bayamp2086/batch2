package com.bayamp.training.DataProviderPractise;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

public class NumberDataProvider {

	@DataProvider(name = "getAdditionData")
	public static Object[][] getAdditionData() throws IOException {
		File file = new File("src/main/resources/TeatData/Addition/addition.csv");
		Object[][] myData = new Object[4][3];
		// myData[0];
		Object[][] data = { { 10, 20, 30 }, { 20, 40, 60 } };
		System.out.println(data[1][1]);
		int[] a = { 10, 20, 40 };
		System.out.println(a[2]);
		return data;

	}

	@DataProvider(name = "getAdditionDataCsv")
	public static Object[][] getAdditionDataCsv() {
		File file = new File("src/main/resources/TeatData/Addition/addition.csv");
		Object[][] myData = new Object[4][3];

		return myData;

	}

	@DataProvider(name = "getSubData")
	public static Object[][] getSubData() {
		File file = new File("src/main/resources/TeatData/Addition/addition.csv");
		Object[][] myData = new Object[4][3];
		// myData[0];
		Object[][] data = { { 10, 20, 30 }, { 20, 40, 60 } };
		System.out.println(data[1][1]);
		int[] a = { 10, 20, 40 };
		System.out.println(a[2]);
		return data;

	}
}
