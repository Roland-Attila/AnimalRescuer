package AnimalRescuer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Veterinarian veterinarian;
    private Adopter adopter;
    private Animal dog;
    private Animal cat;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[4];

    public void start() {
        initFood();
        initActivities();
        displayFood();
        displayActivities();
        initAnimal();
        initRescuer();
        nameAnimal();
        requireFeeding();
    }

    private void initFood() {
        int foodList = 1;
        for (int i = 0; i < foodList; i++) {
            AnimalFood food = new AnimalFood("Pedigree", 23,
                    LocalDate.of(2020, 1, 12), "Dry Place");
            AnimalFood food1 = new AnimalFood("Rocco", 23.3,
                    LocalDate.of(2019, 12, 13), "Room Temperature");
            AnimalFood food2 = new AnimalFood("Royal Canin", 25.4,
                    LocalDate.of(2020, 4, 21), "In the fridge");
            availableFood.add(food);
            availableFood.add(food1);
            availableFood.add(food2);
        }
    }

    private void displayFood() {
        System.out.println("Available food: ");
        for (AnimalFood foodlist : availableFood) {
            System.out.println(foodlist);
        }
        System.out.println("\n");
    }

    private void initActivities() {
        RecreationalActivity fun = new RecreationalActivity("Walk in the park", 2);
        availableActivities[0] = fun;
        RecreationalActivity fun1 = new RecreationalActivity("Explore your neighborhood", 1);
        availableActivities[1] = fun1;
        RecreationalActivity fun2 = new RecreationalActivity("Hunting Prey", 1);
        availableActivities[2] = fun2;
    }

    private void displayActivities() {
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName() + " for a duration of: " + availableActivities[i].getActivityDuration() + " h.");
            }
        }
    }

    private void initAnimal() {
        System.out.println("\n" + "Please select an animal you would like to adopt: \n 1.Dog \n 2.Cat");
        Animal dog = new Dog("Rexi", 6, 7);
        Animal cat = new Cat("Tomy", 3, 8);
        int userChoise;
        Scanner scanner = new Scanner(System.in);
        userChoise = scanner.nextInt();
    }

    private void initRescuer() {
        Adopter adopter = new Adopter("Florin", 80.0, 28);
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("Please enter your name.");
        try {
            userName = scanner.nextLine();
            adopter.setName(userName);
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid data.");
            initRescuer();
        }
    }

    private void nameAnimal() {
        System.out.println("Please enter the name of the adopted animal: ");
        Animal dog = new Dog("Rexi", 6, 7);
        Scanner scanner = new Scanner(System.in);
        dog.setName(scanner.nextLine());
    }

    private void requireFeeding() {
        System.out.println("You'll have to feed the adopted animal with one of the food type available from the list");
        displayFood();
        Scanner scanner = new Scanner(System.in);
        int userChoise;
        userChoise = scanner.nextInt();
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public List<AnimalFood> getAvailableFood() {
        return availableFood;
    }

    public void setAvailableFood(List<AnimalFood> availableFood) {
        this.availableFood = availableFood;
    }

    public RecreationalActivity[] getAvailableActivities() {
        return availableActivities;
    }

    public void setAvailableActivities(RecreationalActivity[] availableActivities) {
        this.availableActivities = availableActivities;
    }
}