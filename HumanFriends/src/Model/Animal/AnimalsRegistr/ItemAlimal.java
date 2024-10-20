package Model.Animal.AnimalsRegistr;

import java.time.LocalDate;
import java.util.List;

public interface ItemAlimal <E extends ItemAlimal<E>>{
    String getName();
    LocalDate getBirthDate();
    int getId();
    List<String> getCommands();
}
