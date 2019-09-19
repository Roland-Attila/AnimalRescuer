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
        this.specialization = specialization;
        this.experience = experience;
        this.location = location;
        this.workProgram = workProgram;
    }
}
