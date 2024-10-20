package View;

import View.Command.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    private List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();

        commands.add(new CreateAnimal(consoleUI));
        commands.add(new ShowAllAnimals(consoleUI));
        commands.add(new ShowTotalCountAnimals(consoleUI));
        commands.add(new ShowCommandsAnimal(consoleUI));
        commands.add(new SortedByBirthDate(consoleUI));
        commands.add(new TrainAnimal(consoleUI));
        commands.add(new SaveToFileCommand(consoleUI));
        commands.add(new ReadFileCommand(consoleUI));
        commands.add(new FinishCommand(consoleUI));
    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) throws IOException, ClassNotFoundException {
        Command command = commands.get(choice - 1);
        command.execute();
    }

    public int size(){
        return commands.size();
    }

}
