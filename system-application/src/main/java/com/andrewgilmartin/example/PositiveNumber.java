package com.andrewgilmartin.example;

/**
 * Simple immutable positive values.
 */
public class PositiveNumber implements Comparable<PositiveNumber> {

    private int value;

    /**
     * Initialize the positive instance with the given integer. Throws
     * IllegalArgumentException if the given integer is negative.
     */
    public PositiveNumber(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("invalid negative value " + value);
        }
        this.value = value;
    }

    /**
     * Add the given value returning a new positive instance.
     */
    public PositiveNumber add(PositiveNumber other) {
        return new PositiveNumber(this.value + other.value);
    }

    /**
     * Subtract the given value returning a new positive instance.
     */
    public PositiveNumber sub(PositiveNumber other) {
        return new PositiveNumber(this.value - other.value);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(PositiveNumber other) {
        return this.value - other.value;
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.value;
        return hash;
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PositiveNumber other = (PositiveNumber) obj;
        if (this.value != other.value) {
            return false;
        }
        return true;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
