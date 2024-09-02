package com.leetcode.four.arrays;

public class Ex11_Jump_Game {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 2, 1, 1, 4 };

		boolean flag = reachable(arr);
		System.out.println(flag);

	}

	private static boolean reachable(int[] arr) {

		int reachable = 0;
		for (int i = 0; i < arr.length && i <= reachable; i++) {

			reachable = Integer.max(reachable, i + arr[i]);

			if (reachable >= arr.length - 1) {
				return true;
			}

		}

		return false;
	}

}
