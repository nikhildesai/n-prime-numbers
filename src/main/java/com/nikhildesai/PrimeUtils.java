package com.nikhildesai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ndesai on 5/16/16.
 */
public class PrimeUtils {
    public static final double MAX_NO_OF_PRIMES_SUPPORTED = 10000;
    public static final double MAX_VALUE_OF_PRIME_SUPPORTED = 104729; // 10000th prime

    /**
     * Get first n primes. Support up to first MAX_PRIMES_SUPPORTED prime numbers
     * @param n
     * @return List<Double> of prime numbers of size n
     */
    public static List<Double> getPrimes(int n) {
        if (n <= 0 || n > MAX_NO_OF_PRIMES_SUPPORTED) {
            throw new IllegalArgumentException("Invalid value of n");
        }

        List<Double> primes = new ArrayList<>();

        int count = 0;
        Integer i=2;

        while (count < n) {
            if (PrimeUtils.isPrime(i)) {
                count++;
                primes.add(i.doubleValue());
            }
            i++;
        }

        return primes;
    }

    /**
     * Is the given number prime?
     * @param n
     * @return true if the number is prime
     */
    public static boolean isPrime(int n) {
        if (n <= 0 || n > MAX_VALUE_OF_PRIME_SUPPORTED) {
            throw new IllegalArgumentException("Invalid value of n");
        }

        if (n == 1) {
            return false;
        }

        // if the number is divisible by any number between 1 and sqrt(n) then it is not prime.
        // More efficient than trying to divide by all numbers between 1 and n
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
