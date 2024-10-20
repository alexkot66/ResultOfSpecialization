package View.Command;

import View.ConsoleUI;

public class SortedByBirthDate extends Command{

    public SortedByBirthDate(ConsoleUI consoleUI) {
        super("Сортировка животных в реестре по датам рождения", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByBirthDate();
    }
}
