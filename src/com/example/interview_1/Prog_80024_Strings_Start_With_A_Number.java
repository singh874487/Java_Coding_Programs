package com.example.interview_1;

import java.util.Arrays;
import java.util.List;

public class Prog_80024_Strings_Start_With_A_Number {
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

		listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);

	}
}