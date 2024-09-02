package com.leetcode.two.string;
import java.util.*;

public class Ex4_ValidAnagram_2 {
	public static boolean isAnagram(String s, String t) {
        // if the length of s and t is not equal return false
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm1.containsKey(s.charAt(i))) {
                hm1.put(s.charAt(i), 1);
            } else {
                hm1.put(s.charAt(i), hm1.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!hm2.containsKey(t.charAt(i))) {
            	 hm2.put(t.charAt(i), 1);
            } else {
                hm2.put(t.charAt(i), hm2.get(t.charAt(i)) + 1);
            }
        }
        for (Character ch : hm1.keySet()) {
            if (!hm1.get(ch).equals(hm2.get(ch))) {
                return false;
            }                                       
        }
        return true;
    }
	
	
	
	public static void main(String[] args)
	{
		String str1 = "gram";
		String str2 = "armg";

		// Function call
		if (isAnagram(str1, str2))
			System.out.print("The two strings are "
							+ "anagram of each other");
		else
			System.out.print("The two strings are "
							+ "not anagram of each other");
	}
}



//1) using Two HashMap
//TC:O(n)
//SC: O(n)


