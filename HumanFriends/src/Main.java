import View.View;
import View.ConsoleUI;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        View view = new ConsoleUI();
        view.start();
    }
}
