package AnimalRescuer;

public class RecreationalActivity {

    private String name;
    private String type;
    private int activityDuration;
    private int numberOfAnimals;
    private double altitude;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setActivityDuration(int activityDuration) {
        this.activityDuration = activityDuration;
    }

    public int getActivityDuration() {
        return activityDuration;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public RecreationalActivity(String name, int activityDuration) {
        this.name = name;
        this.activityDuration = activityDuration;
    }
}