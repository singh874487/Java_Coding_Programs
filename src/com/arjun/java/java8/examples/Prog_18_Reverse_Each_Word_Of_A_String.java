package com.arjun.java.java8.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Prog_18_Reverse_Each_Word_Of_A_String {
	public static void main(String[] args) {
		
		 String str = "Java Concept Of The Day";
         
	        String reversedStr = Arrays.stream(str.split(" "))
	                                    .map(word -> new StringBuffer(word).reverse())
	                                    .collect(Collectors.joining(" "));
	         
	        System.out.println(reversedStr);

	}
}