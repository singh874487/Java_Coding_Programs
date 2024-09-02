package com.simple1.basics;

import java.util.Scanner;

public class Program3_CreditCardIssuer {

	public static void main(String[] args) {
		System.out.println("Enter a number");

		Scanner scanner = new Scanner(System.in);
		int creditScore = scanner.nextInt();

		if ((creditScore < 400) || creditScore > 850) {
			System.out.println("Invalid CreditScore");
		} else {
			if (creditScore >= 400 && creditScore < 600) {
				System.out.println("Silver Card");
			} else if (creditScore >= 600 && creditScore < 800) {
				System.out.println("Gold Card");
			} else {
				System.out.println("Platinum Card");
			}
		}

		scanner.close();

	}

}
