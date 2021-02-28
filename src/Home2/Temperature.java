package Home2;

public class Temperature extends Reproduction{
    private String temperature;

    public Temperature() {
    }

    public Temperature(int id, String group, String viviparous, String oviparous, String temperature) {
        super(id, group, viviparous, oviparous);
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature='" + temperature + '\'' +
                "} " + super.toString();
    }
}
