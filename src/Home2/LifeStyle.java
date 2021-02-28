package Home2;

public class LifeStyle extends Animals{
    private String dayAnimal;
    private String nightAnimal;

    public LifeStyle() {
    }

    public LifeStyle(int id, String group, String dayAnimal, String nightAnimal) {
        super(id, group);
        this.dayAnimal = dayAnimal;
        this.nightAnimal = nightAnimal;
    }

    public String getDayAnimal() {
        return dayAnimal;
    }

    public void setDayAnimal(String dayAnimal) {
        this.dayAnimal = dayAnimal;
    }

    public String getNightAnimal() {
        return nightAnimal;
    }

    public void setNightAnimal(String nightAnimal) {
        this.nightAnimal = nightAnimal;
    }

    @Override
    public String toString() {
        return "LifeStyle{" +
                "dayAnimal='" + dayAnimal + '\'' +
                ", nightAnimal='" + nightAnimal + '\'' +
                "} " + super.toString();
    }
}
