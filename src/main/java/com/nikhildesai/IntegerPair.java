package com.nikhildesai;

/**
 * Created by ndesai on 5/16/16.
 */
public class IntegerPair {

    private final Double x;
    private final Double y;

    public IntegerPair(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntegerPair)) {
            return false;
        }

        // two IntegerPairs are equal if they are the same two numbers i.e. (a,b) = (b,a)
        return (this.x.equals(((IntegerPair) o).getX()) && this.y.equals(((IntegerPair) o).getY()))
                ||
                (this.y.equals(((IntegerPair) o).getX()) && this.x.equals(((IntegerPair) o).getY()));
    }

    @Override
    public int hashCode() {
        return x.hashCode() ^ y.hashCode();
    }
}
