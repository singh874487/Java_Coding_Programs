package com.interview.asked;
public class Program_9_MaxConsecutiveOnes {
	
    public static int maxOnes(int[] arr, int k) {  // {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}; k=2
    	
        int left = 0, right = 0; // Two pointers for the sliding window
        int maxOnesCount = 0;    // To store the maximum count of 1s (with at most k flips)
        int zeroCount = 0;       // To count the number of zeros in the current window
        
        while (right < arr.length) {
            // If the right pointer points to a zero, increment the zero count
            if (arr[right] == 0) {
                zeroCount++;
            }

            // If the number of zeros exceeds k, shrink the window by moving the left pointer
            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Calculate the maximum window size where the number of zeros <= k
            maxOnesCount = Math.max(maxOnesCount, right - left + 1);
            right++;
        }

        return maxOnesCount;
    }

    public static void main(String[] args) {
    	
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 2;

        int result = maxOnes(arr, k);
        System.out.println("Maximum consecutive 1s (with at most " + k + " flips): " + result);
        
        
        
        
        int[] arr2 = {1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1};
        int k2 = 3;

        int result2 = maxOnes(arr2, k2);
        System.out.println("\nMaximum consecutive 1s (with at most " + k2 + " flips): " + result2);
    }
}