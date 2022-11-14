package de.firma;

import de.mitarbeiter.AbstractMitarbeiter;
import de.visitor.MitarbeiterVisitor;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

    public boolean add(AbstractMitarbeiter abstractMitarbeiter) {
        return mitarbeiters.add(abstractMitarbeiter);
    }

    public boolean remove(AbstractMitarbeiter o) {
        return mitarbeiters.remove(o);
    }

    public void print() {
        mitarbeiters.forEach(System.out::println);
    }

    public void iterate(MitarbeiterVisitor visitor) {
        visitor.init();
        for (var mitarbeiter: mitarbeiters) {
           //visitor.visit(mitarbeiter);
            mitarbeiter.accept(visitor);
        }
        visitor.dispose();
    }
}
