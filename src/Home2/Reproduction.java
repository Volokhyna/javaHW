package Home2;

public class Reproduction extends Animals{
    private String viviparous;
    private String oviparous;

    public Reproduction() {
    }

    public Reproduction(int id, String group, String viviparous, String oviparous) {
        super(id, group);
        this.viviparous = viviparous;
        this.oviparous = oviparous;
    }

    public String getViviparous() {
        return viviparous;
    }

    public void setViviparous(String viviparous) {
        this.viviparous = viviparous;
    }

    public String getOviparous() {
        return oviparous;
    }

    public void setOviparous(String oviparous) {
        this.oviparous = oviparous;
    }

    @Override
    public String toString() {
        return "Reproduction{" +
                "viviparous='" + viviparous + '\'' +
                ", oviparous='" + oviparous + '\'' +
                "} " + super.toString();
    }
}
