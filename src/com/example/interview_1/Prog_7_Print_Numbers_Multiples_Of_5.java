package com.example.interview_1;
import java.util.Arrays;
import java.util.List;


public class Prog_7_Print_Numbers_Multiples_Of_5 
{
    public static void main(String[] args) 
    {
    	List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        listOfIntegers.stream()
        			  .filter(i -> i % 5 == 0)
        			  .forEach(System.out::println);
    
    }
}