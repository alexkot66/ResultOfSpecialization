package Model.Animal;

import Model.Animal.PackAnimals.Camel;
import Model.Animal.PackAnimals.Donkey;
import Model.Animal.PackAnimals.Horse;
import Model.Animal.Pets.Cat;
import Model.Animal.Pets.Dog;
import Model.Animal.Pets.Hamster;
import Model.Animal.Pets.Size;

import java.time.LocalDate;

public class AnimalBuilder {
    private String name;
    private String breed;
    private Gender gender;
    private LocalDate birthDate;
    private String color;
    private Size size;
    private int bodyLength;
    private int numberOfHumps;
    private int loadCapacity;
    private String typeOfHorse;

    public AnimalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public AnimalBuilder setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public AnimalBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public AnimalBuilder  setColor(String color) {
        this.color = color;
        return this;
    }

    public AnimalBuilder  setSize(Size size) {
        this.size = size;
        return this;
    }

    public AnimalBuilder  setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
        return this;
    }

    public AnimalBuilder  setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
        return this;
    }

    public AnimalBuilder  setNumberOfHumps(int numberOfHumps) {
        this.numberOfHumps = numberOfHumps;
        return this;
    }

    public AnimalBuilder  setTypeOfHorse(String typeOfHorse) {
        this.typeOfHorse = typeOfHorse;
        return this;
    }

    public Animals buildDog() {
        return new Dog(name, birthDate, breed, gender, size);
    }

    public Animals buildCat() {
        return new Cat(name, birthDate, breed, gender, color);
    }

    public Animals buildHamster() {
        return new Hamster(name, birthDate, breed, gender, bodyLength);
    }

    public Animals buildHorse() {
        return new Horse(name, birthDate, breed, gender, typeOfHorse);
    }

    public Animals buildDonkey() {
        return new Donkey(name, birthDate, breed, gender, loadCapacity);
    }

    public Animals buildCamel() {
        return new Camel(name, birthDate, breed, gender, numberOfHumps);
    }
}
