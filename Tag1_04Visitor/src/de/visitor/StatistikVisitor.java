package de.visitor;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor implements MitarbeiterVisitor{

    private int lohnCounter = 0, gehaltsCounter = 0;


    @Override
    public void init() {
        lohnCounter = gehaltsCounter = 0;
    }

    @Override
    public void visit(LohnEmpfaenger lohnEmpfaenger) {
        ++ lohnCounter;
    }

    @Override
    public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) {
        ++ gehaltsCounter;
    }

    @Override
    public void dispose() {
        System.out.println(toString());
    }

    public int getLohnCounter() {
        return lohnCounter;
    }

    public int getGehaltsCounter() {
        return gehaltsCounter;
    }

    public int getGesamtCounter() {
        return gehaltsCounter + lohnCounter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("lohnCounter=").append(lohnCounter);
        sb.append(", gehaltsCounter=").append(gehaltsCounter);
        sb.append(", gesamtCounter=").append(getGesamtCounter());
        sb.append('}');
        return sb.toString();
    }
}
