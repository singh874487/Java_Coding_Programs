package com.interview.Java8.flatmap;

// 1. Flattening a List of Lists

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample_1 {
    public static void main(String[] args) {
    	
        // List of lists
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("apple", "banana"),
            Arrays.asList("cherry", "date"),
            Arrays.asList("elderberry", "fig", "grape")
        );
        

        // Flatten the list of lists into a single list using flatMap
        List<String> flattenedList = listOfLists.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

        // Print the flattened list
        System.out.println(flattenedList);
    }
}

/*


Output:
 
[apple, banana, cherry, date, elderberry, fig, grape]
		
Explanation:

listOfLists.stream() creates a stream of lists.
flatMap(List::stream) transforms each list into a stream, and then flattens these streams into a single stream.
collect(Collectors.toList()) collects the elements into a single list.



*/




/*

flatMap in Java Streams is used to transform each element of the stream into a new stream, 
and then flatten those streams into a single stream. This is particularly useful when dealing with collections of collections, 
such as a list of lists, where you want to process all elements in a flattened manner.


*/




/*
 
 
Time Complexity:

listOfLists.stream(): Creating a stream from the list of lists takes O(m) time, where m is the number of lists.
flatMap(List::stream): For each list, a stream is created and flattened. If n is the total number of elements across all lists, 
then this operation will take O(n) time in total.
collect(Collectors.toList()): Collecting the flattened elements into a list takes O(n) time.

Total Time Complexity: O(n)

n is the total number of elements across all lists.


Space Complexity:

Intermediate Streams: The flatMap operation creates intermediate streams, but these are processed lazily and do not add significant space overhead beyond the original data.
Result Storage: The resulting flattened list requires O(n) space to store all elements.

Total Space Complexity: O(n)


 
 */



