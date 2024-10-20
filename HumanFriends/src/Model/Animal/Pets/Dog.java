package Model.Animal.Pets;

import Model.Animal.Gender;

import java.time.LocalDate;

public class Dog extends Pet{

    private Size size;

    public Dog(String name, LocalDate birthDate, String breed, Gender gender, Size size) {
        super(name, birthDate, breed, gender);
        this.size = size;
    }

    public Dog(String name, LocalDate birthDate, Size size) {
        super(name, birthDate);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет с мячом");
    }

    @Override
    public String getType() {
        return "Собака";
    }

    @Override
    public void sound() {
        System.out.println("Ррр, Гав");
    }

    @Override
    public String toString() {
        return String.format("%s, Рост: %s", super.toString(), getSize());
    }
}
