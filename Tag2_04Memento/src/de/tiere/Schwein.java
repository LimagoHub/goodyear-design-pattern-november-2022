package de.tiere;

public class Schwein {

    private String name;
    private int gewicht;

    public Schwein() {
        this("nobody");
    }
    public Schwein(String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void fressen() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    public SchweineMemento getMemento() {
        return new MySchweineMemento(this.name, this.gewicht);
    }

    public void setMemento(SchweineMemento memento) {
        MySchweineMemento mySchweineMemento = (MySchweineMemento) memento;
        this.name = mySchweineMemento.getName();
        this.gewicht = mySchweineMemento.getGewicht();
    }

    private static class MySchweineMemento implements SchweineMemento {

      private final String name;
      private final int gewicht;

        public MySchweineMemento(String name, int gewicht) {
            this.name = name;
            this.gewicht = gewicht;
        }

        public String getName() {
            return name;
        }

        public int getGewicht() {
            return gewicht;
        }
    }
}
