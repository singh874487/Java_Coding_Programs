package com.leetcode.one.integer;

public class Ex4_Palindrom_Number_3_Efficient {

	public static boolean palindromNumber(int num) {

		if (num < 0 || (num != 0 && num % 10 == 0)) {
			return false;
		}
		int reversed = 0;
		int x = num;

		while (x > reversed) {
			int lastDigit = x % 10;
			reversed = reversed * 10 + lastDigit;
			x = x / 10;
		}

		return x == reversed || x == reversed / 10;

	}

	public static void main(String[] args) {

		int input = 1213121;
		boolean palindromNumber = palindromNumber(input);
		if (palindromNumber) {
			System.out.println(input + " is Palindrom");
		} else {
			System.out.println(input + " is NOT Palindrom");
		}

	}

}

 

// TC:O(lon(n)) base 10 
//  SC:O(1)




/*    Given an integer x, return true if x is a palindrome , and false otherwise.
 * 	  121, 3443 are palindrome
 * 
 * 	  Note: Solve the problem without converting the Integer to a String
 * 
 *    case 1:   -121 is not palindrome , since reverse is 121-
 *    case 2:    10 is not palindrome, since reverse is 01
 * 
 */

