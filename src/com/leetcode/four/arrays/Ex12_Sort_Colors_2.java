package com.leetcode.four.arrays;

public class Ex12_Sort_Colors_2 {

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 0, 1, 2, 0, 1 };

		sortColors(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void sortColors(int[] nums) {

		int left = 0, mid = 0, right = nums.length - 1;

		while (mid <= right) {

			if (nums[mid] == 0) {
				swap(nums, left, mid);
				mid++;
				left++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, right);
				right--;
				// mid++;
			}

		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
