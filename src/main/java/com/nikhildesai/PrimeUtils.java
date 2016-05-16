package com.nikhildesai;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ndesai on 5/16/16.
 */
public class PrimeUtils {

    /**
     * Get primes from 1 to n
     * @param n
     * @return List<Double> of prime numbers between 1 and n
     */
    public static List<Double> getPrimes(int n) {
        validateInput(n);

        List<Double> primes = new ArrayList<>();

        // find all primes from 1 to n
        for (Integer i=1; i <= n; i++) {
            if (PrimeUtils.isPrime(i)) {
                primes.add(i.doubleValue());
            }
        }

        return primes;
    }

    /**
     * Is the given number prime.
     * @param n
     * @return true if the number is prime
     */
    public static boolean isPrime(int n) {
        validateInput(n);

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

    private static void validateInput(int n) {
        if (n <= 0 || n > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Invalid value of n");
        }
    }
}
