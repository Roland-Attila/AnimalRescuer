package AnimalRescuer;

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

        AnimalFood type = new AnimalFood();
        type.name = "Porkchop";
        type.price = 25.5;
        type.quantity = 7;
        type.expiringDate = "java.time.LocalDateTime";
        type.stockAvailability = 5;
        type.ageRecommendation = 4.8;
        type.weightRecommendation = 45;
        type.storage = "Dry Place, Room Temperature";
        type.soft = false;

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
        game.adopter = "Andrei";
        game.dog = "Rexi";
        game.veterinarian = "Istvan";













    }
}
