package com.interview.hashmap;
import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortByValue_3 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 40);
        map.put("banana", 10);
        map.put("cherry", 30);
        map.put("date", 20);

        // Sort the map by values using streams with Comparator
        Map<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Comparator.comparingInt(Map.Entry::getValue))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, // Merge function in case of duplicates (not likely here)
                LinkedHashMap::new // Collecting into a LinkedHashMap to maintain order
            ));

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}



/*

Explanation:

Stream the Entry Set:
map.entrySet().stream() converts the HashMap's entry set into a stream.

Sort Using a Comparator:
sorted(Comparator.comparingInt(Map.Entry::getValue)) sorts the stream based on the values.

comparingInt(Map.Entry::getValue) is a concise way to sort the entries by their values using Comparator. It’s specifically optimized for int values.
Collecting the Result:
collect(Collectors.toMap(...)) collects the sorted entries into a LinkedHashMap:

Map.Entry::getKey and Map.Entry::getValue extract the keys and values from the entries.
(e1, e2) -> e1 handles any potential key collisions (though this isn't likely here).
LinkedHashMap::new ensures the entries are stored in insertion order, preserving the sort order.
Output:
The output of the program will be:

makefile
Copy code
banana: 10
date: 20
cherry: 30
apple: 40

*/




/*

Alternative Stream Sorting Explanation:

Using Comparator.comparingInt: This method is particularly useful when dealing with int values. It provides a more type-safe way to compare int values directly, eliminating the need for unnecessary boxing and unboxing operations that might occur with Comparator.comparing.
This alternative approach still has the same time and space complexity as the previous one:

Time Complexity: O(n log n)
Space Complexity: O(n)

*/
