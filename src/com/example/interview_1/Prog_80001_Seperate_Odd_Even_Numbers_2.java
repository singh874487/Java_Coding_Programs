package com.example.interview_1;
import java.util.*;
import java.util.stream.Collectors;

public class Prog_80001_Seperate_Odd_Even_Numbers_2 
{
    public static void main(String[] args) 
    {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        
        // Partition numbers into even and odd using Streams
        Map<Boolean, List<Integer>> oddEvenNumbersMap = 
            listOfIntegers.stream()
                          .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println("--------------");
        System.out.println("Even Numbers");
        System.out.println("--------------");
        oddEvenNumbersMap.get(true).forEach(System.out::println);

        System.out.println("--------------");
        System.out.println("Odd Numbers");
        System.out.println("--------------");
        oddEvenNumbersMap.get(false).forEach(System.out::println);
    }
}


/*


1. Avoid Using EntrySet for Boolean Key

Since partitioningBy() will always give two keys — true and false — we can access them directly

2. Use Enhanced ForEach with Lambda for Cleaner Code

Instead of writing a manual loop with System.out.println, you could make use of lambdas for printing the list.


*/