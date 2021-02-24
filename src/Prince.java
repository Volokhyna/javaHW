public class Prince extends Human {
    private int slipper;

    public Prince() {}

    public Prince(String name, int age, int slipper) {
        super(name, age);
        this.slipper = slipper;
    }
    public String find(Zolushka[] all) {
        for (Zolushka item : all) {
            if (item.getFootSize() == this.slipper) {
                return item.toString();
            }
        }
        return "not found";
    }

    public int getSlipper() {
        return slipper;
    }

    public void setSlipper(int slipper) {
        this.slipper = slipper;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "slipper=" + slipper +
                "} " + super.toString();
    }

}
