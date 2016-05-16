package com.nikhildesai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");

            // read input
            Integer n = readInput(scanner);
            if (n == null) {
                continue;
            }

            List<Double> numbers = new ArrayList<>();
            numbers.add(1d);
            // get all primes between 1 and n
            numbers.addAll(PrimeUtils.getPrimes(n));

            // format and print a table
            for (Double x : numbers) {
                for (Double y : numbers) {
                    // get product of x and y
                    Double product = ProductCache.getProduct(x, y);

                    // pretty formatting
                    if (product == 1) {
                        System.out.print("      ");
                        continue;
                    }
                    System.out.format("%5.0f ", product);
                }
                System.out.println('\n');
            }
        }
    }

    private static Integer readInput(Scanner scanner) {
        // read input
        String input = scanner.next();
        Integer n;
        try {
            n = Integer.valueOf(input);
        } catch(NumberFormatException e) {
            System.out.println("Invalid number. Please enter a positive number");
            return null;
        }

        if (n <= 0 || n > Integer.MAX_VALUE) {
            System.out.println("Please enter a positive number between 1 and " + Integer.MAX_VALUE);
            return null;
        }

        return n;
    }
}
