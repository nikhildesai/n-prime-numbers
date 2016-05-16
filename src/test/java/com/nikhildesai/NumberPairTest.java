package com.nikhildesai;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ndesai on 5/16/16.
 */
public class NumberPairTest {

    @Test
    public void testNumberPairEqual() {
        Assert.assertEquals(new NumberPair(1d, 2d), new NumberPair(1d, 2d));
        Assert.assertEquals(new NumberPair(1d, 2d), new NumberPair(2d, 1d));
    }

    @Test
    public void testNumberPairNotEqual() {
        Assert.assertNotEquals(new NumberPair(1d, 1d), new NumberPair(1d, 2d));
        Assert.assertNotEquals(new NumberPair(2d, 1d), new NumberPair(1d, 1d));
    }
}
