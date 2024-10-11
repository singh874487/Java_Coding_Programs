package com.interview.asked;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Program_15_Group_Anagram_In_List_2 {

	public static void main(String[] args) {

		// Input words
		String[] words = { "eat", "ate", "tae", "abc", "bca", "xyz", "mnq", "eat" };

		// Call the method to group anagrams
		List<List<String>> groupedAnagrams = groupAnagrams(words);

		// Output the result
		System.out.println(groupedAnagrams);
	}

//Method to group anagrams
	public static List<List<String>> groupAnagrams(String[] words) {
		// HashMap to store sorted word as key and list of anagrams as value
		Map<String, List<String>> map = new HashMap<>();

		// Iterate through each word
		for (String word : words) {
			// Convert word to character array, sort it, and convert back to string
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);

			// Add the word to the corresponding anagram group
			if (!map.containsKey(sortedWord)) {
				map.put(sortedWord, new ArrayList<>());
			}
			map.get(sortedWord).add(word);
		}

		// Return the grouped anagrams as a list
		return new ArrayList<>(map.values());
	}
}