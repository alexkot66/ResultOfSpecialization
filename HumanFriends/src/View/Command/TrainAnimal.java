package View.Command;

import View.ConsoleUI;

public class TrainAnimal extends Command{

    public TrainAnimal(ConsoleUI consoleUI) {
        super("Тренировка животного из реестра", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().trainAnimal();
    }
}
