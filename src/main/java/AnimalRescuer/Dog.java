package AnimalRescuer;

public class Dog extends Animal {

    String bark;
    String smellCancer;

    public Dog(String name, int age, double hungryLevel) {
        super("Rexi", 5, 7);
        this.name = name;
        this.age = age;
        this.hungryLevel = hungryLevel;
    }
}
