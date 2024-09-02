package com.leetcode.four.arrays;

public class Ex9_Merge_Sorted_Arrays {

	public static void main(String[] args) {

		int nums1[] = new int[] { 2, 4, 5, 7, 0, 0, 0 };

		int nums2[] = new int[] { 3, 9, 55 };

		mergeArrays(nums1, nums1.length - 3, nums2, nums2.length);

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + ",");
		}

	}

	private static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {

		int p1 = m - 1;
		int p2 = n - 1;

		for (int i = nums1.length - 1; i >= 0; i--) {

			int valAtP1 = p1 >= 0 ? nums1[p1] : Integer.MIN_VALUE;
			int valAtP2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;

			if (valAtP1 > valAtP2) {
				nums1[i] = valAtP1;
				p1--;
			} else {
				nums1[i] = valAtP2;
				p2--;
			}
		}

	}

}
