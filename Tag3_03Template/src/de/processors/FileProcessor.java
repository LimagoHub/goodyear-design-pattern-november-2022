package de.processors;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {


    public final void process(String filename) {
        try(FileReader reader = new FileReader(filename)) {

            init();
            int c;

            while( (c = reader.read()) != -1) {
                process((char) c);
            }

            dispose();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void init() {

    }

    public abstract void process(char c) ;

    public void dispose() {

    }
}
