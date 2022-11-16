package de.pojo;

public class Person {

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

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private final Person person = new Person();

        public PersonBuilder vorname(String vorname) {
            person.setVorname(vorname);
            return this;
        }
        public PersonBuilder nachname(String nachname) {
            person.setNachname(nachname);
            return this;
        }
        public PersonBuilder ort(String ort) {
            person.setOrt(ort);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
