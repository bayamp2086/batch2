package com.bayamp.training.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		// Map<"India", "New Delhi">;

		HashMap<String, String> countryCapital = new HashMap<String, String>();
		countryCapital.put("India", "Delhi");
		countryCapital.put("Nepal", "Kathamandu");
		countryCapital.put("Pakishtan", "Lahore");
		countryCapital.put("India", "New-Delhi");

		System.out.println(countryCapital);
		System.out.println(countryCapital.get("India"));

		int size = countryCapital.size();
		System.out.println(size);

		HashMap<String, Address> nameAddress = new HashMap<String, Address>();

		Address ruchikaAddress = new Address(715, "El Camino Real", "Sunnyvale", "CA", 12345);
		Address ghanaAddress = new Address(123, "somestreet", "Sunnyvale", "CA", 10000);
		Address harishAddress = new Address(456, "somes-treet", "Santa-clara", "CA", 10000);

		nameAddress.put("Ruchika", ruchikaAddress);
		nameAddress.put("Ghanshayam", ghanaAddress);
		nameAddress.put("Harish", harishAddress);

		// Iterator itr = new nameAddress. do while loop
		// System.out.println(nameAddress);
		Address a = nameAddress.get("Harish");

		System.out.println(a);

	}

}
