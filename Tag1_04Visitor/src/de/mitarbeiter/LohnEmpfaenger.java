package de.mitarbeiter;

import de.visitor.MitarbeiterVisitor;

public class LohnEmpfaenger extends AbstractMitarbeiter{

    private double stundenlohn, arbeitszeit;

    public LohnEmpfaenger(String name) {
        super(name);
    }

    public LohnEmpfaenger(String name, double stundenlohn, double arbeitszeit) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.arbeitszeit = arbeitszeit;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getArbeitszeit() {
        return arbeitszeit;
    }

    public void setArbeitszeit(double arbeitszeit) {
        this.arbeitszeit = arbeitszeit;
    }

    @Override
    public String toString() {

        return super.toString() + ", Stundenlohn=" + getStundenlohn() + ", Arbeitszeit=" + getArbeitszeit();
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }
}
