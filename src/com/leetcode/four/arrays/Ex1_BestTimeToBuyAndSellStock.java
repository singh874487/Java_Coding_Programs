package com.leetcode.four.arrays;

public class Ex1_BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		// int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };

		int[] prices = new int[] { 7, 6, 5, 4, 3, 2 };

		// int[] prices = new int[] { 9, 2, 5, 1, 8, 4 };

		int profit = maxProfit(prices);

		System.out.println("Profit : " + profit);
	}

	private static int maxProfit(int[] prices) {

		int profit = 0;

		if (prices.length == 1) {
			return profit;
		}

		int left = 0;

		for (int right = 1; right < prices.length; right++) {

			if (prices[right] > prices[left]) {
				profit = Math.max(profit, prices[right] - prices[left]);
			} else {
				left = right;
			}

		}

		return profit;

	}

}
