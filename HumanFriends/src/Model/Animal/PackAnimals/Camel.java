package Model.Animal.PackAnimals;

import Model.Animal.Gender;

import java.time.LocalDate;

public class Camel extends PackAnimal{

    private int numberOfHumps;

    public Camel(String name, LocalDate birthDate, String breed, Gender gender, int numberOfHumps) {
        super(name, birthDate, breed, gender);
        this.numberOfHumps = numberOfHumps;
    }

    public Camel(String name, LocalDate birthDate, int numberOfHumps) {
        super(name, birthDate);
        this.numberOfHumps = numberOfHumps;
    }

    public int getNumberOfHumps() {
        return numberOfHumps;
    }

    public void setNumberOfHumps(int numberOfHumps) {
        this.numberOfHumps = numberOfHumps;
    }

    @Override
    public void favoriteFood() {
        System.out.println("Груши");
    }

    @Override
    public String getType() {
        return "Верблюд";
    }

    @Override
    public void sound() {
        System.out.println("Фрук-фрук");
    }

    @Override
    public String toString() {
        return String.format("%s, Количество горбов: %s", super.toString(), getNumberOfHumps());
    }
}
