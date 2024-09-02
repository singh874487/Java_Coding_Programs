package com.leetcode.one.integer;

import java.util.ArrayList;
import java.util.List;

public class Ex1_FizBuzz {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		for (int i = 1; i <= 150; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				list.add("Fizz Buzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");

			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(Integer.toString(i));
			}
		}
		
		System.out.println(list);

	}

}
