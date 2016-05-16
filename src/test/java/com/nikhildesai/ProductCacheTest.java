package com.nikhildesai;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ndesai on 5/16/16.
 */
public class ProductCacheTest {

    @Test
    public void testCacheReset() {
        ProductCache.reset();
        Assert.assertEquals("Product cache should be empty",
                0, ProductCache.getCurrentCacheSize());
    }

    @Test
    public void testCacheMiss() {
        ProductCache.reset();
        Assert.assertEquals("Verify that product cache is empty",
                0, ProductCache.getCurrentCacheSize());
        ProductCache.getProduct(1d, 2d);
        Assert.assertEquals("Product should be cached",
                1, ProductCache.getCurrentCacheSize());
    }

    @Test
    public void testCacheHit() {
        ProductCache.reset();
        Double product1 = ProductCache.getProduct(1d, 2d);
        Double product2 = ProductCache.getProduct(1d, 2d);
        Assert.assertEquals("Products should match", product1, product2);
        Assert.assertEquals("Product should be returned from cache",
                1, ProductCache.getCurrentCacheSize());
    }

//    @Test
//    public void testProductExceedsMaxInteger() {
//        ProductCache.reset();
//        int product = ProductCache.getProduct(Integer.MAX_VALUE, Integer.MAX_VALUE);
//        System.out.println(product);
//        Assert.assertEquals("Product should be cached",
//                1, ProductCache.getCurrentCacheSize());
//    }
}
