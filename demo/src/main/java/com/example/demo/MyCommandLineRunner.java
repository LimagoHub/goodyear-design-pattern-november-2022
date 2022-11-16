package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

       Person p = Person.builder().vorname("John").nachname("Doe").ort("Nowhere").build();



        System.out.println(p);
    }
}
