package com.leetcode.four.arrays;

public class Ex6_Length_Of_Last_Word {

	public static void main(String[] args) {

		String str = "I am best and goods";

		int len = wordLength(str);

		System.out.println(len);

	}

	private static int wordLength(String str) {

		int right = str.length() - 1;

		while (right >= 0 && str.charAt(right) == ' ') {
			right--;
		}

		int left = right;

		while (left >= 0 && str.charAt(left) != ' ') {
			left--;
		}

		return right - left;
	}

}
