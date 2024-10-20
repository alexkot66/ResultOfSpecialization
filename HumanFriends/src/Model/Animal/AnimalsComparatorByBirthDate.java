package Model.Animal;

import java.util.Comparator;

public class AnimalsComparatorByBirthDate implements Comparator<Animals> {
    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
