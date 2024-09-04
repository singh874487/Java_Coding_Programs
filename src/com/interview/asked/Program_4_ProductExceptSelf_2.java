package com.interview.asked;

public class Program_4_ProductExceptSelf_2 {
	
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];

		// Initialize the answer array with 1
		for (int i = 0; i < n; i++) {
			answer[i] = 1;
		}

		// Calculate prefix products
		int prefix = 1;
		for (int i = 0; i < n; i++) {
			answer[i] = prefix;
			prefix *= nums[i];
		}

		// Calculate suffix products and multiply with the corresponding prefix product
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			answer[i] *= suffix;
			suffix *= nums[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4 };
		int[] result1 = productExceptSelf(nums1);
		System.out.println("Output for nums1: " + java.util.Arrays.toString(result1));

		int[] nums2 = { -1, 1, 0, -3, 3 };
		int[] result2 = productExceptSelf(nums2);
		System.out.println("Output for nums2: " + java.util.Arrays.toString(result2));
	}
}







/*

Here's a Java program that solves the problem of finding an array where each element is the product of 
all the elements of the input array except the element at that index, without using division and in O(n) time complexity:




Explanation:
Prefix Products:

We first calculate the prefix products for each element. This means that for each element i, we store the product of all the elements before i in the array.
We initialize a variable prefix to 1 and multiply it with each element in the array while iterating from left to right.
Suffix Products:

Next, we calculate the suffix products for each element. This means that for each element i, we multiply the product of all elements after i.
We initialize a variable suffix to 1 and multiply it with each element in the array while iterating from right to left.
Result Array:

The result array answer is built by multiplying the prefix and suffix products for each element.
Example Walkthrough:
For nums = [1, 2, 3, 4]:

Prefix products: [1, 1, 2, 6]
Suffix products: [24, 12, 4, 1]
Final answer: [24, 12, 8, 6]
For nums = [-1, 1, 0, -3, 3]:

Prefix products: [1, -1, -1, 0, 0]
Suffix products: [0, 0, 9, -3, 1]
Final answer: [0, 0, 9, 0, 0]
This algorithm runs in O(n) time and does not use division, as required.






*/