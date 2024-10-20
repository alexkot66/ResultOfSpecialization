package Model.Animal.PackAnimals;

import Model.Animal.Gender;

import java.time.LocalDate;

public class Donkey extends PackAnimal {

    private int loadCapacity;

    public Donkey(String name, LocalDate birthDate, String breed, Gender gender, int loadCapacity) {
        super(name, birthDate, breed, gender);
        this.loadCapacity = loadCapacity;
    }

    public Donkey(String name, LocalDate birthDate, int loadCapacity) {
        super(name, birthDate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void favoriteFood() {
        System.out.println("Морковь");
    }

    @Override
    public String getType() {
        return "Осел";
    }

    @Override
    public void sound() {
        System.out.println("Иа-Иа");
    }

    @Override
    public String toString() {
        return String.format("%s, Грузоподъемность: %s", super.toString(), getLoadCapacity());
    }
}
