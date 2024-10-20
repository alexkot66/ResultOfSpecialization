package View.Command;

import View.ConsoleUI;

public class ShowAllAnimals extends Command{

    public ShowAllAnimals(ConsoleUI consoleUI) {
        super("Показать всех животных в реестре", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().showAnimals();
    }
}