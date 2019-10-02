package AnimalRescuer;


import java.time.LocalDate;

public class AnimalFood {

    private String name;
    private double price;
    private int quantity;
    private int stockAvailability;
    private double ageRecommendation;
    private LocalDate expirationDate;
    private double weightRecommendation;
    private String storage;
    private boolean soft;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStockAvailability(int stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public void setAgeRecommendation(double ageRecommendation) {
        this.ageRecommendation = ageRecommendation;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setWeightRecommendation(double weightRecommendation) {
        this.weightRecommendation = weightRecommendation;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setSoft(boolean soft) {
        this.soft = soft;
    }

    public AnimalFood(String name, double price, LocalDate expirationDate, String storage) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.storage = storage;
    }
}