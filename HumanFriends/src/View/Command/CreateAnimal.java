package View.Command;

import View.ConsoleUI;

public class CreateAnimal extends Command{

    public CreateAnimal(ConsoleUI consoleUI) {
        super("Добавить животное", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addAnimal();
    }
}
