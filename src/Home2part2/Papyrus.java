package Home2part2;

public class Papyrus {
    private int id;
    private String papyrusVarieties;

    public Papyrus() {
    }

    public Papyrus(int id, String papyrusVarieties) {
        this.id = id;
        this.papyrusVarieties = papyrusVarieties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "id=" + id +
                ", variety='" + papyrusVarieties + '\'' +
                '}';
    }
}
