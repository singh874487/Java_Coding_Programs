package com.leetcode.two.string;
import java.util.*;

public class Ex4_ValidAnagram_1 {
	public static boolean isAnagram(String a, String b)
	{
		// Check if length of both strings is same or not
		if (a.length() != b.length()) {
			return false;
		}
		// Create a HashMap containing Character as Key and
		// Integer as Value. We will be storing character as
		// Key and count of character as Value.
		HashMap<Character, Integer> map = new HashMap<>();
		// Loop over all character of String a and put in
		// HashMap.
		for (int i = 0; i < a.length(); i++) {
			// Check if HashMap already contain current
			// character or not
			if (map.containsKey(a.charAt(i))) {
				// If contains increase count by 1 for that
				// character
				map.put(a.charAt(i),
						map.get(a.charAt(i)) + 1);
			}
			else {
				// else put that character in map and set
				// count to 1 as character is encountered
				// first time
				map.put(a.charAt(i), 1);
			}
		}
		// Now loop over String b
		for (int i = 0; i < b.length(); i++) {
			// Check if current character already exists in
			// HashMap/map
			if (map.containsKey(b.charAt(i))) {
				// If contains reduce count of that
				// character by 1 to indicate that current
				// character has been already counted as
				// idea here is to check if in last count of
				// all characters in last is zero which
				// means all characters in String a are
				// present in String b.
				map.put(b.charAt(i),
						map.get(b.charAt(i)) - 1);
			}
			else {
				return false;
			}
		}
		// Extract all keys of HashMap/map
		Set<Character> keys = map.keySet();
		// Loop over all keys and check if all keys are 0.
		// If so it means it is anagram.
		for (Character key : keys) {
			if (map.get(key) != 0) {
				return false;
			}
		}
		// Returning True as all keys are zero
		return true;
	}
	public static void main(String[] args)
	{
		String str1 = "gram";
		String str2 = "arm";

		// Function call
		if (isAnagram(str1, str2))
			System.out.print("The two strings are "
							+ "anagram of each other");
		else
			System.out.print("The two strings are "
							+ "not anagram of each other");
	}
}





//1) using one HashMap
//TC:O(n)
//SC: O(n)


