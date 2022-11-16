package de.bank;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractKonto{

    private List<AbstractKonto> children = new ArrayList<>();

    public KontoGruppe(String label) {
        super(label);
    }

    @Override
    public List<AbstractKonto> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(AbstractKonto child) {
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(AbstractKonto child) {
        child.setParent(null);
        children.remove(child);
    }
}