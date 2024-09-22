package com.interview.asked;
import java.util.HashMap;
import java.util.Map;

public class Program_8_TwoSumOfNumberInArray_2 {
	
	public static void main(String[] args) {
		
		int[] arr = { 2, 7, 11, 99 };
		int n = 13; // Example target value

		// Call the method to find the indices
		int[] result = findTwoSumIndices(arr, n);

		// Print the result
		if (result != null) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No two indices found that sum up to " + n);
		}
	}

 
	
	public static int[] findTwoSumIndices(int[] arr, int n) {
		// Map to store the array element and its index
		Map<Integer, Integer> map = new HashMap<>();
		
		// Iterate through the array
		for (int i = 0; i < arr.length; i++) {
			// Calculate the complement that would sum up to the target
			int complement = n - arr[i];
			
			// Check if the complement is already in the map
			if (map.containsKey(complement)) {
				// If complement found, return the indices
				return new int[] { map.get(complement), i };
			}
			
			// Store the current element and its index in the map
			map.put(arr[i], i);
		}

		// Return null if no two indices found
		return null;
	}
}
