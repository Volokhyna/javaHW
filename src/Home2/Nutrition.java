package Home2;

public class Nutrition extends Reproduction{
    private String wayNutrition;

    public Nutrition() {
    }

    public Nutrition(int id, String group, String viviparous, String oviparous, String wayNutrition) {
        super(id, group, viviparous, oviparous);
        this.wayNutrition = wayNutrition;
    }

    public String getWayNutrition() {
        return wayNutrition;
    }

    public void setWayNutrition(String wayNutrition) {
        this.wayNutrition = wayNutrition;
    }

    @Override
    public String toString() {
        return "Nutrition{" +
                "wayNutrition='" + wayNutrition + '\'' +
                "} " + super.toString();
    }
}
