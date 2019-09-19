package AnimalRescuer;

public class Dog extends Animal {

    private String bark;
    private String smellCancer;
    private String name;

    public String getName() {
        return name;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public void setSmellCancer(String smellCancer) {
        this.smellCancer = smellCancer;
    }

    public Dog(String name, int age, double hungryLevel) {
        super(name, age, hungryLevel);
        this.name = name;
        this.setAge(age);
        this.setHungryLevel(hungryLevel);
    }
}
