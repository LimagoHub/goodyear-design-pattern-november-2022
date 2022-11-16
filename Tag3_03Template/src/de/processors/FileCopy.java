package de.processors;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy extends FileProcessor{

    private FileWriter writer;

    @Override
    public void init() {
        try {
            writer = new FileWriter("C:\\tmp\\copy.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void process(char c) {
        try {
            writer.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dispose() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
