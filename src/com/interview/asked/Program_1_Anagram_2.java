package com.interview.asked;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_1_Anagram_2 {

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

        // Normalize strings: remove spaces, convert to lowercase, and sort characters
        String normalizedStr1 = normalize(str1);
        String normalizedStr2 = normalize22(str2);

        // Check if the sorted versions are equal
        return normalizedStr1.equals(normalizedStr2);
    }
    
    
    private static String normalize(String str) {
        return Stream.of(str.toLowerCase().split(""))
                     .sorted()
                     .collect(Collectors.joining());
    }
    
    // For understanding
    private static String normalize22(String str) {
        return Arrays.stream(str.toLowerCase().split(""))
                     .sorted()
                     .collect(Collectors.joining());
    }

}


// TC : O(nlogn)
// SC : O(1)


/*
 Explanation:
 
1) Normalization:

Convert the strings to lowercase to make the comparison case-insensitive.
Split the string into an array of characters.
Sort the characters.
Join the sorted characters back into a string.

2) Comparison:

After normalizing both strings, if they are equal, then they are anagrams.

 */

 


/* 

The time complexity of the anagram checking algorithm using Java Streams can be analyzed as follows:

Steps Breakdown:
Normalization:

Convert to Lowercase: The toLowerCase() method runs in O(n) time, where n is the length of the string.
Split the String: The split("") method creates an array of characters from the string. This operation is also O(n).
Sorting the Characters: The sorted() method sorts the array of characters. The time complexity of sorting is O(n log n).
Joining the Characters: The collect(Collectors.joining()) method joins the characters back into a string, which takes O(n) time.
Comparison:

After normalizing both strings, the comparison is O(n) because it involves comparing two strings of length n.
Overall Time Complexity:
The dominant operation here is sorting, which has a time complexity of O(n log n).
All other operations (lowercasing, splitting, joining, and comparing) are O(n).
Thus, the overall time complexity of this anagram checking algorithm is O(n log n), where n is the length of the strings being compared.


*/







/*

In Java, the sorted() method used in streams internally relies on the Arrays.sort() method when sorting an array of objects 
(such as strings or characters).

Sorting Algorithm Used:
For Primitives: When sorting primitive types (e.g., int[]), Java uses a variant of Dual-Pivot Quicksort, which was introduced in Java 7. 
It has an average-case time complexity of O(n log n).


For Objects: When sorting objects (e.g., String[] or Character[]), Java uses Timsort. 
Timsort is a hybrid sorting algorithm derived from merge sort and insertion sort, designed to perform well on many kinds of real-world data. 
It has a time complexity of O(n log n) in the worst case but can perform better in scenarios where the data is partially sorted.

Summary:
The sorted() method in Java Streams uses Timsort for objects like strings and characters.
Timsort's time complexity is O(n log n) in the worst case, but it is optimized for partially sorted data, 
	making it efficient in practice for many common cases.


*/




