package de.math;

public class Calculator {

    private static  final Calculator instance = new Calculator();

    public static Calculator getInstance() {
        return instance;
    }

    private double memory = 0;


    private Calculator() {
    }

    public void add(double value) {
        memory += value;
    }
    public void sub(double value) {
        memory -= value;
    }
    public void mult(double value) {
        memory *= value;
    }
    public void div(double value) {
        memory /= value;
    }

    public void clear() {
        memory = 0;
    }

    public void print() {
        System.out.println(memory);
    }



    public CalculatorMemento getMemento() {
        return new MyCalculatorMemento(memory);
    }

    public void setMemento(CalculatorMemento memento) {
        this.memory = ((MyCalculatorMemento) memento).getMemory();
    }

    static class MyCalculatorMemento implements CalculatorMemento {
        private final double memory;

        public MyCalculatorMemento(final double memory) {
            this.memory = memory;
        }

        public double getMemory() {
            return memory;
        }
    }
}
