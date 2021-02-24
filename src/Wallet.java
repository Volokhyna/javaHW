public class Wallet {
    private String type;
    private int sum;

    public Wallet() {}

    public Wallet(String type, int sum) {
        this.type = type;
        this.sum = sum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "{" + "type='" + type + '\'' +
                ", sum=" + sum + "}";
    }
    // установить lombok
}
