package com.bayamp.training.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvFileJava {

	public static void main(String[] args) throws IOException {
		File csvFile = new File("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/test.csv");
		FileWriter writer = new FileWriter("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/test.csv");
	

			try {
				writer.append("Name");
				writer.append(',');
				writer.append("Number");
				writer.append('\n');

				writer.append("interview questions");
				writer.append(',');
				writer.append("001");
				writer.append('\n');

				writer.append("interview programs");
				writer.append(',');
				writer.append("002");
				writer.append('\n');
				System.out.println("File created");

			} catch (IOException e) {
				e.printStackTrace();
			}

			finally {
				try {
					writer.flush();
					writer.close();

				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}
	}

