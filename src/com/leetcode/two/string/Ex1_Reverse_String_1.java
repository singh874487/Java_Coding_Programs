package com.leetcode.two.string;

public class Ex1_Reverse_String_1 {

	public static void main(String[] args) {

		String s = "Hello Hi";

		reverseString(s);

	}

	private static void reverseString(String s) {

		char[] array = s.toCharArray();
		int len = array.length;
		char[] rev = new char[len];
		int x = 0;
		for (int i = len - 1; i >= 0; i--) {
			rev[x++] = array[i];

		}

		System.out.println(rev);

	}

}

// TC:O(n)
// SC: O(n)  // we are using array



// Steps

// Step:1 - convert string to a char array
// Step:2 - create an equivalent temp char array using the char array length
// Step:3 - 