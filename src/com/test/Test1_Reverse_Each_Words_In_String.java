package com.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test1_Reverse_Each_Words_In_String {

	public static void main(String[] args) {
		
		String str = "this is my name";

		  String output = Arrays.stream(str.split(" "))
			.map(a-> new StringBuffer(a).reverse())
			.collect(Collectors.joining(" "));
		  
			System.out.println("Reverse of earch words in the string: " + output);

	}

}
