package Model.Service;

import Model.Animal.AnimalBuilder;
import Model.Animal.Animals;
import Model.Animal.AnimalsRegistr.AnimalsRegistr;
import Model.Animal.Gender;
import Model.Animal.PackAnimals.Camel;
import Model.Animal.PackAnimals.Donkey;
import Model.Animal.PackAnimals.Horse;
import Model.Animal.Pets.Cat;
import Model.Animal.Pets.Dog;
import Model.Animal.Pets.Hamster;
import Model.Animal.Pets.Size;
import Model.Writer.FileHandler;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class Service {
    AnimalBuilder animalBuilder;
    AnimalsRegistr animalsRegistr;
    FileHandler fileHandler;

    public Service() {
        animalBuilder = new AnimalBuilder();
        animalsRegistr = new AnimalsRegistr();
        fileHandler = new FileHandler();
    }

    public void createDog(String name, LocalDate birthDate, String breed, Gender gender, Size size){
        Dog dog = (Dog) new AnimalBuilder()
                .setName(name)
                .setBreed(breed)
                .setBirthDate(birthDate)
                .setSize(size)
                .setGender(gender)
                .buildDog();
        animalsRegistr.addAnimal(dog);
    }

    public void createCat(String name, LocalDate birthDate, String breed, Gender gender, String color){
        Cat cat = (Cat) new AnimalBuilder()
                .setName(name)
                .setBreed(breed)
                .setBirthDate(birthDate)
                .setColor(color)
                .setGender(gender)
                .buildCat();
        animalsRegistr.addAnimal(cat);
    }

    public void createHamster(String name, LocalDate birthDate, String breed, Gender gender, int bodyLength){
        Hamster hamster = (Hamster) new AnimalBuilder()
                .setName(name)
                .setBreed(breed)
                .setBirthDate(birthDate)
                .setBodyLength(bodyLength)
                .setGender(gender)
                .buildHamster();
        animalsRegistr.addAnimal(hamster);
    }

    public void createCamel(String name, LocalDate birthDate, String breed, Gender gender, int numberOfHumps){
        Camel camel = (Camel) new AnimalBuilder()
                .setName(name)
                .setBreed(breed)
                .setBirthDate(birthDate)
                .setNumberOfHumps(numberOfHumps)
                .setGender(gender)
                .buildCamel();
        animalsRegistr.addAnimal(camel);
    }

    public void createDonkey(String name, LocalDate birthDate, String breed, Gender gender, int loadCapacity){
        Donkey donkey = (Donkey) new AnimalBuilder()
                .setName(name)
                .setBreed(breed)
                .setBirthDate(birthDate)
                .setLoadCapacity(loadCapacity)
                .setGender(gender)
                .buildDonkey();
        animalsRegistr.addAnimal(donkey);
    }

    public void createHorse(String name, LocalDate birthDate, String breed, Gender gender, String typeOfHorse){
        Horse horse = (Horse) new AnimalBuilder()
                .setName(name)
                .setBreed(breed)
                .setBirthDate(birthDate)
                .setTypeOfHorse(typeOfHorse)
                .setGender(gender)
                .buildHorse();
        animalsRegistr.addAnimal(horse);
    }

    public String showAnimals(){
        return animalsRegistr.showAnimals();
    }

    public AnimalsRegistr getAnimalsRegistr(){
        return animalsRegistr;
    }

    public void trainAnimal(String name, String command) {
        animalsRegistr.trainAnimal(name, command);
    }

    public void printAnimalCommands(String name) {
        animalsRegistr.printAnimalCommands(name);
    }

    public int totalCountOfAnimals(){
        return animalsRegistr.totalCountOfAnimals();
    }

    public void getAnimalsSortedByBirthdate() {
        List<Animals> allAnimals = animalsRegistr.getAnimalsSortedByBirthdate();
        for (Animals animal : allAnimals) {
            System.out.println(animal);
        }
    }

    public boolean writeToFileRegistr(AnimalsRegistr animalsRegistr) throws IOException {
        if (fileHandler.writeToFileObject(animalsRegistr)) {
            return true;
        }
        return false;

    }

    public AnimalsRegistr readRegistrInFile() throws IOException, ClassNotFoundException {
        return (AnimalsRegistr) fileHandler.readObjectInFile();
    }

    public Animals findAnimalByName(String name) {
        return animalsRegistr.findAnimalByName(name);
    }

}
