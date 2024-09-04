package com.test;

public class Test1 {

	public static void main(String[] args) {

		// 4, 6, 1, 9, 2, 5, 7, 3, 8

		int[] a = { 4, 6, 1, 9, 2 };
		int[] b = { 5, 7, 3, 8 };

		int len = a.length + b.length;
		int[] res = new int[len];

		int j = 0;

		for (int i = 0; i < a.length; i++) {

			res[j] = a[i];
			j++;
		}
		for (int i = 0; i < b.length; i++) {

			res[j] = b[i];
			j++;
		}
		int minI = 0;

		for (int i = 0; i < res.length; i++) {
			for (int k = i + 1; k < res.length; k++) {
//				if (res[i] < res[k]) {
//					minI = i;
//				} else {
//					minI = k;
//				}
				
				if (res[k] < res[minI]) { // Find the minimum element in unsorted array
					minI = k;
				}
			}

			swap(res, i, minI);
		}

		System.out.println("Array Elemets");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

	private static void swap(int[] res, int i, int minI) {

		int temp = res[i];
		res[i] = res[minI];
		res[minI] = temp;

	}

}
