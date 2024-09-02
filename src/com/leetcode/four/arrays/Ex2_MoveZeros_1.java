package com.leetcode.four.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Ex2_MoveZeros_1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 0, 4, 5, 0, 2, 0, 6, 9 };

		moveZeros(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	private static void moveZeros(int[] arr) {

		if (arr.length == 1)
			return;

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				queue.add(arr[i]);
			}

		}

		int next = 0;
		while (queue.size() != 0) {
			arr[next] = queue.poll();
			next++;
		}

		for (int i = next; i < arr.length; i++) {
			arr[i] = 0;
		}

	}

}
