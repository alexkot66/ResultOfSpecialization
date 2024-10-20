package Model.Animal.Pets;

import Model.Animal.Animals;
import Model.Animal.Gender;

import java.time.LocalDate;

public abstract class Pet extends Animals {
    private String breed;
    private Gender gender;

    public Pet(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public Pet(String name, LocalDate birthDate, String breed, Gender gender) {
        super(name, birthDate);
        this.breed = breed;
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public Gender getGender() {
        return gender;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract void play();

    @Override
    public String toString() {
        return String.format("%s, Порода: %s, Пол: %s", super.toString(), getBreed(), getGender());
    }
}
