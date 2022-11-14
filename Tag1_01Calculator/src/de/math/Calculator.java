package de.math;

import de.math.inner.CalculatorImpl;
import de.math.inner.CalculatorLogger;
import de.math.inner.CalculatorSecure;

public interface Calculator {
    double add(double a, double b);

    double sub(double a, double b);

//    static Calculator create() {
//        Calculator calculator = new CalculatorImpl();
//        calculator = new CalculatorLogger(calculator);
//        return new CalculatorSecure(calculator);
//    }
}
