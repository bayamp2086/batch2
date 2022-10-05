package com.tanrid.training.vani.programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String str = "one two three four five six";
	
		//output : five six three four one two
	     Path path = Paths.get("/Users/harish/ssh-keys/temp/test1.txt");

         Files.createDirectories(path);
		

	}

}
