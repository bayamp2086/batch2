package com.bayamp.training.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Utilis.FileUtilis;

public class CreateReadOnlyFile {

	public static void main(String[] args) throws IOException {
		File readonlyfile = new File("/Users/ruchikapandey/QA Trainning/Files/readonly.txt");


//readonlyfile.createNewFile();
//		readonlyfile.setReadOnly();
		if (readonlyfile.exists()) {
			readonlyfile.delete();
	}

		readonlyfile.createNewFile();
		String fileContet = "Hello , this file needs to be readonly";
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/ruchikapandey/QA Trainning/Files/readonly.txt"));
		bw.write(fileContet);
		bw.newLine();
		String textToAppend = "ok I am second line";
		bw.write(textToAppend);
		bw.close();
		
		
		
		

}
}
