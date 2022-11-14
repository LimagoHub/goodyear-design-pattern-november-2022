package de.business.state;

public class AbstractState implements State{

    private final Front front;

    public AbstractState(Front front) {
        this.front = front;
    }

    public Front getFront() {
        return front;
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Methode macht in diesem Zustand keinen Sinn");
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Methode macht in diesem Zustand keinen Sinn");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Methode macht in diesem Zustand keinen Sinn");
    }


}
