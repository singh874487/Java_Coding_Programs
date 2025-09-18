package com.example.interview_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog_80003_Frequency_Of_Each_Character_1 {

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


/*
 * 
 * 
1) 

String str = "Hello";
str.chars().forEach(System.out::print);
output: 72 101 108 108 111
These numbers are the Unicode values of 'H', 'e', 'l', 'l', 'o'

2) Converting Unicode IntStream to Characters

 str.chars()
   .mapToObj(c -> (char) c)
   .forEach(System.out::print);
   
 O/P: H e l l o
 
 
 3) Why return IntStream and not Stream<Character>?

Java’s Stream<Character> has performance overhead due to boxing/unboxing.
Returning an IntStream (primitive specialization) is faster and more memory-efficient.

You can convert to Stream<Character> manually if needed.



Examples:
		1) Count Vowels in a String
				long count = str.toLowerCase()
                				.chars()
                				.filter(c -> "aeiou".indexOf(c) != -1)
                				.count();
				System.out.println("Vowel count: " + count);
				
		2) Remove Non-letter Characters
				String cleaned = str.chars()
                    				.filter(Character::isLetter)
                    				.mapToObj(c -> String.valueOf((char)c))
                    				.collect(Collectors.joining());

				System.out.println(cleaned);


 * 
 * 
 */
