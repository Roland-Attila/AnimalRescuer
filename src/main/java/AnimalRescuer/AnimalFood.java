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

    public AnimalFood(String name, double price, LocalDate expirationDate, String storage) {
        this.name = name;
        this.price = 25.5;
        this.expirationDate = LocalDate.of(2019, 10, 11);
        this.storage = "Dry Place, Room Temperature";
    }

}
