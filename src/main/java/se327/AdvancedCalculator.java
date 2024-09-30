package se327;

public class AdvancedCalculator {
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(int a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
}
