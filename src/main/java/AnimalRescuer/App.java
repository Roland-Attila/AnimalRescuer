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

        Adopter adopter = new Adopter();
        adopter.name = "Andrei";
        adopter.budget = 450.50;

        AnimalFood type = new AnimalFood();
        type.name = "Porkchop";
        type.price = 25.5;
        type.quantity = 7;
        type.expiringDate = "java.time.LocalDateTime";
        type.stockAvailability = 5;

        RecreationalActivity fun = new RecreationalActivity();
        fun.name = "Mount Chillard";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Istvan";
        veterinarian.specialization = "Veterinary";

        Game game = new Game();
        game.adopter = "Andrei";
        game.dog = "Rexi";
        game.veterinarian = "Istvan";













    }
}
