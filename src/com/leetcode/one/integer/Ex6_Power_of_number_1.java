package com.leetcode.one.integer;

public class Ex6_Power_of_number_1 {

	public static double powOfNumber(double num, int power) {

		double res = 1.0;
		int n = Math.abs(power);
		for (int i = 0; i < n; i++) {
			res = res * num;
		}

		if (power < 0)
			return 1 / res;
		else
			return res;
	}

	public static void main(String[] args) {

		double num = 2;
		int power = -2;
		double result = powOfNumber(num, power);

		System.out.println("Power of number is : " + result);

	}

}

//TC:O(n) 
//SC:O(1)

// time limit will excceed if power range is more


/*    Given an integer x, return true if x is a palindrome , and false otherwise.
* 	  121, 3443 are palindrome
* 
* 	  Note: Solve the problem without converting the Integer to a String
* 
*    case 1:   -121 is not palindrome , since reverse is 121-
*    case 2:    10 is not palindrome, since reverse is 01
* 
*/
