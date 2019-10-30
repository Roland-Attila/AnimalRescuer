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
    private AnimalFood animalFood;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[3];
    private String foodName;
    private String activityName;

    public void start() {
        initFood();
        initActivities();
        displayFood();
        displayActivities();
        initAnimal();
        initRescuer();
        nameAnimal();
        requireFeeding();
        requireActivity();
        boolean winnerNotKnkow = true;
        boolean loserNotKnown = true;
        int totalRounds = 3;

        while (winnerNotKnkow && loserNotKnown) {
            System.out.println("Beginning new round...");
            for (int round = 1; round <= totalRounds; round++) {
                System.out.println("Round " + round);
                requireFeeding();
                if (dog.getFavouriteFood().equals(foodName)) {
                    requireActivity();
                    if (dog.getPreferredRecreationalActivity().equals(activityName)) {
                        winnerNotKnkow = false;
                        System.out.println("Congratulations! " + adopter.getName() + " have won the game.");
                        break;
                    }
                }
                requireActivity();
                if (!dog.getPreferredRecreationalActivity().equals(activityName)) {
                    requireFeeding();
                    if (!dog.getFavouriteFood().equals(foodName)) {
                        loserNotKnown = false;
                        System.out.println("Mission failed! Game lost!");
                        break;
                    }
                }
            }
        }
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
                System.out.println(availableActivities[i] + " for a duration of: " +
                        availableActivities[i].getActivityDuration() + " h.");
            }
        }
    }

    private void initAnimal() {
        Animal dog = new Dog();
        dog.setName("Rexi");
        Animal cat = new Cat();
        cat.setName("Tomy");
        System.out.println("\n" + "Please select an animal you would like to adopt: \n " + "1.Dog " + "\n " + "2.Cat ");
        Scanner scanner = new Scanner(System.in);
        try {
            int animal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid data.");
            initAnimal();
        }
    }

    private void initRescuer() {
        Adopter adopter = new Adopter();
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();
        try {
            String numOnly = name.replaceAll("\\p{Alpha}", "");
            double numVal = Double.valueOf(numOnly);
            adopter.setName(numOnly);
            System.out.println(name + " cannot contain numbers");
            initRescuer();
        } catch (NumberFormatException e) {
        }
    }

    private void nameAnimal() {
        System.out.println("Please enter the name for your adopted animal: ");
        Animal dog = new Dog();
        Animal cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            String numOnly = name.replaceAll("\\p{Alpha}", "");
            double numVal = Double.valueOf(numOnly);
            adopter = new Adopter();
            adopter.setName(numOnly);
            System.out.println(name + " cannot contain numbers");
            dog.setName(name);
            cat.setName(name);
            nameAnimal();
        } catch (NumberFormatException e) {
        }
    }

    private void requireFeeding() {
        System.out.println("You'll have to feed your animal with one of the food types available from the list.");
        displayFood();
        Scanner scanner = new Scanner(System.in);
        foodName = scanner.nextLine();
        animalFood = new AnimalFood(foodName);
        List<String> availableFoodNames = new ArrayList<>();
        try {
            for (AnimalFood animalFood : availableFood) {
                availableFoodNames.add(animalFood.getName());
            }
            if ((!availableFoodNames.contains(foodName))) {
                System.out.println(foodName + " is not available as a food type in this game.");
                requireFeeding();
            }
        } catch (InputMismatchException e) {
        }
        dog = new Dog();
        dog.setName("Rexi");
        dog.setFavouriteFood("Rocco");
        adopter = new Adopter();
        adopter.setName("You");
        adopter.animalFeed(animalFood, (Dog) dog);
    }

    private void requireActivity() {
        System.out.println(" \nWhat kind of recreational activity would you like to have with your animal?");
        displayActivities();
        Scanner scanner = new Scanner(System.in);
        activityName = scanner.nextLine();
        RecreationalActivity fun = new RecreationalActivity(activityName, 2);
        System.out.println("Selected: " + activityName + "\n");
        adopter.recreationalActivity((Dog) dog, fun);
        dog = new Dog();
        dog.setName("Rexi");
        dog.setPreferredRecreationalActivity("Hunting Prey");
        Adopter adopter = new Adopter();
        adopter.setName("You");
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