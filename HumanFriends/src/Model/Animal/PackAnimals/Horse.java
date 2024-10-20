package Model.Animal.PackAnimals;

import Model.Animal.Gender;

import java.time.LocalDate;

public class Horse extends PackAnimal{

    private String typeOfHorse;

    public Horse(String name, LocalDate birthDate, String breed, Gender gender, String typeOfHorse) {
        super(name, birthDate, breed, gender);
        this.typeOfHorse = typeOfHorse;
    }

    public Horse(String name, LocalDate birthDate, String typeOfHorse) {
        super(name, birthDate);
        this.typeOfHorse = typeOfHorse;
    }

    public String getTypeOfHorse() {
        return typeOfHorse;
    }

    public void setTypeOfHorse(String typeOfHorse) {
        this.typeOfHorse = typeOfHorse;
    }

    @Override
    public void favoriteFood() {
        System.out.println("Яблоки, сахар");
    }

    @Override
    public String getType() {
        return "Лошадь";
    }

    @Override
    public void sound() {
        System.out.println("Иго-го");
    }

    @Override
    public String toString() {
        return String.format("%s, Тип лошади: %s", super.toString(), getTypeOfHorse());
    }
}
