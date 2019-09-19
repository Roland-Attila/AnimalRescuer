package AnimalRescuer;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1, 10.0);
        animal.setAge(1);
        animal.setHealthLevel(10.0);
        animal.setHungryLevel(10.0);
        animal.setMoodLevel(10.0);
        animal.setFavouriteFood("favouriteFood");
        animal.setPreferredRecreationalActivity("Anything");
        animal.setHappinessLevel(10.0);
        animal.setRace("race");
        animal.setRival("rival");
        animal.setListener(false);

        Dog dog = new Dog("Rexi", 5, 7);
        dog.setAge(5);
        dog.setHealthLevel(8);
        dog.setHungryLevel(7);
        dog.setMoodLevel(7);
        dog.setFavouriteFood("Cooked Chicken");
        dog.setPreferredRecreationalActivity("Go to Camp");
        dog.setBark("wouf");
        dog.setSmellCancer("Prostate Cancer");
        dog.setHappinessLevel(8);
        dog.setRace("Labrador");
        dog.setRival("Pitbull");
        dog.setListener(true);

        Cat cat = new Cat("Jinx", 3, 6.6);
        cat.setAge(3);
        cat.setHealthLevel(9);
        cat.setHungryLevel(6.6);
        cat.setMoodLevel(7);
        cat.setFavouriteFood("Fish");
        cat.setPreferredRecreationalActivity("Go to beach");
        cat.setHappinessLevel(7);
        cat.setEyeColor("Green");
        cat.setMeows("Miau");
        cat.setClimbing("Vertical Surfaces");
        cat.setRival("dog");
        cat.setRace("siamese");
        cat.setListener(false);

        Adopter adopter = new Adopter("Andrei", 450.50, 27);
        adopter.setBudget(450.50);
        adopter.setAge(27);
        adopter.setHeight(1.75);
        adopter.setWeight(85.8);
        adopter.setSmoker(false);
        adopter.setDog(dog);

        AnimalFood animalFood = new AnimalFood("Porkchop", 25.5, LocalDate.of(2019, 10, 11), "Dry Place, Room Temperature");
        animalFood.setPrice(25.5);
        animalFood.setQuantity(7);
        animalFood.setExpirationDate(LocalDate.of(2019, 10, 11));
        animalFood.setStockAvailability(5);
        animalFood.setAgeRecommendation(4.8);
        animalFood.setWeightRecommendation(45);
        animalFood.setStorage("Dry Place, Room Temperature");
        animalFood.setSoft(false);

        adopter.animalFeed(animalFood, dog);

        RecreationalActivity fun = new RecreationalActivity("Mount Chillard", 2);
        fun.setActivityDuration(2);
        fun.setAltitude(800);
        fun.setNumberOfAnimals(3);
        fun.setType("Run and Rest");

        Veterinarian veterinarian = new Veterinarian("Istvan", "Veterinary", 15, "15th Desert road", 23.00);
        veterinarian.setSpecialization("Veterinary");
        veterinarian.setAge(45);
        veterinarian.setExperience(15);
        veterinarian.setLocation("15th Desert road");
        veterinarian.setWorkProgram(23.00);
        veterinarian.setCat(cat);

        Game game = new Game();

        System.out.println();

    }
}
