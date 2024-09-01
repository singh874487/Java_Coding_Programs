package com.interview.Java8.flatmap;

/*
 
 3. Mapping and Flattening Complex Objects:
 
Suppose we have a list of objects, and each object has a list of properties (e.g., Person has a list of PhoneNumbers). 
we want to get a list of all phone numbers.
 
*/

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private List<String> phoneNumbers;

    public Person(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}

public class FlatMapExample_3 {
    public static void main(String[] args) {
    	
        // Create a list of persons
        List<Person> persons = Arrays.asList(
            new Person("John", Arrays.asList("123", "456")),
            new Person("Jane", Arrays.asList("789")),
            new Person("Doe", Arrays.asList("101", "112", "113"))
        );

        // Flatten the list of phone numbers from all persons
        List<String> phoneNumbers = persons.stream()
            .flatMap(person -> person.getPhoneNumbers().stream())
            .collect(Collectors.toList());

        // Print the list of phone numbers
        System.out.println(phoneNumbers);
    }
}



/*


Output:

[123, 456, 789, 101, 112, 113]

Explanation:

persons.stream() creates a stream of Person objects.
flatMap(person -> person.getPhoneNumbers().stream()) converts each person's list of phone numbers into a stream and
flattens these streams into a single stream.
collect(Collectors.toList()) collects the phone numbers into a list.


Summary:

flatMap is useful when you need to flatten a structure of streams, such as a list of lists or when dealing with complex objects where each object holds a collection that you want to process as a single stream.
It is a powerful tool in Java Streams for simplifying data processing pipelines and reducing nested loops.

*/



/*

Time Complexity:

persons.stream(): Creating a stream from the list of Person objects takes O(p) time, where p is the number of Person objects.
flatMap(person -> person.getPhoneNumbers().stream()):
For each Person object, getPhoneNumbers().stream() is called, which takes O(q) time for each person, where q is the number of phone numbers that person has.
Across all persons, if n is the total number of phone numbers, this operation will take O(n) time.
collect(Collectors.toList()): Collecting the phone numbers into a list takes O(n) time.

Total Time Complexity: O(n)

n is the total number of phone numbers across all persons.


Space Complexity:

Intermediate Streams: The flatMap operation produces intermediate streams, processed lazily without significant space overhead.
Result Storage: The resulting list of phone numbers requires O(n) space.

Total Space Complexity: O(n)



Summary

For all examples:

Time Complexity: O(n), where n represents the total number of elements (list items, words, or phone numbers) processed and collected in the final list.
Space Complexity: O(n), where n represents the space required to store the flattened results in the final list.

These complexities reflect the linear relationship between the number of elements processed and the work required to flatten and collect them into a single list.

*/