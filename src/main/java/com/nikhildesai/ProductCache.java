package com.nikhildesai;

import java.util.HashMap;
import java.util.Map;

/**
 * Product calculator that caches results. The cache size is unbounded.
 *
 * Created by ndesai on 5/16/16.
 */
public class ProductCache {

    // Cache for storing product for a 'NumberPair' ... (x,y) => x * y
    private static Map<NumberPair, Double> products = new HashMap<>();

    /**
     * Returns product of two numbers and cache it if not already present in the cache
     *
     * @param x
     * @param y
     * @return x * y
     */
    public static Double getProduct(Double x, Double y) {
        NumberPair numberPair = new NumberPair(x,y);
        Double product = products.get(numberPair);
        if (product == null) {
            product = x.doubleValue() * y.doubleValue();
            products.put(numberPair, product);
        }
        return product;
    }

    public static int getCurrentCacheSize() {
        return products.size();
    }

    public static void reset() {
        products.clear();
    }

}
