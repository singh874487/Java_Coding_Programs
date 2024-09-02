package com.leetcode.four.arrays;

public class Ex10_Rotate_Array_2 {

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

	private static void reverseArray(int[] arr, int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

	}

}



// TC : O(3n) = O(n)  ,  SC : O(1)

