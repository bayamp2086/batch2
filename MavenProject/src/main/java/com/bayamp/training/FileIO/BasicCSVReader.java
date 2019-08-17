package com.bayamp.training.FileIO;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BasicCSVReader {
   

    public static void main(String[] args) throws IOException {
    	 final String filePath = "Files/testcsv.csv";
        try (
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
           CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        		// CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL.withFirstRecordAsHeader());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String name = csvRecord.get(0);
                String email = csvRecord.get(1);
                String phone = csvRecord.get(2);
                String country = csvRecord.get(3);
//   String f1 = csvRecord.get("Name");
//   String f2 = csvRecord.get("Email");
//   String f3 = csvRecord.get("Phone");
//   String f4 = csvRecord.get("Country");
//   System.out.println(f1);
//   System.out.println(f2);
//   System.out.println(f3);
//   System.out.println(f4);
                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + name);
                System.out.println("Email : " + email);
                System.out.println("Phone : " + phone);
                System.out.println("Country : " + country);
                System.out.println("---------------\n\n");
            }
        }
    }
}