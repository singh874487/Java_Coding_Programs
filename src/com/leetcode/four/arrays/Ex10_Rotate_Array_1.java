package com.leetcode.four.arrays;

public class Ex10_Rotate_Array_1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int k = 3;

		rotateArray(arr, k);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void rotateArray(int[] arr, int k) {

		k = k % arr.length;

		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, arr.length - 1);

	}

	private static void reverseArray(int[] arr, int left, int right) {

		for (int i = left; i <= right; i++) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}

	}

}
