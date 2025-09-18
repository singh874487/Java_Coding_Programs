package com.example.interview_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog_80015_Sort_String_According_To_Increasing_Order_Of_Their_Length {
	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		listOfStrings.stream()
					 .sorted(Comparator.comparing(String::length))
					 .forEach(System.out::println);

	}
}