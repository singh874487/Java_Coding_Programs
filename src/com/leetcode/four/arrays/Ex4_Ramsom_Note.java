package com.leetcode.four.arrays;

public class Ex4_Ramsom_Note {

	public static void main(String[] args) {

		String ramsomNote = "old";
		String magazine = "gol";

		boolean val = canConstruct(ramsomNote, magazine);
		System.out.println(val);

	}

	private static boolean canConstruct(String ramsomNote, String magazine) {

		int[] frequency = new int[26];

		for (int i = 0; i < magazine.length(); i++) {
			char ch = magazine.charAt(i);
			frequency[ch - 'a']++;
		}

		for (int i = 0; i < ramsomNote.length(); i++) {
			char ch = ramsomNote.charAt(i);

			if (frequency[ch - 'a'] == 0)
				return false;
			frequency[ch - 'a']--;
		}

		return true;
	}

}

// TC : O(n)
// SC : O(n)
