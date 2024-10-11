package com.interview.asked;
import java.util.Arrays;
import java.util.List;

public class Program_12_ParallelStreamSumExample {
	
    public static void main(String[] args) {
    	
        // Sample list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate sum using parallelStream and reduce
        int sum = list.parallelStream().reduce(0, Integer::sum);

        // Print the result
        System.out.println("Sum: " + sum);
        
        
        
        // Sample list of integers
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        int sum2 = list2.parallelStream().reduce(0, (a,b)->a+b);

        // Print the result
        System.out.println("\nSum2: " + sum2);
        
        
    }
}



/*  

the code will calculate the sum of these numbers:

Parallel streams will split the computation across available cores (if possible).

The reduce() method will sum the numbers to give 10.

*/