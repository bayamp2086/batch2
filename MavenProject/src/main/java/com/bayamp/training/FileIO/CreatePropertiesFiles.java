package com.bayamp.training.FileIO;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertiesFiles {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("firstName", "Ruchika");
		properties.setProperty("lastName", "Pandey");
		FileWriter writer = null;
		try {
			writer = new FileWriter("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/test.properties");
			properties.store(writer, "Ruchika");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
