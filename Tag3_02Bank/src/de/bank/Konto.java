package de.bank;

public class Konto extends AbstractKonto{

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Konto(String label) {
        super(label);
    }

    @Override
    public String toString() {
        return super.toString() + ", Saldo = " + getSaldo();
    }
}