package com.leetcode.two.string;

public class Ex4_ValidAnagram_3_Optimized1 {
	 public static boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false;
	        }
	        int[] counter = new int[26];
	        for (int i = 0; i < s.length(); i++) {
	            counter[s.charAt(i) - 'a']++;
	            counter[t.charAt(i) - 'a']--;
	        }
	        for (int count : counter) {
	            if (count != 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
		public static void main(String[] args)
		{
			String str1 = "gram";
			String str2 = "armr";

			// Function call
			if (isAnagram(str1, str2))
				System.out.print("The two strings are "
								+ "anagram of each other");
			else
				System.out.print("The two strings are "
								+ "not anagram of each other");
		}
}



//1) using  array of size 26
//TC:O(n+26) = O(n)
//SC:O(26) = O(1)


