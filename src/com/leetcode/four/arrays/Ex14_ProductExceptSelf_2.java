package com.leetcode.four.arrays;

public class Ex14_ProductExceptSelf_2 {

	public static void main(String[] args) {

		int nums[] = new int[] { 1, 2, 3, 4, 5 };

		int ans[] = productExceptSelf(nums);

		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

	private static int[] productExceptSelf(int[] nums) {

		int allProduct = 1;

		for (int i = 0; i < nums.length; i++) {
			allProduct = allProduct * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {

			nums[i] = allProduct / nums[i];
		}

		return nums;
	}

}
