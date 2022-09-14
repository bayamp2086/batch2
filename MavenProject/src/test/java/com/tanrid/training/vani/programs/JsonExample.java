package com.tanrid.training.vani.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JsonExample {

	public static void main(String[] args) throws FileNotFoundException {
		
		String jsonUserData = "";
		File file = new File("./src/main/resources/data/mydata.txt");
		System.out.println( "Absolute path: " + file.getAbsolutePath());
		
		FileInputStream inputStream = new FileInputStream(file);
	}

}
