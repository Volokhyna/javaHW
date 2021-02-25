import java.util.Arrays;

public class Car {
    // композиція і агрегація

    private String name;
    private int year;
    private String color;
    private PowerVolume powerVolume;
    private String[] type;

    public Car() {
    }

    public Car(String name, int year, String color, PowerVolume powerVolume, String[] type) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.powerVolume = powerVolume;
        this.type = type;
    }

    public Car(String name, int year, String color, PowerVolume powerVolume) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.powerVolume = powerVolume;
    }

    public Car(String name, int year, String color, String[] type) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PowerVolume getPowerVolume() {
        return powerVolume;
    }

    public void setPowerVolume(PowerVolume powerVolume) {
        this.powerVolume = powerVolume;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", powerVolume=" + powerVolume +
                ", type=" + Arrays.toString(type) +
                '}';
    }
}
