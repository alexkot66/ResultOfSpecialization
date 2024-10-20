package Presenter;

import Model.Animal.Animals;
import Model.Animal.Gender;
import Model.Animal.Pets.Size;
import Model.Service.Service;
import View.View;

import java.io.IOException;
import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void createCat(String name, LocalDate birthDate, String breed, Gender gender, String color){
        service.createCat(name, birthDate, breed, gender, color);
    }

    public void createDog(String name, LocalDate birthDate, String breed, Gender gender, Size size){
        service.createDog(name, birthDate, breed, gender, size);
    }

    public void createHamster(String name, LocalDate birthDate, String breed, Gender gender, int bodyLength){
        service.createHamster(name, birthDate, breed, gender, bodyLength);
    }

    public void createCamel(String name, LocalDate birthDate, String breed, Gender gender, int numberOfHumps){
        service.createCamel(name, birthDate, breed, gender, numberOfHumps);
    }

    public void createDonkey(String name, LocalDate birthDate, String breed, Gender gender, int loadCapacity){
        service.createDonkey(name, birthDate, breed, gender, loadCapacity);
    }

    public void createHorse(String name, LocalDate birthDate, String breed, Gender gender, String typeOfHorse){
        service.createHorse(name, birthDate, breed, gender, typeOfHorse);
    }

    public void showAnimals(){
        String answer = service.showAnimals();
        view.answer(answer);
    }

    public void trainAnimal(String name, String command) {
        service.trainAnimal(name, command);
    }

    public void printAnimalCommands(String name) {
        service.printAnimalCommands(name);
    }

    public int totalCountOfAnimals() {
        return service.totalCountOfAnimals();
    }

    public void getAnimalsSortedByBirthdate() {
        service.getAnimalsSortedByBirthdate();
    }

    public boolean saveToFile() throws IOException {
        return service.writeToFileRegistr(service.getAnimalsRegistr());

    }

    public Object readFile() throws IOException, ClassNotFoundException {
        return service.readRegistrInFile();
    }

    public Animals findAnimalByName(String name) {
        return service.findAnimalByName(name);
    }
}
