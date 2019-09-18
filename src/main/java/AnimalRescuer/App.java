package AnimalRescuer;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        animal.age = 1;
        animal.healthLevel = 10.0;
        animal.hungryLevel = 10.0;
        animal.moodLevel = 10.0;
        animal.favouriteFood = "favouriteFood";
        animal.preferredRecreationalActivity = "Anything";
        animal.happinessLevel = 10.0;
        animal.race = "race";
        animal.rival = "rival";
        animal.listener = false;

        Animal dog = new Animal("Rexi");
        dog.age = 5;
        dog.healthLevel = 8;
        dog.hungryLevel = 7;
        dog.moodLevel = 7;
        dog.favouriteFood = "Cooked Chicken";
        dog.preferredRecreationalActivity = "Go to Camp";
        dog.happinessLevel = 8;
        dog.race = "Labrador";
        dog.rival = "Pitbull";
        dog.listener = true;

        Animal cat = new Cat("Jinx");
        cat.age = 3;
        cat.healthLevel = 9;
        cat.hungryLevel = 6;
        cat.moodLevel = 7;
        cat.favouriteFood = "Fish";
        cat.preferredRecreationalActivity = "Go to beach";
        cat.happinessLevel = 8;
        cat.rival = "dog";
        cat.race = "siamese";
        cat.listener = false;

        Adopter adopter = new Adopter("Andrei");
        adopter.budget = 450.50;
        adopter.age = 27;
        adopter.height = 1.75;
        adopter.weight = 85.8;
        adopter.smoker = false;

        AnimalFood animalfood = new AnimalFood("Porkchop");
        animalfood.price = 25.5;
        animalfood.quantity = 7;
        animalfood.expirationDate = LocalDate.of(2019, 10, 11);
        animalfood.stockAvailability = 5;
        animalfood.ageRecommendation = 4.8;
        animalfood.weightRecommendation = 45;
        animalfood.storage = "Dry Place, Room Temperature";
        animalfood.soft = false;

        RecreationalActivity fun = new RecreationalActivity("Mount Chillard");
        fun.activityDuration = 2;
        fun.altitude = 800;
        fun.numberOfAnimals = 3;
        fun.type = "Run and Rest";

        Veterinarian veterinarian = new Veterinarian("Istvan");
        veterinarian.specialization = "Veterinary";
        veterinarian.age = 45;
        veterinarian.experience = 15;
        veterinarian.location = "15th Desert road";
        veterinarian.workProgram = 23.00;

        Game game = new Game();

    }
}
