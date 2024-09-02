package com.leetcode.one.integer;

public class Ex2_SingleNumber_2_Efficient {

	public static int singleNumber(int[] num) {

		int ans = num[0];
		for (int i = 1; i < num.length; i++) {
			ans = ans ^ num[i];
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] a = new int[] { 2, 1, 7, 1, 6, 6, 7, 2, 8 };
		int number = singleNumber(a);
		System.out.println(number);

	}

}

// TC:O(n) -  SC:O(1)


/*

XOR compares two input bits and generates one output bit. The logic is simple. 
If the bits are the same, the result is 0. If the bits are different, the result is 1.

*/




