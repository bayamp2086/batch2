package com.bayamp.training.FileIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class ReadJsonFile {

	public static void main(String[] args) {
		// json object to parse read file
		JSONParser parser = new JSONParser();
		try {
			Reader reader = new FileReader("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/JsonFile.json");
			// read json file
			org.json.simple.JSONArray jsonArray = (org.json.simple.JSONArray) parser.parse(reader);
			System.out.println(jsonArray);

			// System.out.println(jsonArray.get(0));
			// JSONObject obj = (JSONObject)jsonArray.get(0);
			// // System.out.println(obj.get("Student"));
			// JSONObject obj1 = (JSONObject) obj.get("Student");
			// System.out.println(obj1.get("firstName"));
			// for (int i = 0; i < jsonArray.l; i++) {
			//
			// }

			for (int i = 0; i < jsonArray.size(); i++) {
				// System.out.println(((JSONObject) jsonArray.get(i)));
				// System.out.println(((JSONObject) jsonArray.get(i)).get("Student"));
				System.out.println(((JSONObject) (((JSONObject) jsonArray.get(i)).get("Student"))).get("firstName"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
