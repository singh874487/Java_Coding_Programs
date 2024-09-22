package com.arjun.java.java8.flatmap;

/*

5. Extracting Characters from Strings
Suppose we have a list of strings, and we want to create a list of all individual characters.

*/

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample_5 {
    public static void main(String[] args) {
        // List of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Flatten the strings into a list of characters
        List<Character> characters = words.stream()
            .flatMap(word -> word.chars().mapToObj(c -> (char) c))
            .collect(Collectors.toList());

        // Print the list of characters
        System.out.println(characters);
    }
}



/*

Output:


[a, p, p, l, e, b, a, n, a, n, a, c, h, e, r, r, y]


Explanation:

word.chars() returns an IntStream of ASCII values for each character in the string.
mapToObj(c -> (char) c) converts these ASCII values back to Character objects.
flatMap flattens the characters from all words into a single stream.

*/