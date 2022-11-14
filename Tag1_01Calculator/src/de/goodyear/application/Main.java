package de.goodyear.application;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.inner.CalculatorImpl;
import de.math.inner.CalculatorLogger;
import de.math.inner.CalculatorSecure;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        calculator = new CalculatorLogger(calculator);
        calculator = new CalculatorSecure(calculator);
        CalcClient client = new CalcClient(calculator);
        client.go();
    }
}