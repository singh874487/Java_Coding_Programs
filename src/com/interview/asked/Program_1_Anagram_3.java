package com.interview.asked;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_1_Anagram_3 {

	public static void main(String[] args) {

		String str1 = "Listen";
		String str2 = "Silent";

		boolean result = areAnagrams(str1, str2);

		if (result) {
			System.out.println(str1 + " and " + str2 + " are Anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are Not Anagram");
		}
	}

	 public static boolean areAnagrams(String str1, String str2) {
		 
	        if (str1 == null || str2 == null || str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to lowercase to ignore case differences
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        // Initialize an array to keep count of character frequencies
	        int[] charCount = new int[26]; // Assuming only lowercase English letters

	        // Increase count for characters in str1 and decrease for characters in str2
	        for (int i = 0; i < str1.length(); i++) {
	            charCount[str1.charAt(i) - 'a']++;
	            charCount[str2.charAt(i) - 'a']--;
	        }

	        // Check if all counts are zero
	        return Arrays.stream(charCount).allMatch(count -> count == 0);
	    }

}


// TC : O(n)
// SC : O(1)


/*
  
  
Explanation:
Character Frequency Array:

We use an integer array of size 26 (int[] charCount = new int[26];) to count the frequency of each letter.
For each character in the first string, we increment the corresponding index in the array.
For each character in the second string, we decrement the corresponding index in the array.
Check Frequency Counts:

If the two strings are anagrams, all counts in the array should be zero after processing both strings.
We use Arrays.stream(charCount).allMatch(count -> count == 0) to verify that all the counts are zero.
Time Complexity:
Time Complexity: O(n), where n is the length of the strings. This is because we only pass through each string once.
Space Complexity: O(1), as the size of the array used for counting characters is fixed (26 for lowercase English letters).
Benefits of This Approach:
This method avoids the overhead of sorting, making it more efficient for large inputs.
It is particularly useful when dealing with large strings or when performance is critical.
  
  
 */

 


/* 
 

*/







/*
 

*/




