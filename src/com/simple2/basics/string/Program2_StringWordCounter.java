package com.simple2.basics.string;

import java.util.Scanner;

public class Program2_StringWordCounter {

	public static void main(String[] args) {
		System.out.println("Enter a string");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (Character.isWhitespace(input.charAt(i))) {
				count++;
			}
		}
		System.out.println("Total words : " + (count + 1));
		scanner.close();

		System.out.println("Total words Second Take : " + input.split(" ").length);

	}

}
