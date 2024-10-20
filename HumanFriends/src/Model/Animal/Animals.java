package Model.Animal;

import Model.Animal.AnimalsRegistr.ItemAlimal;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animals implements Serializable, Comparable<Animals>, ItemAlimal<Animals> {

    private int id;
    private String name;
    private LocalDate birthDate;
    private List<String> commands;

    public Animals(String name, LocalDate birthDate) {
        id = -1;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public abstract String getType();

    public abstract void sound();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (! (obj instanceof Animals)) {
            return false;
        }
        Animals animal = (Animals) obj;
        return animal.getId() == getId();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", Имя: ");
        sb.append(name);
        sb.append(", Команды: ");
        sb.append(getCommands());
        sb.append(", Дата рождения: ");
        sb.append(getBirthDate());
        return sb.toString();
    }

    @Override
    public int compareTo(Animals o) {
        return (int) (this.id - o.getId());
    }
}
