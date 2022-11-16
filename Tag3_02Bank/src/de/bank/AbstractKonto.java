package de.bank;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractKonto {

    private String label;
    private AbstractKonto parent;

    public AbstractKonto(String label) {
        this.label = label;
        this.parent = null;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AbstractKonto getParent() {
        return parent;
    }

    public void setParent(AbstractKonto parent) {
        this.parent = parent;
    }

    public List<AbstractKonto> getChildren() {
        return Collections.emptyList();
    }

    public void print() {
       for(var it = iterator();it.hasNext();) {
           System.out.println(it.next());
       }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( this.getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Iterator<AbstractKonto> iterator() {
        final List<AbstractKonto> abstractKontos = new ArrayList<>();
        iteratorImpl(abstractKontos);
        return abstractKontos.iterator();
    }

    private void iteratorImpl(final List<AbstractKonto> listToFill) {
        listToFill.add(this);
        getChildren().forEach(child->child.iteratorImpl(listToFill));
    }
}
