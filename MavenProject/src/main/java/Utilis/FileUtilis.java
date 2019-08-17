package Utilis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

public class FileUtilis {

	public static void copyFolder(File sourceFolder, File targetFolder) throws IOException {
		if (sourceFolder.isDirectory()) {
			if (!targetFolder.exists()) {
				targetFolder.mkdir();
				System.out.println("Target folder created");
			}
			// Get all files from source directory
			String[] files = sourceFolder.list();
			for (String file : files) {
				// Iterate over all files and copy them to destinationFolder one by one
				File sourceFile = new File(sourceFolder, file);
				File TargetFile = new File(targetFolder, file);
				copyFolder(sourceFolder, targetFolder);
			}
		} else {

		}
	}

	// read the file
	
	public static void readLineByLine(String filePath) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}


	}
}
