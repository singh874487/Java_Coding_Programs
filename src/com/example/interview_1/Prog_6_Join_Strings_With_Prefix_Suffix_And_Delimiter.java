package com.example.interview_1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Prog_6_Join_Strings_With_Prefix_Suffix_And_Delimiter 
{
    public static void main(String[] args) 
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
         
        String joinedString = listOfStrings.stream()
        									.collect(Collectors.joining(", ", "[", "]"));
         
        System.out.println(joinedString);
    }
}