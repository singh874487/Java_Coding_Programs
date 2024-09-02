package com.leetcode.two.string;

public class Ex4_ValidAnagram_4__Optimized2 {
	 public static boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false;
	        }
	        int[] table = new int[26];
	        for (int i = 0; i < s.length(); i++) {
	            table[s.charAt(i) - 'a']++;
	        }
	        for (int i = 0; i < t.length(); i++) {
	            table[t.charAt(i) - 'a']--;
	            if (table[t.charAt(i) - 'a'] < 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 public static void main(String[] args)
		{
			String str1 = "abcd";
			String str2 = "cbtm";

			// Function call
			if (isAnagram(str1, str2))
				System.out.print("The two strings are "
								+ "anagram of each other");
			else
				System.out.print("The two strings are "
								+ "not anagram of each other");
		}
}



//1) using HashMap
//TC:O(n)
//SC: O(n)


