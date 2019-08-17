package com.bayamp.training.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class CreatePropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("firstName", "Ruchika");
		prop.setProperty("lastName", "Pandey");
		prop.setProperty("Techology", "Java");
		prop.setProperty("Batch", "June-2019");
		try {
		FileWriter fw = new FileWriter("/Users/ruchikapandey/QA Trainning/Files/student.properties");
		prop.store(fw, "Ruchika Pandey");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("firstName"));
		System.out.println(prop.getProperty("Techology"));
	}

}
