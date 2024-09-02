package com.simple2.basics.string;

import java.util.Scanner;

public class Program1_StringReverse1 {

	public static void main(String[] args) {
		System.out.println("Enter a string");

		Scanner scanner = new Scanner(System.in);
	//	String input = scanner.next();
		String input = scanner.nextLine();
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
		scanner.close();
		
		
		
		StringBuffer sb = new StringBuffer(input).reverse();
		System.out.println(sb);
	}

}


// both can be used

// nextLine is used when we are inputting sentence with space

// next also take first string from input (dont consider space and rest statement)