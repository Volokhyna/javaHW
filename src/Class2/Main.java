package Class2;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("vogue");
        Magazine magazine1 = new Magazine("karolina");
        Magazine magazine2 = new Magazine("game over");
        Book book = new Book(20);
        Book book1 = new Book(100);

        PrintTable[] printTables = {magazine, magazine1, magazine2, book, book1};
        for (PrintTable printTable : printTables) {
            printTable.print();
        }
        Magazine.printMagazine(printTables);
        Book.printBook(printTables);
    }
}
