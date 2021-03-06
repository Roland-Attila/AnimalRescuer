package AnimalRescuer;

public class Cat extends Animal {

    private String meows;
    private String eyeColor;
    private String climbing;

    public void setMeows(String meows) {
        this.meows = meows;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setClimbing(String climbing) {
        this.climbing = climbing;
    }

    public Cat(String name, int age, double hungryLevel) {
        super(name, age, hungryLevel);
        this.setName(name);
        this.setAge(age);
        this.setHungryLevel(hungryLevel);
    }

    public Cat() {
    }

    @Override
    public void mood() {
        setMoodLevel(getMoodLevel() + 2.7);
    }
}