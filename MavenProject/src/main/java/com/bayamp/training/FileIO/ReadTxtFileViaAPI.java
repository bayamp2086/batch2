package com.bayamp.training.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTxtFileViaAPI {

	public static void main(String[] args) throws IOException  {
		String filePath = "/Users/ruchikapandey/QA Trainning/Files/javaexample.txt";
  try {
		Utilis.FileUtilis.readLineByLine(filePath);
  }
  catch(IOException e) {
	  e.printStackTrace();
  }
		// Write on the same file.

		String newLine = "I am forth line";
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
		bw.newLine();
		bw.append(newLine);
		bw.close();
		//
		System.out.println("ok");
		Utilis.FileUtilis.readLineByLine(filePath);

	}
}
