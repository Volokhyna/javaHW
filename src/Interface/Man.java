package Interface;

public class Man implements Clothes{
    private String sweater;
    private String pants;

    public Man() {
    }

    public Man(String sweater, String pants) {
        this.sweater = sweater;
        this.pants = pants;
    }

    @Override
    public void putOnClothes() {
        System.out.println("done for man");
    }

    public String getSweater() {
        return sweater;
    }

    public void setSweater(String sweater) {
        this.sweater = sweater;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    @Override
    public String toString() {
        return "Man{" +
                "sweater='" + sweater + '\'' +
                ", pants='" + pants + '\'' +
                '}';
    }
}
