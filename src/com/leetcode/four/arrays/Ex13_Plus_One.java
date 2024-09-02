package com.leetcode.four.arrays;

public class Ex13_Plus_One {

	public static void main(String[] args) {

		int arr[] = new int[] { 9, 9 };

		int[] UpdatedArr = plusOne(arr);

		for (int i : UpdatedArr) {
			System.out.print(i + " ");
		}

	}

	private static int[] plusOne(int[] arr) {

		int carry = 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			int curr = arr[i] + carry;

			if (curr >= 10) {
				arr[i] = curr % 10;
				carry = 1;
			} else {
				arr[i] = curr;
				carry = 0;
			}

		}

		if (carry == 1) {
			int arrNew[] = new int[arr.length + 1];
			arrNew[0] = 1;
			return arrNew;
		}

		return arr;
	}

}

// TC: O(n) and SC: O(n)