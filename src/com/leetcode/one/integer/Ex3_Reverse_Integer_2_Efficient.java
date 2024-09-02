package com.leetcode.one.integer;

public class Ex3_Reverse_Integer_2_Efficient {

	public static int reverseNumber(int num) {

		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;

		int reversed = 0;

		while (num != 0) {
			int lastDigit = num % 10;

			if (reversed > max / 10 || (reversed == max / 10 && lastDigit > 7)) {
				return 0;
			}

			if (reversed < min / 10 || (reversed == min / 10 && lastDigit < -8)) {
				return 0;
			}

			reversed = reversed * 10 + lastDigit;
			num = num / 10;
		}
		return reversed;
	}

	public static void main(String[] args) {

		int input = 2147483644;
		int number = reverseNumber(input);
		System.out.println(number);

	}

}

//  -2147483648
//   2147483647

// TC:O(log(n)) -  SC:O(1)




