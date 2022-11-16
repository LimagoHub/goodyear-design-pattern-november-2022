package pojo;

import java.io.Serializable;

public class Person implements Serializable {

    private String vorname;
    private String nachname;
    private String ort;

    public Person() {
        vorname = nachname = ort ="";
    }

    public Person(String vorname, String nachname, String ort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.ort = ort;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", ort='").append(ort).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
