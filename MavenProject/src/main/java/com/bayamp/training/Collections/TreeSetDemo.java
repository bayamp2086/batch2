package com.bayamp.training.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Create and add elements
		TreeSet<String> emp = new TreeSet<String>();
		emp.add("John");
		emp.add("Jahnavi");
		emp.add("Suraj");
		emp.add("Neha");
		emp.add("Swati");
		emp.add("Surjan");
		emp.add("Neha"); // check for duplicate entry

		// Retrieve using iterator

		Iterator i = emp.iterator();
		while (i.hasNext()) {
			System.out.println(i.next()); // ascending

		}

		emp.remove("Neha"); // remove element

		System.out.println("Emp List after removing Neha =" + emp);

		boolean check = emp.isEmpty(); // check if list is empty
		System.out.println("Is Emp list empty :" + check);
		emp.pollFirst(); // remove first value
		System.out.println(emp);
		Iterator i2 = emp.descendingIterator();

		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

}
