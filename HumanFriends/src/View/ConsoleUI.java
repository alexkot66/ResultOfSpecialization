package View;

import Model.Animal.Gender;
import Model.Animal.Pets.Size;
import Presenter.Presenter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        work = true;
        presenter = new Presenter(this);
        menu = new MainMenu(this);
    }

    @Override
    public void start() throws IOException, ClassNotFoundException {
        System.out.println("Доброго времени суток");
        while (work) {
            System.out.println(menu.menu());
            String choiceStr = scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);
            menu.execute(choice);
        }
    }

    public void finish() {
        work = false;
        scanner.close();
        System.out.println("Завершение работы. До новых встреч.");
    }

    public void sortByBirthDate() {
        presenter.getAnimalsSortedByBirthdate();
    }

    @Override
    public void answer(String answer) {
        System.out.println(answer);
    }

    public void addAnimal(){
        System.out.println("Выберите животное которое необходимо внести в реестр:\n");
        System.out.println("Кошка, Собака, Хомяк, Верблюд, Лошадь, Осел");
        String typeAnimal = scanner.nextLine();
        System.out.println("Вы выбрали животное: " + typeAnimal);
        switch (typeAnimal.toLowerCase()) {
            case "кошка":
                createCat();
                break;
            case "собака":
                createDog();
                break;
            case "хомяк":
                createHamster();
                break;
            case "верблюд":
                createCamel();
                break;
            case "лошадь":
                createHorse();
                break;
            case "осел":
                createDonkey();
                break;
            default:
                System.out.println("Неизвестный вид.");
        }
        

    }

    private Gender getGender() {
        System.out.println("Выберите пол: 1. Мужчина; 2. Женщина");
        String choice = scanner.nextLine();
        Gender gender = Gender.Male;
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case "1":
                    gender = Gender.Male;
                    flag = false;
                    break;
                case "2":
                    gender = Gender.Female;
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
        return gender;
    }

    private Size getSize() {
        System.out.println("Выберите размер собаки: 1. Маленькая; 2. Средняя; 3. Большая");
        String choice = scanner.nextLine();
        Size size = Size.Small;
        boolean flag = true;
        while (flag) {
            switch (choice) {
                case "1":
                    size = Size.Small;
                    flag = false;
                    break;
                case "2":
                    size = Size.Middle;
                    flag = false;
                    break;
                case "3":
                    size = Size.Large;
                    flag = false;
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
        return size;
    }

    private LocalDate getBirthDay() {
        System.out.println("Введите дату рождения в формате ГГГГ-ММ-ДД");
        String dateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dateInput);
        System.out.println("Вы ввели дату рождения:" + birthDate);
        return birthDate;
    }

    private String getName(){
        System.out.println("Введите имя для вашего животного:");
        String nameAnimal = scanner.nextLine();
        System.out.println("Ваше животное зовут: " + nameAnimal);
        return nameAnimal;
    }

    private String getBreed(){
        System.out.println("Какая порода у вашего животного:");
        String breedAnimal = scanner.nextLine();
        System.out.println("Порода животного: " + breedAnimal);
        return breedAnimal;
    }

    private void createCat(){
        String name = getName();
        LocalDate birthDate = getBirthDay();
        String breed = getBreed();
        Gender gender = getGender();

        System.out.println("Какой цвет у вашей кошки:");
        String color = scanner.nextLine();
        System.out.println("Цвет вашей кошки: " + color);

        presenter.createCat(name, birthDate, breed, gender, color);

        System.out.println("Ваш питомец занесен в реестр");
    }

    private void createDog(){
        String name = getName();
        LocalDate birthDate = getBirthDay();
        String breed = getBreed();
        Gender gender = getGender();
        Size size = getSize();

        presenter.createDog(name, birthDate, breed, gender, size);

        System.out.println("Ваш питомец занесен в реестр");
    }

    private void createHamster(){
        String name = getName();
        LocalDate birthDate = getBirthDay();
        String breed = getBreed();
        Gender gender = getGender();

        System.out.println("Какая длина тела у Вашего хомяка:");
        int bodyLenght = Integer.parseInt(scanner.nextLine());
        System.out.println("Длина тела вашего хомяка: " + bodyLenght);

        presenter.createHamster(name, birthDate, breed, gender, bodyLenght);

        System.out.println("Ваш питомец занесен в реестр");
    }

    private void createCamel(){
        String name = getName();
        LocalDate birthDate = getBirthDay();
        String breed = getBreed();
        Gender gender = getGender();

        System.out.println("Сколько горбов у Вашего верблюда: ");
        int numberOfHumps = Integer.parseInt(scanner.nextLine());
        System.out.println("У Вашего верблюда горбов: " + numberOfHumps);

        presenter.createCamel(name, birthDate, breed, gender, numberOfHumps);

        System.out.println("Ваш питомец занесен в реестр");
    }

    private void createHorse(){
        String name = getName();
        LocalDate birthDate = getBirthDay();
        String breed = getBreed();
        Gender gender = getGender();

        System.out.println("Какой тип у вашей лошади:");
        String typeOfHorse = scanner.nextLine();
        System.out.println("Тип вашей лошади: " + typeOfHorse);

        presenter.createHorse(name, birthDate, breed, gender, typeOfHorse);

        System.out.println("Ваш питомец занесен в реестр");
    }

    private void createDonkey(){
        String name = getName();
        LocalDate birthDate = getBirthDay();
        String breed = getBreed();
        Gender gender = getGender();

        System.out.println("Какая грузоподъемность у Вашего осла: ");
        int loadCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("У Вашего грузоподъемность: " + loadCapacity);

        presenter.createDonkey(name, birthDate, breed, gender, loadCapacity);

        System.out.println("Ваш питомец занесен в реестр");
    }

    public void showAnimals(){
        presenter.showAnimals();
    }

    public void totalCountOfAnimals() {
        System.out.println("Всего животных в реестре: ");
        System.out.println(presenter.totalCountOfAnimals());
    }

    public void trainAnimal(){
        while(true) {
            System.out.println("Введите имя своего питомца");
            String nameAnimal = getName();
            if(presenter.findAnimalByName(nameAnimal) != null){
                System.out.println("Введите команду для своего питомца");
                String commandAnimal = scanner.nextLine();
                presenter.trainAnimal(nameAnimal, commandAnimal);
                System.out.println("Ваш питомец выучил клмнаду: " + commandAnimal);
                return;
            } else {
                System.out.println("Ваш питомец не был найдет");
            }
        }
    }

    public void printAnimalCommands(){
        while(true) {
            System.out.println("Введите имя своего питомца");
            String nameAnimal = getName();
            if (presenter.findAnimalByName(nameAnimal) != null) {
                System.out.println("Команды, которые знает ваш питомец: ");
                presenter.printAnimalCommands(nameAnimal);
                return;
            } else {
                System.out.println("Ваш питомец не был найдет");
            }
        }
    }

    public void saveToFile() throws IOException{
        if(presenter.saveToFile()){
            System.out.println("Реестр сохранен\n");
        }
        showAnimals();
    }

    public void readFile() throws IOException, ClassNotFoundException{
        presenter.readFile();
        showAnimals();
    }


}
