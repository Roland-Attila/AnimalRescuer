package AnimalRescuer;

public class Cat extends Animal {

    String name;
    private String meows;
    private String eyeColor;
    private String climbing;

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

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

    public void pet() {
        setMoodLevel(getMoodLevel() + 2.7);
        System.out.println("After " + name + " has been pet by owner, he began to purr.");
    }
}
