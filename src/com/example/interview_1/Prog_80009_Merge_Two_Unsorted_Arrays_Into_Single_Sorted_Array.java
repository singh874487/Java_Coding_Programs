package com.example.interview_1;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Prog_80009_Merge_Two_Unsorted_Arrays_Into_Single_Sorted_Array 
{
    public static void main(String[] args) 
    {
    	int[] a = new int[] {4, 4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};
         
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        				   .sorted()
        				   .toArray();
         
        System.out.println(Arrays.toString(c));
    
    }
}