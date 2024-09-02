package com.simple1.basics;

import java.util.Scanner;

public class Program8_DuckNumberChecker {

	public static void main(String[] args) {
		System.out.println("Enter a number");

		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();

		boolean isDuckNumber = false;

		while (num != 0) {
			digit = num % 10;

			if (digit == 0) {
				isDuckNumber = true;
				break;
			}
			num = num / 10;
		}
		if (isDuckNumber) {
			System.out.print("Duck Number");
		} else {
			System.out.println("Not Duck Number");
		}
		scanner.close();

	}

}
