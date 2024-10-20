package View.Command;

import View.ConsoleUI;

public class ShowCommandsAnimal extends Command{

    public ShowCommandsAnimal(ConsoleUI consoleUI) {
        super("Показать команды животного", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().printAnimalCommands();
    }
}
