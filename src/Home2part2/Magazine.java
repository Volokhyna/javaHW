package Home2part2;

public class Magazine extends Book{
    private String name;

    public Magazine() {
    }

    public Magazine(int id, String variety, String classification, String name) {
        super(id, variety, classification);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
