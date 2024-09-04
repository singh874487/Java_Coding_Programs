package com.interview.asked;

//merge and sort two arrays without using predefined sorting methods in Java

public class Program_3_MergeSortExample {

    // Method to merge two sorted arrays
    private static int[] mergeArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
        
        while (i < a.length) {
            merged[k++] = a[i++];
        }
        
        while (j < b.length) {
            merged[k++] = b[j++];
        }
        
        return merged;
    }

    // Merge Sort implementation
    private static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    // Method to merge two sorted arrays into one
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 1, 9, 2};
        int[] b = {5, 7, 3, 8};

        // Merge the two arrays
        int[] mergedArray = mergeArrays(a, b);

        // Sort the merged array using Merge Sort
        mergeSort(mergedArray);

        // Print the sorted array
        System.out.print("Sorted merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}