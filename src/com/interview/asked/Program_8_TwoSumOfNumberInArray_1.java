package com.interview.asked;

public class Program_8_TwoSumOfNumberInArray_1 {
	
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

	/**
	 * Finds two indices in the array whose values sum up to the target value.
	 * 
	 * @param arr The input array.
	 * @param n   The target sum.
	 * @return An array of two indices whose values sum up to the target value, or
	 *         null if no such indices exist.
	 */
	public static int[] findTwoSumIndices(int[] arr, int n) {
		int len = arr.length;
		int[] res = new int[2];

		// Iterate through each element
		for (int i = 0; i < len; i++) {
			// Start the inner loop from the next element
			for (int j = i + 1; j < len; j++) {
				// Check if the sum of the two elements equals the target value
				if (arr[i] + arr[j] == n) {
					res[0] = i;
					res[1] = j;
					return res; // Return the result as soon as the solution is found
				}
			}
		}

		return null; // Return null if no such indices are found
	}
}