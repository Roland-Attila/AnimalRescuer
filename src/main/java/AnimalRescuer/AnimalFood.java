package AnimalRescuer;


import java.time.LocalDate;

public class AnimalFood {

    String name;
    double price;
    int quantity;
    int stockAvailability;
    double ageRecommendation;
    LocalDate expirationDate;
    double weightRecommendation;
    String storage;
    boolean soft;

    public AnimalFood(String name) {
        this.name = name;
    }

}
