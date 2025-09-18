package com.interview.asked;
import java.util.ArrayList;
import java.util.List;

public class Program_5_MergeIntervals_Array {

    // Method to sort intervals manually using Bubble Sort
    private static void bubbleSort(int[][] intervals) {
        int n = intervals.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intervals[j][0] > intervals[j + 1][0]) {
                    // Swap intervals[j] and intervals[j + 1]
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }
    }

    // Method to merge intervals
    public static List<int[]> mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new ArrayList<>();
        }

        // Sort intervals by their start time using bubble sort
        bubbleSort(intervals);

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            // If the current interval overlaps with the next interval, merge them
            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // If they do not overlap, add the next interval to the list and update current interval
                currentInterval = nextInterval;
                merged.add(currentInterval);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {11, 34} };
        List<int[]> mergedIntervals = mergeIntervals(intervals);

        // Print the result
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}