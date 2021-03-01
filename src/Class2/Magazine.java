package Class2;

public class Magazine implements PrintTable {
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
    }

    public static void printMagazine(PrintTable[] printTable) {
        for (PrintTable item: printTable) {
            if (item instanceof Magazine) {
                System.out.println(((Magazine) item).name);
            }
        }
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
                '}';
    }
}
