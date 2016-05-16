package com.nikhildesai;

/**
 * Created by ndesai on 5/16/16.
 */
public class NumberPair {

    private final Double x;
    private final Double y;

    public NumberPair(Double x, Double y) {
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
        if (!(o instanceof NumberPair)) {
            return false;
        }

        // two NumberPairs are equal if they are the same two numbers i.e. (a,b) = (b,a)
        return (this.x.equals(((NumberPair) o).getX()) && this.y.equals(((NumberPair) o).getY()))
                ||
                (this.y.equals(((NumberPair) o).getX()) && this.x.equals(((NumberPair) o).getY()));
    }

    @Override
    public int hashCode() {
        return x.hashCode() ^ y.hashCode();
    }
}
