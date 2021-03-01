package Class2;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Book implements PrintTable {
    private int coast;

    public Book() {
    }

    public Book(int coast) {
        this.coast = coast;
    }

    @Override
    public void print() {
    }
    static void printBook(PrintTable[] printTable) {
        for (PrintTable item: printTable) {
            if (item instanceof Book ){
                System.out.println(((Book) item).coast);
            }
        }
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Book{" +
                "coast=" + coast +
                '}';
    }
}
