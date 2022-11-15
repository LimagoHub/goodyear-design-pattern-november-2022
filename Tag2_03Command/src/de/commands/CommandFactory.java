package de.commands;

import java.lang.reflect.InvocationTargetException;

public class CommandFactory {

    private static final String PREFIX = "de.commands.";
    private static final String SUFFIX = "Command";

    public static Command create(String zeile) {
        try {
            return getCommand(zeile);
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        } 
    }

    private static Command getCommand(String zeile) throws Throwable {
        String [] tokens = zeile.split(" ");
        Command command = (Command) Class.forName(PREFIX +tokens[0] + SUFFIX).getConstructor().newInstance();
        command.parse(tokens);

        return command;
    }
}
