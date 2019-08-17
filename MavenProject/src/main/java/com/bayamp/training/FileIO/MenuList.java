package com.bayamp.training.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class MenuList {

	static ArrayList<String> menu = new ArrayList<String>();	
	
	public static void go() {
		getList();
		System.out.println(menu);
		Collections.sort(menu);
		System.out.println(menu);
	}
	
	public static void getList() {
		try {
			File file = new File("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/Menu.txt");;
			BufferedReader br = new BufferedReader(new FileReader("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/Menu.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				addSong(line);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		menu.add(tokens[0]);
	}
	
	public static void main(String[] args) {
		go();
	}
	}

