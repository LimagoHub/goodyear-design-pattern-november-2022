package de.processors;

public abstract class AbstractCounter extends FileProcessor{

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.println(this.getClass().getSimpleName() + ": counter = " + counter);
    }

    protected void incrementCounter() {
        counter ++;
    }
}
