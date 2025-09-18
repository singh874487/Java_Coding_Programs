package com.interview.asked;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Program_10_15th_PrimeNumber_1 {

    public static void main(String[] args) {
    	
        OptionalInt fifteenthPrime = IntStream.range(2, 100) // Start from 2, as it's the first prime
            .filter(Program_10_15th_PrimeNumber_1::isPrime) // Filter for prime numbers
            .limit(15) // Limit to the first 15 primes
            .skip(14) // Skip the first 14 primes
            .findFirst(); // Get the 15th prime

        // Check if the value is present and print it
        if (fifteenthPrime.isPresent()) {
            System.out.println(fifteenthPrime.getAsInt());
        } else {
            System.out.println("No 15th prime found.");
        }
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
