package com.leetcode.two.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex3_Repeated_DNA_Sequences_1 {

	public static void main(String[] args) {

		String s = "AAAAAAAABBAAAAAAAABB";

		List<String> string = getRepeatedDNASequences(s);
		System.out.println(string);

	}

	private static List<String> getRepeatedDNASequences(String s) {

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i <= s.length() - 10; i++) {
			String str = s.substring(i, i + 10);

			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}

			// map.put(str, map.getOrDefault(str, 0) + 1);

			
		}

		List<String> list = new ArrayList<>();

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				list.add(e.getKey());
			}
		}

		return list;

	}

}

// 1) using HashMap
// TC:O(n)
// SC: O(n)



