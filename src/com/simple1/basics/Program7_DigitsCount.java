package com.simple1.basics;

import java.util.Scanner;

public class Program7_DigitsCount {

	public static void main(String[] args) {
		System.out.println("Enter a number");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(), count = 0;

		while (num != 0) {
			count++;
			num = num / 10;
		}
		System.out.print("Count of digits : " + count);
		scanner.close();

	}

}
