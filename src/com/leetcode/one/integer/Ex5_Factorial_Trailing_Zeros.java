package com.leetcode.one.integer;

public class Ex5_Factorial_Trailing_Zeros {

	public static int trailingZeroes(int num) {

		int count = 0;

		int currPowerOfFive = 5;

		while (num >= currPowerOfFive) {
			count = count + (num / currPowerOfFive);

			currPowerOfFive = currPowerOfFive * 5;

		}

		return count;
	}

	public static void main(String[] args) {

		int input = 25;
		int count = trailingZeroes(input);

		System.out.println("Factorial Trailing Zeroes : " + count);

	}

}

//TC:O(n) 
//SC:O(n)




/*    Given an integer x, return true if x is a palindrome , and false otherwise.
* 	  121, 3443 are palindrome
* 
* 	  Note: Solve the problem without converting the Integer to a String
* 
*    case 1:   -121 is not palindrome , since reverse is 121-
*    case 2:    10 is not palindrome, since reverse is 01
* 
*/
