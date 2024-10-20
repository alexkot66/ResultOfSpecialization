package View.Command;

import View.ConsoleUI;

import java.io.IOException;

public abstract class Command {
    private final String description;
    private ConsoleUI consoleUI;

    public Command(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public String getDescription(){
        return description;
    }

    public abstract void execute() throws IOException, ClassNotFoundException;
}
