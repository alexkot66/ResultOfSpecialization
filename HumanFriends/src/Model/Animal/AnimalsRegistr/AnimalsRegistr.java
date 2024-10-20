package Model.Animal.AnimalsRegistr;

import Model.Animal.Animals;
import Model.Animal.AnimalsComparatorByBirthDate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalsRegistr implements Serializable {
    private int animalsId;
    private List<Animals> animals;

    public AnimalsRegistr() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animals animal) {

        animals.add(animal);
        animal.setId(animalsId++);
    }

    public String showAnimals() {
        StringBuilder sb = new StringBuilder();
        for (Animals animal : animals) {
            sb.append(animal.toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    public List<Animals> getAnimalsSortedByBirthdate() {
        return sortAnimalsBy(new AnimalsComparatorByBirthDate());
    }

    private List<Animals> sortAnimalsBy(Comparator<Animals> comparator) {
        List<Animals> allAnimals = animals;
        allAnimals.sort(comparator);
        return allAnimals;
    }

    public int totalCountOfAnimals() {
        return animals.size();
    }

    public Animals findAnimalByName(String name) {
        for (Animals animal : animals) {
            String animalName = animal.getName();
            if (animalName.equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void trainAnimal(String name, String command) {
        Animals animal = findAnimalByName(name);
        if (animal != null) {
            animal.addCommand(command);
        }
    }

    public void printAnimalCommands(String name) {
        Animals animal = findAnimalByName(name);
        if (animal != null) {
            System.out.println(animal.getCommands());
        }
    }

}
