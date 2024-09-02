package com.leetcode.one.integer;

public class Ex4_Palindrom_Number_2 {

	public static boolean palindromNumber(int num) {

		if (num < 0 || (num != 0 && num % 10 == 0))
			return false;

		int numCopy = num;
		int rev = 0;

		while (numCopy != 0) {
			int lastDigit = numCopy % 10;
			rev = rev * 10 + lastDigit;
			numCopy = numCopy / 10;

		}

		return num == rev;

	}

	public static void main(String[] args) {

		int input = 0;
		boolean palindromNumber = palindromNumber(input);
		if (palindromNumber) {
			System.out.println(input + " is Palindrom");
		} else {
			System.out.println(input + " is NOT Palindrom");
		}

	}

}

//TC:O(n) 
//SC:O(1)

/*
 * Given an integer x, return true if x is a palindrome , and false otherwise.
 * 121, 3443 are palindrome
 * 
 * Note: Solve the problem without converting the Integer to a String
 * 
 * case 1: -121 is not palindrome , since reverse is 121- case 2: 10 is not
 * palindrome, since reverse is 01
 * 
 */
