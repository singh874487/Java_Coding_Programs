package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog_1015_Sort_String_According_To_Increasing_Order_Of_Their_Length {
	
	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		listOfStrings.stream()
					 .sorted(Comparator.comparing(String::length))
					 .forEach(System.out::println);

	}
}