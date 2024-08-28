package com.example.interview_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog_3_Frequency_Of_Each_Character_1 {

	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";

		Map<Character, Long> charCountMap = inputString.chars() // Convert the String to an IntStream
				.mapToObj(c -> (char) c) // Convert each int in the stream to a char
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Group by character and count them

		System.out.println(charCountMap);   
		
		
		charCountMap.forEach((character, frequency) -> System.out.println(character + ": " + frequency)); // Print each character and its frequency

	}

}






//   The chars() method is an instance method of the String class. 
//   It returns an IntStream that consists of the code point values of the characters in the given string. 
//	 This method was added to the String class in Java 9


//  IntStream mapToObj() returns an object-valued Stream consisting of the results of applying the given function.


