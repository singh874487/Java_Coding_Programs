package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.List;

public class Prog_1031_Last_Element_Of_An_Array {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

		String lastElement = listOfStrings.stream()
										  .skip(listOfStrings.size() - 1)
										  .findFirst()
										  .get();

		System.out.println(lastElement);

	}
}