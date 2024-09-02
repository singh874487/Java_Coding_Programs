package com.leetcode.one.integer;

public class Ex3_Reverse_Integer_1 {

	public static int reverseNumber(int number) {

		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		return reverse;
	}

	public static void main(String[] args) {

		int input = 34342;
		int number = reverseNumber(input);
		System.out.println("The reverse of number "+input+" is : " + number);

	}
}



/*

Given a signed 32-bit integer x return x with its digits reversed. If reversing x causes the value
to go outside the signed 32-bit integer rnage [-2^31, 2^31-1], then return 0

Assume the environment does not allow to store 64- bit integers(signed or unsigned)

2147483647

*/