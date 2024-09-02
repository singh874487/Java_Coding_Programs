package com.leetcode.one.integer;

public class Ex6_Power_of_number_2 {

	public static double powOfNumber(double num, int p) {
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		if (num == 1.0)
			return 1.0;
		else if (num == -1.0 && p > 0)
			return -1.0;
		else if (num == -1.0 && p < 0)
			return 1.0;
		if ((num != 1.0 && p >= maxValue) || (num != -1.0 && p <= minValue))
			return 0.00;
		
		double res = 1.0;
		int power = Math.abs(p);
System.out.println(power);
		while (power != 0) {

			if (power % 2 == 1) {
				res = res * num;
				power -= 1;
			}
			num = num * num;
			power /= 2;

		}
		return p < 0 ? 1 / res : res;

	}

	public static void main(String[] args) {

		double num = 1.0000000000001;
		int power = -2147483648;
		double result = powOfNumber(num, power);

		System.out.println("Power of number is : " + result);

	}

}

//TC:O(n) 
//SC:O(1)

// time limit will excceed if power range is more

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
