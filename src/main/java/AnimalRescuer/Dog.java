package AnimalRescuer;

public class Dog extends Animal {

    private String bark;
    private String smellCancer;
    private String name;
    private double hungryLevel;
    private double moodLevel;

    public String getName() {
        return name;
    }

    @Override
    public void setHungryLevel(double hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public double getMoodLevel() {
        return moodLevel;
    }

    @Override
    public void setMoodLevel(double moodLevel) {
        this.moodLevel = moodLevel;
    }

    public double getHungryLevel() {
        return hungryLevel;
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

    public void pet() {
        setMoodLevel(getMoodLevel() + 4.2);
        System.out.println("After " + name + " has been pet by owner, he started to wag his tail.");
    }
}
