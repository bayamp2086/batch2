package com.bayamp.training.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndReadTextFile {

	public static void main(String[] args) throws IOException {
		
		// create a file and write filecontent
		File file = new File("/Users/ruchikapandey/QA Trainning/Files/javaexample1234.txt");
		String fileContent = "Hello there ! Thanks for reading my first javatxt file.";
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/ruchikapandey/QA Trainning/Files/javaexample1234.txt"));
bw.write(fileContent);
bw.close();
		
//append to file
//		String textToAppend = "I am appending second line to the ablove created file";
//		BufferedWriter br = new BufferedWriter(new FileWriter("/Users/ruchikapandey/QA Trainning/Files/javaexample.txt",true));
//		br.newLine();
//		   br.write(textToAppend);
//		   br.close();

		// delete the file
		
	 
//			File file = new File("/Users/ruchikapandey/QA Trainning/Files/test.txt");
//			file.delete();
//		
//		File file = new File("/Users/ruchikapandey/QA Trainning/Files/Javatest2.txt");
//		String fileContent = "ok I am a text file for testing purpose.";
//		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/ruchikapandey/QA Trainning/Files/Javatest2.txt"));
//		bw.write(fileContent);
//		
//		bw.newLine();
//		String textToAppend = "ok ok I am appending the second line now";
//		bw.append(textToAppend);
//		bw.close();
//		try {
//		BufferedReader br = new BufferedReader(new FileReader("/Users/ruchikapandey/QA Trainning/Files/Javatest2.txt"));
//		String line;
//		int count = 0;
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//		count ++;
//		}
//
//		System.out.println(count);
//	}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
	      
	}
}


