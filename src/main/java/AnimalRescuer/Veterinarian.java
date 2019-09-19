package AnimalRescuer;

public class Veterinarian {

    private String name;
    private String specialization;
    private int age;
    private int experience;
    private String location;
    private double workProgram;
    private Cat cat;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWorkProgram(double workProgram) {
        this.workProgram = workProgram;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Veterinarian(String name, String specialization, int experience, String location, double workProgram) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.location = location;
        this.workProgram = workProgram;
    }
}
