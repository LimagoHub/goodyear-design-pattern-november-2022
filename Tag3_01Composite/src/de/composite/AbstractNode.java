package de.composite;

import java.util.Collections;
import java.util.List;

public abstract class AbstractNode {

    private String label;
    private AbstractNode parent;

    public AbstractNode(String label) {
        this.label = label;
        this.parent = null;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AbstractNode getParent() {
        return parent;
    }

    public void setParent(AbstractNode parent) {
        this.parent = parent;
    }

    public List<AbstractNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( this.getClass().getSimpleName() + "{");
        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
