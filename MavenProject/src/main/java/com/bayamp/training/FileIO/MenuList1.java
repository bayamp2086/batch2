package com.bayamp.training.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MenuList1 {
	
ArrayList<Menu1> menu = new ArrayList<Menu1>();




public void go1() {
	getMenu();
	System.out.println(menu);
}
public void getMenu() {
	try {
		File file = new File("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/Menu1.txt");
		BufferedReader br = new BufferedReader(new FileReader("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/Menu1.txt"));
		String line = null;
		while ((line = br.readLine()) != null)
		{
			addSong1(line);
		}
	}
	catch(Exception e) {
		
	}
	
}

public void addSong1(String lineToParse) {
	String[] tokens = lineToParse.split("/");
	
	
}

}

