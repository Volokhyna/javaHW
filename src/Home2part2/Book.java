package Home2part2;

public class Book extends Papyrus{
    private String classification;

    public Book() {
    }

    public Book(int id, String variety, String classification) {
        super(id, variety);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Book{" +
                "classification='" + classification + '\'' +
                "} " + super.toString();
    }
}
