package View.Command;

import View.ConsoleUI;

public class ShowTotalCountAnimals extends Command{

    public ShowTotalCountAnimals(ConsoleUI consoleUI) {
        super("Общее количество животных в реестре", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().totalCountOfAnimals();
    }
}
