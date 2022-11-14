package de.visitor;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(LohnEmpfaenger lohnEmpfaenger) {
        // NOOP
    }

    @Override
    public void visit(GehaltsEmpfaenger gehaltsEmpfaenger) {
        // NOOP
    }
}
