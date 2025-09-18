package com.interview.asked;
import java.util.stream.IntStream;

public class Program_10_15th_PrimeNumber_2 {

    public static void main(String[] args) {
    	int n = 250; // We want the 250th prime number

        int nthPrime = IntStream.iterate(2, i -> i + 1) // Generate an infinite stream of integers starting from 2
            .filter(Program_10_15th_PrimeNumber_2::isPrime) // Filter for prime numbers
            .limit(n) // Limit to the first n prime numbers
            .reduce((first, second) -> second) // Get the last element, which is the nth prime
            .orElseThrow(() -> new RuntimeException("No prime found")); // Handle case where no prime is found

        // Output the nth prime number
        System.out.println("The " + n + "th prime number is: " + nthPrime);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not a prime
            }
        }
        return true; // Is a prime
    }
}
