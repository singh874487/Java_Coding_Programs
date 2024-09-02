package com.leetcode.one.integer;

import java.util.HashSet;
import java.util.Set;

public class Ex2_SingleNumber_1 {

	public static int singleNumber(int[] num) {

		if (num.length == 1) {
			return num[0];
		}
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < num.length; i++) {
			int n = num[i];
			if (set.contains(n)) {
				set.remove(n);
			} else {
				set.add(n);
			}
		}

		return set.iterator().next();    // NoSuchElementException
	}

	public static void main(String[] args) {

		int[] a = new int[] { 2, 1, 7, 1, 6, 6, 7 };
		int number = singleNumber(a);
		System.out.println(number);

	}

}


// TC:O(n) -  SC:O(n)




// iterate over set

/*  
    Creating an instance of Iterator
    
    Iterator<Integer> iterate = numbers.iterator();
    System.out.println("Iterating over Set:");
    while(iterate.hasNext()) {
      System.out.print(iterate.next() + ", ");
    }
  
  
 */



/*   Given a non-empty array of integers nums, every element appears twice except for one,
 * 	 Find that single one
 * 
 *   You must implement a solution with a linear complexity and use only constant extra space


*/





