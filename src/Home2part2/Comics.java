package Home2part2;

public class Comics extends Book{
    private int volume;

    public Comics() {
    }

    public Comics(int quantity) {
        this.volume = quantity;
    }

    public Comics(int id, String variety, String classification, int volume) {
        super(id, variety, classification);
        this.volume = volume;
    }

    public int getQuantity() {
        return volume;
    }

    public void setQuantity(int quantity) {
        this.volume = quantity;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "quantity=" + volume +
                "} " + super.toString();
    }
}
