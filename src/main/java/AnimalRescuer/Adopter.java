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

    public void animalFeed(AnimalFood animalFood, Dog dog) {
        System.out.println(name + " just gave some " + animalFood.getName() + " food to " + dog.getName() + ".");
        dog.setHungryLevel(7 - 1);
    }

}
