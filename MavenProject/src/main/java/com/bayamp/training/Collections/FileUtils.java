package com.bayamp.training.Collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtils {
	public static int getSentenceCount(String filePath) throws IOException {
		filePath="src/main/resources/"+filePath;
		{
			File file = new File(filePath);
			FileInputStream fileStream = new FileInputStream(filePath);
			InputStreamReader input = new InputStreamReader(fileStream);
			BufferedReader reader = new BufferedReader(input);
			String line;
			int sentenceCount = 0;
			while ((line = reader.readLine()) != null) {
				if (!(line.equals(""))) {
					String[] sentenceList = line.split("[!?.:]+");

		 			sentenceCount += sentenceList.length;
				}
			}
			return sentenceCount;
		}

	}
}

