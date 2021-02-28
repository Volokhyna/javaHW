package Home2;

public class Movement extends LifeStyle{
    private String movement;

    public Movement() {
    }

    public Movement(int id, String group, String dayAnimal, String nightAnimal, String movement) {
        super(id, group, dayAnimal, nightAnimal);
        this.movement = movement;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    @Override
    public void showHowItWorks() {
        System.out.println("this is movement class");
    }

    @Override
    public String toString() {
        return "Movement{" +
                "movement='" + movement + '\'' +
                "} " + super.toString();
    }
}
