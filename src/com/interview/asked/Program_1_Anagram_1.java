package com.interview.asked;

import java.util.Arrays;

public class Program_1_Anagram_1 {

	public static void main(String[] args) {

		String a = "AB";
		String b = "BA";

		boolean flag = isAnagram(a, b);

		if (flag) {
			System.out.println(a + " and " + b + " are Anagram");
		} else {
			System.out.println(a + " and " + b + " are Not Anagram");
		}
	}

	private static boolean isAnagram(String a, String b) {

		
		boolean flag = false;
		if (a.length() != b.length()) {
			return false;
		}

		char[] arrayA = a.toCharArray();
		char[] arrayB = b.toCharArray();

		Arrays.sort(arrayA);
		Arrays.sort(arrayB);

		if (Arrays.equals(arrayA, arrayB)) {
			flag = true;
		}

		return flag;
	}

}

// TC: O(nlogn)
// SC: O(1)



