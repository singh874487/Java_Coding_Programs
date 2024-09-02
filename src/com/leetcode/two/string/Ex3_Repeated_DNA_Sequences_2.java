package com.leetcode.two.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex3_Repeated_DNA_Sequences_2 {

	public static void main(String[] args) {

		String s = "AAAAAAAABBAAAAAAAABB";

		List<String> string = getRepeatedDNASequences(s);
		System.out.println(string);

	}

	private static List<String> getRepeatedDNASequences(String s) {

		Set<String> set = new HashSet<>();
		Set<String> list = new HashSet<>();

		for (int i = 0; i <= s.length() - 10; i++) {
			String subString = s.substring(i, i + 10);

			if (set.contains(subString)) {
				list.add(subString);
			} else {
				set.add(subString);
			}
		}
		return new ArrayList<>(list);
	}

}

// 1) using HashSet
// TC:O(n)
// SC: O(n)