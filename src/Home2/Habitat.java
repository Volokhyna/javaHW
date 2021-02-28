package Home2;

public class Habitat extends LifeStyle{
    private String habitat;

    public Habitat() {
    }

    public Habitat(int id, String group, String dayAnimal, String nightAnimal, String habitat) {
        super(id, group, dayAnimal, nightAnimal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
