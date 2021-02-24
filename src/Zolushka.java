public class Zolushka extends Human {
    private int footSize;

    public Zolushka() {
    }

    public Zolushka(String name, int age, int footSize) {
        super(name, age);
        this.footSize = footSize;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Zolushka{" +
                "footSize=" + footSize +
                "} " + super.toString();
    }
}
