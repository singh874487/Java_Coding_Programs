package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.List;

public class Prog_1024_Strings_Start_With_A_Number {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

		listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);

	}
}