package Home3;

public enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    int euroSize;

    Size() {
    }

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    //    public abstract void getDescription();

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "ClothingSize{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
