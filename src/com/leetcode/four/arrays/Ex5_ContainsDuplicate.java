package com.leetcode.four.arrays;

import java.util.HashSet;
import java.util.Set;

public class Ex5_ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };

		boolean flag = containsDuplicate(nums);

		System.out.println(flag);

	}

	private static boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}

		return false;
	}

}
