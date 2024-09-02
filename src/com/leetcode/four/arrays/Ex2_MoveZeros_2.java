package com.leetcode.four.arrays;

public class Ex2_MoveZeros_2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 1, 0, 4, 5, 0, 2, 0, 6, 9 };

		moveZeros(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	private static void moveZeros(int[] arr) {

		if (arr.length == 1)
			return;

		int left = 0;

		for (int right = 0; right < arr.length; right++) {

			if (arr[right] != 0) {
				arr[left] = arr[right];
				left++;
			}
		}

		for (int i = left; i < arr.length; i++) {
			arr[i] = 0;
		}

	}

}
