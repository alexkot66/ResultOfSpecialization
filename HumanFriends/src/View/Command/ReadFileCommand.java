package View.Command;

import View.ConsoleUI;

import java.io.IOException;

public class ReadFileCommand extends Command{

    public ReadFileCommand(ConsoleUI consoleUI) {
        super("Загрузить реестр из файла", consoleUI);
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        getConsoleUI().readFile();
    }
}
