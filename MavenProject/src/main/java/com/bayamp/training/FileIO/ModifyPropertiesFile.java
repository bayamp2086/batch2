package com.bayamp.training.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ModifyPropertiesFile {

	public static void main(String[] args) throws IOException {
		
    FileInputStream in = new FileInputStream("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/test.properties");
    Properties prop = new Properties();
    prop.load(in);
    in.close();
    
    FileOutputStream out = new FileOutputStream("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/test.properties");
    prop.setProperty("firstName", "Gaurav");
    prop.store(out, null);
    
   
    
	}

}
