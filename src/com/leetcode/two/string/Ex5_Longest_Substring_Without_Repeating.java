package com.leetcode.two.string;

import java.util.HashMap;
import java.util.Map;

public class Ex5_Longest_Substring_Without_Repeating {

	public static void main(String[] args) {

		String s = "ABABAD";

		int len = longestSubstring(s);
		System.out.println(len);

	}

	private static int longestSubstring(String s) {

		Map<Character, Integer> map = new HashMap<>();
		int left = 0;
		int ans = 0;

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			if (!map.containsKey(ch)) {
				map.put(ch, right);
			} else {
				left = Math.max(left, map.get(ch) + 1);
				map.put(ch, right);

			}
			ans = Math.max(ans, right - left + 1);

		}

		return ans;

	}

}

// TC:O(n)
// SC: O(n)