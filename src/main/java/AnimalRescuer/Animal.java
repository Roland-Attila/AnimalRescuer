package AnimalRescuer;

public class Animal {

    private String name;
    private int age;
    private double healthLevel;
    private double hungryLevel;
    private double moodLevel;
    private String favouriteFood;
    private String preferredRecreationalActivity;
    private double happinessLevel;
    private String race;
    private String rival;
    private boolean listener;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungryLevel(double hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public double getHungryLevel() {
        return hungryLevel;
    }

    public void setMoodLevel(double moodLevel) {
        this.moodLevel = moodLevel;
    }

    public double getMoodLevel() {
        return moodLevel;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setPreferredRecreationalActivity(String preferredRecreationalActivity) {
        this.preferredRecreationalActivity = preferredRecreationalActivity;
    }

    public void setHappinessLevel(double happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public void setListener(boolean listener) {
        this.listener = listener;
    }

    public Animal(String name, int age, double hungryLevel) {
        this.name = name;
        this.age = age;
        this.hungryLevel = hungryLevel;
    }

    public void mood() {
        setMoodLevel(getMoodLevel() + 3.4);
        System.out.println("After " + name + " has been pet by owner, his mood level changed to: " + getMoodLevel());
    }
}