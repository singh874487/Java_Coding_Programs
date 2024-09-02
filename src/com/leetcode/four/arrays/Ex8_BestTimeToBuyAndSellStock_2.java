package com.leetcode.four.arrays;

public class Ex8_BestTimeToBuyAndSellStock_2 {

	public static void main(String[] args) {

		// int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };

		// int[] prices = new int[] { 7, 6, 5, 4, 3, 2 };

		int[] prices = new int[] { 9, 2, 5, 1, 8, 4 };

		int profit = maxProfit(prices);

		System.out.println("Profit : " + profit);
	}

	private static int maxProfit(int[] prices) {

		int profit = 0;

		for (int i = 1; i < prices.length; i++) {

			if (prices[i - 1] < prices[i]) {
				profit = profit + prices[i] - prices[i - 1];
			}
		}

		return profit;

	}

}
