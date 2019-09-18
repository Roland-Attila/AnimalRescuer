package AnimalRescuer;

public class Veterinarian {

    String name;
    String specialization;
    int age;
    int experience;
    String location;
    double workProgram;
    Cat cat;

    public Veterinarian(String name, String specialization, int experience, String location, double workProgram) {
        this.name = name;
        this.specialization = "Veterinary";
        this.experience = 15;
        this.location = "15th Desert road";
        this.workProgram = 23.00;
    }
}
