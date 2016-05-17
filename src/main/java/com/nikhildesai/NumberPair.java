package com.nikhildesai;

/**
 * A pair of numbers {x,y}.
 *
 * Two NumberPairs {x1,y1}, {x2,y2} are equal if
 * (x1 = x2 and y1 = y2) OR (x1 = y2 and x2=y1)
 *
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
