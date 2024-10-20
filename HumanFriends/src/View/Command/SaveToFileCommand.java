package View.Command;

import View.ConsoleUI;

import java.io.IOException;

public class SaveToFileCommand extends Command{

    public SaveToFileCommand(ConsoleUI consoleUI) {
        super("Сохранить реестр в файл", consoleUI);
    }

    @Override
    public void execute() throws IOException {
        getConsoleUI().saveToFile();
    }
}
