package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog_1011_Three_Maximum_And_Three_Minimum_Numbers {
	
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		// 3 minimum Numbers

		System.out.println("-----------------");
		System.out.println("Minimum 3 Numbers");
		System.out.println("-----------------");

		listOfIntegers.stream()
					  .sorted()
					  .limit(3)
					  .forEach(System.out::println);

		// 3 Maximum Numbers

		System.out.println("-----------------");
		System.out.println("Maximum 3 Numbers");
		System.out.println("-----------------");

		listOfIntegers.stream()
					  .sorted(Comparator.reverseOrder())
					  .limit(3)
					  .forEach(System.out::println);

	}
}