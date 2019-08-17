package com.bayamp.training.FileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileAndWriteTextFile {

	public static void main(String[] args) {
		
		try { 
			File file = new File ("/Users/ruchikapandey/javatest1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		PrintWriter pw = new PrintWriter(file);
		pw.println("this is my first written line in java.txt file");
		pw.println("second line");
		pw.close();
		System.out.println("Done");
		
		}
		catch (IOException e) {
			e.printStackTrace();
			 
		 }
		}
 
}
