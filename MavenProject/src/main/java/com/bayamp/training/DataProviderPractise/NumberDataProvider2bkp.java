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

public class NumberDataProvider2bkp {

	@DataProvider(name = "getAdditionData")
	public static Object[][] getAdditionData() throws IOException {
		// String filePath = "src/main/resources/TeatData/Addition/addition.csv";
		// File file = new File(filePath);
		Object[][] myData = new Object[1][1];
		// Object[][] data = { { 10, 20, 30 }, { 20, 40, 60 } };
		// return data;
		String filePath = "src/main/resources/TeatData/Addition/addition.csv";
		File file = new File(filePath);
		ArrayList<ArrayList<Integer>> value = new ArrayList<ArrayList<Integer>>();
		Reader reader = Files.newBufferedReader(Paths.get(filePath));
		CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL.withFirstRecordAsHeader());
		for (CSVRecord csvRecord : csvParser) {
			String number1 = csvRecord.get("num1");
			String number2 = csvRecord.get("num2");
			String expected = csvRecord.get("expectedTotal");
			int firstnumber = Integer.parseInt(number1);
			int secondnumber = Integer.parseInt(number2);
			int expectedSum = Integer.parseInt(expected);
			int actual = firstnumber + secondnumber;

		}
		return myData;

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
