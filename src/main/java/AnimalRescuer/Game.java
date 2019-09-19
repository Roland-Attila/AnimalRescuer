package AnimalRescuer;

public class Game {
    private Veterinarian veterinarian;
    private Adopter adopter;
    private Animal dog;

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }
}
