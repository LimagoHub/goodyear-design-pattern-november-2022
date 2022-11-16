package de.bank;



import java.util.Collections;
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
        System.out.println(this);
        for (var child : getChildren()) {
            child.print();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( this.getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
