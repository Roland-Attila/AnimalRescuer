package AnimalRescuer;

import java.time.LocalDate;

public class App
{
    public static void main(String[] args)
    {
        Animal dog = new Animal();
        dog.name = "Rexi";
        dog.age = 4;
        dog.healthLevel = 10.0;
        dog.hungryLevel = 10.0;
        dog.moodLevel = 10.0;
        dog.favouriteFood = "Cooked Chicken";
        dog.preferredRecreationalActivityName = "Go to Camp";
        dog.happinessLevel = 10.0;
        dog.race = "Labrador";
        dog.rival = "Pitbull";
        dog.listener = true;

        Adopter adopter = new Adopter();
        adopter.name = "Andrei";
        adopter.budget = 450.50;
        adopter.age = 27;
        adopter.height = 1.75;
        adopter.weight = 85.8;
        adopter.smoker = false;

        AnimalFood food = new AnimalFood();
        food.name = "Porkchop";
        food.price = 25.5;
        food.quantity = 7;
        food.expirationDate = LocalDate.of(2019, 10, 11);
        food.stockAvailability = 5;
        food.ageRecommendation = 4.8;
        food.weightRecommendation = 45;
        food.storage = "Dry Place, Room Temperature";
        food.soft = false;

        RecreationalActivity fun = new RecreationalActivity();
        fun.name = "Mount Chillard";
        fun.activityDuration = 2;
        fun.altitude = 800;
        fun.numberOfAnimals = 3;
        fun.type = "Run and Rest";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Istvan";
        veterinarian.specialization = "Veterinary";
        veterinarian.age = 45;
        veterinarian.experience = 15;
        veterinarian.location = "15th Desert road";
        veterinarian.workProgram = 23.00;

        Game game = new Game();

    }
}
