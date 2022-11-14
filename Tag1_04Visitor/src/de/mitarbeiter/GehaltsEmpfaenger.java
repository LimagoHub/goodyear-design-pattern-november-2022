package de.mitarbeiter;

import de.visitor.MitarbeiterVisitor;

public class GehaltsEmpfaenger extends  AbstractMitarbeiter{

    private double gehalt;

    public GehaltsEmpfaenger(String name) {
        super(name);
    }

    public GehaltsEmpfaenger(String name, double gehalt) {
        super(name);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {

        return super.toString() + ", Gehalt=" + getGehalt();
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
