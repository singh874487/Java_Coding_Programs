package com.interview.asked;

public class Program_4_ProductExceptSelf_2_WithDivision {

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];

		// Calculate the product of all elements in the array
		int totalProduct = 1;
		int zeroCount = 0;

		for (int num : nums) {
			if (num == 0) {
				zeroCount++;
			} else {
				totalProduct *= num;
			}
		}

		// If there are more than one zero in the array, all elements in the answer will
		// be 0
		if (zeroCount > 1) {
			return new int[n]; // All elements are zero
		}

		// Fill the answer array
		for (int i = 0; i < n; i++) {
			if (zeroCount == 1) {
				// If there is exactly one zero in the array, all elements except the one
				// corresponding to the zero are 0
				answer[i] = (nums[i] == 0) ? totalProduct : 0;
			} else {
				// If there are no zeros, divide the total product by the current element
				answer[i] = totalProduct / nums[i];
			}
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


Explanation:
Calculate the Total Product:

We calculate the product of all elements in the array, but we also keep track of the number of zeros.
If there is more than one zero in the array, all the elements in the result will be zero.
Handle Zero Elements:

If there is exactly one zero in the array, all elements in the result array will be zero except the one corresponding to the zero in the input array, which will be equal to the product of all non-zero elements.
Final Division:

If there are no zeros, each element in the result is calculated by dividing the total product by the corresponding element in the input array.
Example Output:
For nums = [1, 2, 3, 4]:

Total product: 24
Result array: [24/1, 24/2, 24/3, 24/4] → [24, 12, 8, 6]
For nums = [-1, 1, 0, -3, 3]:

Total product (excluding zero): -9
Result array: [0, 0, -9, 0, 0]
This approach leverages the division operation and handles the edge cases of zeros in the array efficiently.



*/