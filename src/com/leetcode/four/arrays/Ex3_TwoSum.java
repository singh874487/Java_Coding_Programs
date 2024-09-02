package com.leetcode.four.arrays;

import java.util.HashMap;
import java.util.Map;

public class Ex3_TwoSum {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 3, 5, 6, 8, 4, 9 };
		int target = 13;

		int[] list = getTwoSumIndices(arr, target);
		System.out.println(list[0]+ " " + list[1]);

	}

	private static int[] getTwoSumIndices(int[] arr, int target) {

		int[] ans = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int diff = target - arr[i];

			if (map.containsKey(diff)) {
				ans[0] = i;
				ans[1] = map.get(diff);

				break;
			} else {
				 
				map.put(arr[i], i);
			}

		}

		return ans;
	}

}



// TC : O(n)
// SC : O(n)

