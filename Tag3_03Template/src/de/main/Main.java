package de.main;

import de.processors.CharacterCounter;
import de.processors.FileCopy;
import de.processors.FileProcessor;
import de.processors.LineCounter;

public class Main {
    public static void main(String[] args) {


        FileProcessor fileProcessor = new CharacterCounter();

        fileProcessor.process("c:\\install.log");

    }
}