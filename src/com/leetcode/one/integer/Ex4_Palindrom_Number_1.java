package com.leetcode.one.integer;

public class Ex4_Palindrom_Number_1 {

	public static boolean palindromNumber(int num) {

		String str = String.valueOf(num);

		char[] array = str.toCharArray();
		int last = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[last]) {
				return false;
			}
			last--;
		}

		return true;

	}

	public static void main(String[] args) {

																																																																						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int input = -121;
		boolean palindromNumber = palindromNumber(input);
		if (palindromNumber) {
			System.out.println(input + " is Palindrom");
		} else {
			System.out.println(input + " is NOT Palindrom");
		}

	}

}




//TC:O(n) 
//SC:O(n)


// first 50 palindrome numbers are :    0,1,2,3,4,5,6,7,8,9,11,22,33........101,111.......404


/*    Given an integer x, return true if x is a palindrome , and false otherwise.
* 	  121, 3443 are palindrome
* 
* 	  Note: Solve the problem without converting the Integer to a String
* 
*    case 1:   -121 is not palindrome , since reverse is 121-
*    case 2:    10 is not palindrome, since reverse is 01
* 
*/
