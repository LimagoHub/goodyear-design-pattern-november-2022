package de.visitor;

import de.mitarbeiter.GehaltsEmpfaenger;
import de.mitarbeiter.LohnEmpfaenger;

public interface MitarbeiterVisitor {

    void visit(LohnEmpfaenger lohnEmpfaenger);
    void visit(GehaltsEmpfaenger gehaltsEmpfaenger);
}
