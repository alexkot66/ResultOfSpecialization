package Model.Animal.Pets;

import Model.Animal.Gender;

import java.time.LocalDate;

public class Hamster extends Pet{

    private int bodyLength;

    public Hamster(String name, LocalDate birthDate, String breed, Gender gender, int bodyLength) {
        super(name, birthDate, breed, gender);
        this.bodyLength = bodyLength;
    }

    public Hamster(int id, String name, LocalDate birthDate, int bodyLength) {
        super(name, birthDate);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public void play() {
        System.out.println("Играет с перышком");
    }

    @Override
    public String getType() {
        return "Хомяк";
    }

    @Override
    public void sound() {
        System.out.println("Фырк, Шшш");
    }

    @Override
    public String toString() {
        return String.format("%s, Длина тела: %s", super.toString(), getBodyLength());
    }
}
