package com.leetcode.two.string;

public class Ex1_Reverse_String_2_Efficient {

	public static void main(String[] args) {

		String s = "Hello Hi";

		reverseString(s);

	}

	private static void reverseString(String s) {

		char[] array = s.toCharArray();

		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			char temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}

		System.out.println(array);

	}

}


// TC:O(n)
// SC: O(1)