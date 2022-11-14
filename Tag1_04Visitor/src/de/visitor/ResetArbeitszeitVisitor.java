package de.visitor;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(LohnEmpfaenger lohnEmpfaenger) {
        lohnEmpfaenger.setArbeitszeit(0);
    }

}
