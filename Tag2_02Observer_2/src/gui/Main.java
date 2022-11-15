package gui;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {

    public Main() {
        setSize(300,300);
        Button button = new Button("Drück mich");
        button.addActionListener(e->beenden());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               beenden();
            }
        });
        add(button);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }

    private void beenden() {
        System.out.println("Daten werdn gespeichert");
        dispose();
    }
}