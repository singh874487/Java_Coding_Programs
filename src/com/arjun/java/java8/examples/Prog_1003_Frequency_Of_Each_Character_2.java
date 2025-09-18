package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Prog_1003_Frequency_Of_Each_Character_2 {

	public static void main(String[] args) {
		String str = "Hello Java, I am here";
		Map<String, Long> result = Arrays.stream(str.split(""))
				//.filter(a->!a.isBlank())
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}

}
