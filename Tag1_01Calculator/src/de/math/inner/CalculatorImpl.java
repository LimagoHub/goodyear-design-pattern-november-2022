package de.math.inner;

import de.math.Calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public double add(double a, double b) {
       return a + b;
    }
    @Override
    public double sub(double a, double b) {
        return add(a, -b);
    }
}
