package com.bayamp.training.DataProviderExample;

import java.io.BufferedReader;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class DataProviderClass {

	@DataProvider(name = "getDataFromCSV")
	public static Object[][] getDataFromCSV() {
		//Object[][] data = new Object[4][3];
		String filePath = "src/main/resources/TestData/Addition/addition.csv";
		Object[][] data = null;
		// return CSVDataProvider.getCSVData(filePath);
		try {
			Reader reader = new BufferedReader((Reader) Paths.get(filePath));

			CSVReader csvReader = new CSVReader(reader);
			List<String[]> rowCount = csvReader.readAll();
			data = new Object[rowCount.size()-1][3];
			//String[] nextRecord;
            for(int i =1 ;i<rowCount.size();i++) {
            	String[] rowData = rowCount.get(i);
            	int count = 0;
            	for(String cellValue:rowData) {
            		data[i-1][count] = Integer.parseInt(cellValue);
            		count ++;
            	}
            	            }
         

			
		} catch (Exception e) {

		}
		
		return data;

	}
}
