package de.visitor;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public class PrintVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(LohnEmpfaenger lohnEmpfaenger) {
        print(lohnEmpfaenger);
    }

    @Override
    public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) {
        print(gehaltsEmpfaenger);
    }

    private void print(AbstractMitarbeiter mitarbeiter) {
        System.out.println(mitarbeiter);
    }
}
