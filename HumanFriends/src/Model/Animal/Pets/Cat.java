package Model.Animal.Pets;

import Model.Animal.Gender;

import java.time.LocalDate;

public class Cat extends Pet{

    private String color;

    public Cat(String name, LocalDate birthDate, String breed, Gender gender, String color) {
        super(name, birthDate, breed, gender);
        this.color = color;
    }

    public Cat(String name, LocalDate birthDate, String color) {
        super(name, birthDate);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println("Играет с мышкой");
    }

    @Override
    public String getType() {
        return "Кошка";
    }

    @Override
    public void sound() {
        System.out.println("Мяу, Мрр");
    }

    @Override
    public String toString() {
        return String.format("%s, Окрас: %s", super.toString(), getColor());
    }
}
