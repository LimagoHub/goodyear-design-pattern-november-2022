package main;

import de.pojo.Person;

public class Main {
    public static void main(String[] args) {

        Person p = Person
                .builder()
                .vorname("Max")
                .nachname("Mustermann")
                .build();

        System.out.println(p);

    }
}