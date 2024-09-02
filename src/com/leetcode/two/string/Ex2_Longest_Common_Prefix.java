package com.leetcode.two.string;

public class Ex2_Longest_Common_Prefix {

	public static void main(String[] args) {

		String[] s = new String[] { "Hello", "Heldom", "Helma" };

		String prefix = printCommonPrefix(s);
		System.out.println(prefix);
	}

	private static String printCommonPrefix(String[] s) {

		String prefix = s[0];

		for (int i = 1; i < s.length; i++) {

			while (s[i].indexOf(prefix) != 0) {

				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}

		}

		return prefix;

	}

}

// TC:O(mxn)
// SC: O(1)