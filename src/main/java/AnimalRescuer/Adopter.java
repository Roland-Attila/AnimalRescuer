package AnimalRescuer;

public class Adopter {

    private String name;
    private double budget;
    private int age;
    private double height;
    private double weight;
    private boolean smoker;
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Adopter(String name, double budget, int age) {
        this.name = name;
        this.budget = budget;
        this.age = age;
    }

    public Adopter(String name) {
        this.name = name;
    }

    public Adopter() {
    }

    public void animalFeed(AnimalFood animalFood, Dog dog) {
        if (animalFood.getName().equalsIgnoreCase(dog.getFavouriteFood())) {
            dog.setHungryLevel(+ 5);
            dog.setHappinessLevel(dog.getHappinessLevel() + dog.getMoodLevel() + 1);
        } else {
            dog.setHungryLevel(-2);
        }
        System.out.println(name + " just gave some " + animalFood.getName() + " food to " + dog.getName() + ".");
        dog.setHungryLevel(dog.getHungryLevel() - 2);
        System.out.println(dog.getName() + "'s" + " hunger level after he's been fed: " + dog.getHungryLevel());
        dog.setHungryLevel(dog.getHungryLevel() - 1);
        System.out.println(dog.getName() + "'s" + " new hunger level: " + dog.getHungryLevel());
    }

    public void recreationalActivity(Dog dog, RecreationalActivity fun) {
        if (fun.getName().equalsIgnoreCase(dog.getPreferredRecreationalActivity())) {
            dog.setHappinessLevel(dog.getHappinessLevel() + 2);
        } else {
            dog.setHappinessLevel(dog.getHappinessLevel() + 1);
        }
        System.out.println(name + " and " + dog.getName() + " went out to play " + fun.getName() + " for a couple of hours.");
        dog.setMoodLevel(dog.getMoodLevel() + 3);
        System.out.println(dog.getName() + "'s" + " mood level after having fun with " + name + ": " + dog.getMoodLevel());
        dog.setHappinessLevel(dog.getMoodLevel() + dog.getHappinessLevel());
        System.out.println(dog.getName() + "'s" + " happiness level: " + dog.getHappinessLevel() + "\n");
    }
}