package Home3;

public class Clothes implements MenClothes, WomenClothes{
    private Size euroSize;
    private int cost;
    private String color;

    public Clothes() {
    }

    public Clothes(Size euroSize, int cost, String color) {
        this.euroSize = euroSize;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void toDressAMan() {

    }

    @Override
    public void toDressAWoman() {

    }

    public Size getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(Size euroSize) {
        this.euroSize = euroSize;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "euroSize=" + euroSize +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
