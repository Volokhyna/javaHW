package Interface;

public class Woman implements Clothes{
    private String name;
    private String blouse;
    private String skirt;

    public Woman() {
    }

    public Woman(String name, String blouse, String skirt) {
        this.name = name;
        this.blouse = blouse;
        this.skirt = skirt;
    }

    @Override
    public void putOnClothes() {
        System.out.println("done for woman");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlouse() {
        return blouse;
    }

    public void setBlouse(String blouse) {
        this.blouse = blouse;
    }

    public String getSkirt() {
        return skirt;
    }

    public void setSkirt(String skirt) {
        this.skirt = skirt;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", blouse='" + blouse + '\'' +
                ", skirt='" + skirt + '\'' +
                '}';
    }
}
