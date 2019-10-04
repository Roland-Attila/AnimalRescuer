package AnimalRescuer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Veterinarian veterinarian;
    private Adopter adopter;
    private Animal dog;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[4];

    public void start() {
        initFood();
        initActivities();
        displayActivities();
    }

    private void initFood() {
        int foodList = 3;
        System.out.println("Available food: ");
        for (int i = 0; i < foodList; i++) {
            AnimalFood food = new AnimalFood("Pedigree", 23,
                    LocalDate.of(2020, 1, 12), "Dry");
            AnimalFood food1 = new AnimalFood("Rocco", 18.5,
                    LocalDate.of(2020, 4, 5), "In Fridge");
            AnimalFood food2 = new AnimalFood("Royal Canin", 23.3,
                    LocalDate.of(2021, 3, 13), "Dry Place");

            System.out.println(availableFood);
            availableFood.add(food);
            availableFood.add(food1);
            availableFood.add(food2);
        }
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