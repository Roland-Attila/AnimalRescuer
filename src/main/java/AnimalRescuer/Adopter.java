package AnimalRescuer;

public class Adopter {

    String name;
    double budget;
    int age;
    double height;
    double weight;
    boolean smoker;

    //    has-a relationship
    Animal dog;
    Animal preferredRecreationalActivityName;
    Animal favouriteFood;

    public Adopter (String name) {
        this.name = "Andrei";
        this.age = 27;
    }

}
