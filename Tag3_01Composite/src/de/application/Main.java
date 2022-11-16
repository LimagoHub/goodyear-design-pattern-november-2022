package de.application;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("Root");

        Node e1 = new Node("e1");
        root.appendChild(e1);

        Node e2 = new Node("e2");
        root.appendChild(e2);


        Node e1_1 = new Node("e1_1");
        e1.appendChild(e1_1);

        Node e1_2 = new Node("e1_2");
        e1.appendChild(e1_2);

        Node e2_1 = new Node("e2_1");
        e2.appendChild(e2_1);

        Node e2_2 = new Node("e2_2");
        e2.appendChild(e2_2);

        Leaf e1_1_1 = new Leaf("e1_1_1");
        e1_1.appendChild(e1_1_1);

        travers(root);
    }

    static void travers(AbstractNode node) {
        System.out.println(node);
        for (var child  : node.getChildren()) {
            travers(child);
        }
    }
}