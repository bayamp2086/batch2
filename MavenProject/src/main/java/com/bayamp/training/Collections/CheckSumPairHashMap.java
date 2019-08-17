package com.bayamp.training.Collections;

import java.util.HashMap;
import java.util.Map;

public class CheckSumPairHashMap {

	public static Map<Integer, Integer> findPair(int[] arr, int sum) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(sum - arr[i])) {

				pairs.put(arr[i], sum - arr[i]);
			}
			map.put(arr[i], sum - arr[i]);
		}
		// System.out.println("No Pair found");
		return pairs;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		Map<Integer, Integer> pairs = findPair(arr, sum);
		System.out.println(pairs);
	}

}
