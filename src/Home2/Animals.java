package Home2;

public class Animals {
    private int id;
    private String group;

    public Animals() {}

    public Animals(int id, String group) {
        this.id = id;
        this.group = group;
    }

    public int getId() {
        return id;
    }
    public void showHowItWorks() {
        System.out.println("this is animals class");
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", group='" + group + '\'' +
                '}';
    }
}
