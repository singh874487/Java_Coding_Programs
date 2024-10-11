package com.interview.asked;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Program_15_Group_Anagram_In_List_1 {

	public static void main(String[] args) {

		List<List<String>> res = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();

		String[] strs = { "eat", "ate", "tae", "abc", "bca", "xyz", "mnq", "eat" }; // [[eat, ate, tae, eat ], [mnq],
																					// [abc, bca], [xyz]]

		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			String t = Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
			if (!map.containsKey(t)) {
				List<String> tl = new ArrayList<>();
				tl.add(str);
				res.add(tl);
				map.put(t, res.size() - 1);
			} else {
				res.get(map.get(t)).add(str);
			}

		}

		System.out.println(res);

	}
}
