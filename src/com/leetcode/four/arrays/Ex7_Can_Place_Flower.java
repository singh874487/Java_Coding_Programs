package com.leetcode.four.arrays;

public class Ex7_Can_Place_Flower {

	public static void main(String[] args) {

		// [1,0,0,0,0,0,1]

		//int[] arr = new int[] { 1, 0, 0, 0, 1 };

		 int[] arr = new int[] { 1, 0, 0, 0, 0, 0, 1 };

		int k = 2;

		boolean flag = canPlaceFlowers(arr, k);

		System.out.println(flag);

	}

	private static boolean canPlaceFlowers(int[] arr, int k) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				boolean emptyLeftPlot = (i - 1 < 0) || (arr[i - 1] == 0);
				boolean emptyRightPlot = (i + 1 >= arr.length) || (arr[i + 1] == 0);
				if (emptyLeftPlot && emptyRightPlot) {
					count++;
					arr[i] = 1;
				}

			}
		}

		return count >= k;
	}

}

// TC:O(n) , SC: O(1)

// point#1 :  due to short circuiting
//	boolean kk = (5 == 5) || (arr[k - 3] == 0);
// System.out.println(kk);

// point#2:   arr.length = last index +1

// point#3:  check coditio unnder loop-> if (arr[i] == 0) {