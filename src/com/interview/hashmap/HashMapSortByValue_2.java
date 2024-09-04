package com.interview.hashmap;
import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortByValue_2 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 40);
        map.put("banana", 10);
        map.put("cherry", 30);
        map.put("date", 20);

        // Sort the map by values using streams
        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
	            .stream()
	            .sorted(Map.Entry.comparingByValue())
	            .collect(Collectors.toMap(
	                Map.Entry::getKey,
	                Map.Entry::getValue,
	                (e1, e2) -> e1, // If there are duplicate keys, keep the existing key
	                LinkedHashMap::new // Collect into a LinkedHashMap to preserve the order
	            ));

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}




/*

Explanation:

Step 1: map.entrySet().stream() converts the HashMap's entry set into a stream.
Step 2: .sorted(Map.Entry.comparingByValue()) sorts the stream based on the values.
Step 3: .collect(Collectors.toMap(...)) collects the sorted entries into a LinkedHashMap:
Map.Entry::getKey and Map.Entry::getValue extract the keys and values from the entries.
(e1, e2) -> e1 is used to handle any duplicate keys (though duplicates shouldn't occur in this context).
LinkedHashMap::new specifies that the sorted entries should be collected into a LinkedHashMap, which maintains the insertion order.
The output of this code will be:

makefile
Copy code
banana: 10
date: 20
cherry: 30
apple: 40


*/


/*

Let's analyze the time and space complexity for both approaches: 
using traditional sorting with Collections.sort() and using Java Streams.


2. Using Java Streams

Time Complexity:

Converting the HashMap to a stream of entries: This operation takes O(1) time since it’s just a view on the map’s entry set.
Sorting the stream of entries: Sorting with streams also uses a comparison sort (like Timsort), which has a time complexity of O(n log n).
Collecting into a LinkedHashMap: This operation iterates over the sorted stream, which takes O(n) time.
Total Time Complexity:

The overall time complexity is O(n log n), dominated by the sorting step.

Space Complexity:

Space for the stream operations: Streams are processed in a lazy manner, so no extra space is required for the stream itself. However, the sorting operation still requires O(n) space for the intermediate sorted list.
Space for the LinkedHashMap: Storing the sorted entries takes O(n) space.
Total Space Complexity:

The overall space complexity is O(n), considering the space for storing the sorted entries in the LinkedHashMap.


Summary

Time Complexity: Both approaches have a time complexity of O(n log n).
Space Complexity: Both approaches have a space complexity of O(n).
The choice between the two approaches should primarily depend on code readability and whether you prefer the traditional style or the more functional style provided by streams. The performance differences are negligible in most cases.

*/