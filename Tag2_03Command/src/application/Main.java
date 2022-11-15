package application;

import de.commands.Command;
import de.commands.CommandFactory;
import de.commands.CommandHistory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            CommandHistory history = new CommandHistory();
            herbert: while(true) {
                System.out.print("#>");
                String zeile = scanner.nextLine();

                switch(zeile) {
                    case "ende": break herbert;
                    case "undo": history.undo(); continue herbert;
                    case "redo": history.redo(); continue herbert;
                }


                Command command = CommandFactory.create(zeile);

                if(command == null) continue;

                command.execute();
                history.addCommand(command);
            }

        }

    }
}