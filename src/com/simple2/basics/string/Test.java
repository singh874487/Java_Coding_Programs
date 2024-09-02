package com.simple2.basics.string;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String s = "MaIN";
		StringBuffer sb = new StringBuffer();

		List<String> l = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {
				sb.append(s.charAt(i));
				l.add(String.valueOf(s.charAt(i)));

				for (int j = i + 1; j < s.length(); j++) {

					if (!Character.isUpperCase(s.charAt(j))) {
						sb.append(s.charAt(j));
					} else if (Character.isUpperCase(s.charAt(j))) {
						sb.append(s.charAt(j));
						l.add(sb.toString());

					}

				}
				sb = new StringBuffer();
			}
		}
		System.out.println(l);
	}

}
