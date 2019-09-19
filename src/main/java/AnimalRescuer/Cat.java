package AnimalRescuer;

public class Cat extends Animal {

    String meows;
    String eyeColor;
    String climbing;

    public Cat(String name, int age, double hungryLevel) {
        super("Jinx", 3, 6);
        this.name = name;
        this.age = age;
        this.hungryLevel = hungryLevel;
    }
}
