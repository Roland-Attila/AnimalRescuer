package AnimalRescuer;

public class Animal {

    String name;
    int age;
    double healthLevel;
    double hungryLevel;
    double moodLevel;
    String favouriteFood;
    String preferredRecreationalActivity;
    double happinessLevel;
    String race;
    String rival;
    boolean listener;

    public Animal(String name, int age, double hungryLevel) {
        this.name = name;
        this.age = age;
        this.hungryLevel = hungryLevel;
    }
}
