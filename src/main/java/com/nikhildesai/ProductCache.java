package com.nikhildesai;

import java.util.HashMap;
import java.util.Map;

/**
 * Product calculator that caches results. The cache size is unbounded.
 *
 * Created by ndesai on 5/16/16.
 */
public class ProductCache {

    // Product Cache for storing product an 'IntegerPair' ... (x,y) => x * y
    private static Map<IntegerPair, Double> products = new HashMap<>();

    /**
     * Returns product of two integers and caches it if not already present in the cache
     *
     * @param x
     * @param y
     * @return x * y
     */
    public static Double getProduct(Double x, Double y) {
        IntegerPair integerPair = new IntegerPair(x,y);
        Double product = products.get(integerPair);
        if (product == null) {
            product = x.doubleValue() * y.doubleValue();
            products.put(integerPair, product);
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
