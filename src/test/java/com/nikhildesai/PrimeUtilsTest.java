package com.nikhildesai;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by ndesai on 5/16/16.
 */
public class PrimeUtilsTest {

    @Test
    public void testIsPrime() {
        Assert.assertTrue(PrimeUtils.isPrime(2));
        Assert.assertTrue(PrimeUtils.isPrime(3));
        Assert.assertTrue(PrimeUtils.isPrime(5));
        Assert.assertTrue(PrimeUtils.isPrime(7));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPrimeInvalidInputLessThanZero() {
        PrimeUtils.isPrime(-1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPrimeInvalidInputGreaterThanLimit() {
        PrimeUtils.isPrime(104730);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPrimeInvalidInputZero() {
        PrimeUtils.isPrime(0);
    }

    @Test
    public void testIsPrimeFalse() {
        Assert.assertFalse(PrimeUtils.isPrime(1));
        Assert.assertFalse(PrimeUtils.isPrime(4));
    }

    @Test
    public void testGetPrimes() {
        List<Double> primes = PrimeUtils.getPrimes(4);
        Assert.assertTrue(primes.contains(2d));
        Assert.assertTrue(primes.contains(3d));
        Assert.assertTrue(primes.contains(5d));
        Assert.assertTrue(primes.contains(7d));
        Assert.assertEquals("Size match", 4, primes.size());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetPrimesInvalidInputZero() {
        PrimeUtils.getPrimes(0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetPrimesInvalidInputNegative() {
        PrimeUtils.getPrimes(-4);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetPrimesInvalidInputGreaterThan10000() {
        PrimeUtils.getPrimes(10001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetPrimesInvalidInputGreaterThanMax() {
        PrimeUtils.getPrimes(Integer.MAX_VALUE + 1);
    }
}