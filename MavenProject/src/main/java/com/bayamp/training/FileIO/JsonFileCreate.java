package com.bayamp.training.FileIO;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileCreate {

	public static void main(String[] args) {
		
		
		
		// First Object
		JSONObject student1 = new JSONObject();
		student1.put("firstName", "Ruchika");
		student1.put("lastName", "Pandey");
		student1.put("Batch", "June-2019");
		
		JSONArray techList1 = new JSONArray();
		techList1.add("Java");
		techList1.add("JavaScript");
		techList1.add("HTML");
		techList1.add("PHP");
		
		student1.put("technologies", techList1);
		JSONObject studentObj = new JSONObject();
		studentObj.put("Student", student1);
		
		//second obj
		JSONObject student2 = new JSONObject();
		student2.put("firstName", "Ghanashyam");
		student2.put("lastName", "Pandey");
		student2.put("Batch", "June-2019");
		
		JSONArray techList2 = new JSONArray();
		techList2.add("Java");
		techList2.add("JavaScript");
		techList2.add("HTML");
		techList2.add("SQL");
		
		student2.put("technologies", techList2);
		
		JSONObject studentObj2 = new JSONObject();
		studentObj2.put("Student", student2);
		
		
		// add students in to list
		JSONArray studentList = new JSONArray();
		studentList.add(studentObj);
		studentList.add(studentObj2);
		//write json file
		// file object
		
		try  {
			FileWriter file = new FileWriter("/Users/ruchikapandey/eclipse-workspace/MavenProject/Files/JsonFile.json");
			file.write(studentList.toJSONString());
			file.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
        
	}

}
