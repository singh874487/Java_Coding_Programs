package com.example.one;
 


import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

    public static void main(String[] args) {
        String s = "ABC"; // Input string
        Set<String> permutations = new HashSet<>();
        generatePermutations("", s, permutations);
        // Print all unique permutations
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    /**
     * Recursively generates all permutations of a string.
     *
     * @param prefix    The prefix of the permutation being built.
     * @param remaining The remaining characters to permute.
     * @param result    A set to store unique permutations.
     */
    public static void generatePermutations(String prefix, String remaining, Set<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutations(newPrefix, newRemaining, result);
            }
        }
    }
}
