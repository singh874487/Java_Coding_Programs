package com.arjun.java.java8.flatmap;

/* 
 
2. Splitting Strings and Flattening:

Consider a list of sentences, where each sentence is a single string. 
we want to split each sentence into words and create a single stream of all words.

*/

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample_2 {
    public static void main(String[] args) {
    	
        // List of sentences
        List<String> sentences = Arrays.asList(
            "Hello world",
            "FlatMap in Java Streams",
            "is very powerful"
        );

        // Split each sentence into words and flatten into a single list
        List<String> words = sentences.stream()
            .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
            .collect(Collectors.toList());

        // Print the list of words
        System.out.println(words);
    }
}



/* 
 
Output:
 
[Hello, world, FlatMap, in, Java, Streams, is, very, powerful]


Explanation:

sentences.stream() creates a stream of sentences.
flatMap(sentence -> Arrays.stream(sentence.split(" "))) splits each sentence into words and flattens these streams of words into a single stream.
collect(Collectors.toList()) collects the words into a list.

*/



/*
 
Time Complexity:

sentences.stream(): Creating a stream from the list of sentences takes O(k) time, where k is the number of sentences.
flatMap(sentence -> Arrays.stream(sentence.split(" "))):
For each sentence, the split(" ") method is called. If w is the number of words in a sentence, then split(" ") takes O(w) time.
Across all sentences, if n is the total number of words, this operation will take O(n) time.
collect(Collectors.toList()): Collecting the words into a list takes O(n) time.

Total Time Complexity: O(n)

n is the total number of words across all sentences.


Space Complexity:

Intermediate Streams: The flatMap operation produces intermediate streams, but these are processed lazily.
String Splitting: The split(" ") method creates an array of words, requiring O(w) space for each sentence. 
Across all sentences, this contributes O(n) space.
Result Storage: The resulting list of words requires O(n) space.

Total Space Complexity: O(n)
 
 */
