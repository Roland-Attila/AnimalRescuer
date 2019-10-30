package AnimalRescuer;

public class Dog extends Animal {
    private String name;
    private String bark;
    private String smellCancer;

    public void setBark(String bark) {
        this.bark = bark;
    }

    public void setSmellCancer(String smellCancer) {
        this.smellCancer = smellCancer;
    }

    public Dog(String name, int age, double hungryLevel) {
        super(name, age, hungryLevel);
        this.setName(name);
        this.setAge(age);
        this.setHungryLevel(hungryLevel);
    }

    public Dog() {
    }

    @Override
    public void mood() {
        setMoodLevel(getMoodLevel() + 4.2);
        System.out.println("After " + getName() + " has been pet by owner, he started to wag his tail.");
    }
}