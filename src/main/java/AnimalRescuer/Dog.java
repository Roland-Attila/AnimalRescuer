package AnimalRescuer;

public class Dog extends Animal {

    private String bark;
    private String smellCancer;

    public void setBark(String bark) {
        this.bark = bark;
    }

    public void setSmellCancer(String smellCancer) {
        this.smellCancer = smellCancer;
    }

    public Dog(String name, int age, double hungryLevel) {
        super("Rexi", 5, 7);
        this.setName(name);
        this.setAge(age);
        this.setHungryLevel(hungryLevel);
    }
}
