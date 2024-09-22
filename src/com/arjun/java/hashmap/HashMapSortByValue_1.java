package com.arjun.java.hashmap;
import java.util.*;

public class HashMapSortByValue_1 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 40);
        map.put("banana", 10);
        map.put("cherry", 30);
        map.put("date", 20);

        // Convert the entry set to a list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list with a custom comparator that compares the values
        Collections.sort(list, (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        // Create a LinkedHashMap to maintain insertion order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


/*


Explanation:

Step 1: The HashMap is created and populated with some data.
Step 2: The entrySet() method is used to get a set view of the map's entries, and then it is converted to a list.
Step 3: The Collections.sort() method is used with a custom comparator to sort the list by values.
Step 4: A LinkedHashMap is used to store the sorted entries because it maintains the order of insertion.
Step 5: Finally, the sorted map is printed.
This code will output the entries of the HashMap sorted by their values:

makefile
Copy code
banana: 10
date: 20
cherry: 30
apple: 40


*/



/*


Let's analyze the time and space complexity for both approaches: using traditional sorting with Collections.sort() and using Java Streams.

1. Using Collections.sort()

Time Complexity:

Converting the HashMap to a list of entries: This operation takes O(n) time.
Sorting the list of entries: The sorting operation (using Collections.sort()) is based on a comparison sort algorithm, 
typically Timsort in Java, which has a time complexity of O(n log n).
Creating the LinkedHashMap from the sorted list: Inserting n elements into a LinkedHashMap takes O(n) time.

Total Time Complexity:
The overall time complexity is O(n log n) because the sorting step dominates.

Space Complexity:

Space for the list of entries: This takes O(n) space.
Space for the LinkedHashMap: This also takes O(n) space to store the sorted entries.
Total Space Complexity:

The overall space complexity is O(n) because we are storing the sorted entries in a new data structure (LinkedHashMap).



*/