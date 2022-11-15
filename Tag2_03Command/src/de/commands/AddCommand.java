package de.commands;

import de.math.Calculator;

public class AddCommand implements Command{

    private double summand;
    @Override
    public void parse(String[] tokens) {
        summand = Double.parseDouble(tokens[1]);
    }

    @Override
    public void execute() {
        Calculator.getInstance().add(summand);
    }

    @Override
    public void undo() {
        Calculator.getInstance().sub(summand);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
