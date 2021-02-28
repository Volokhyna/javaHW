package Home2part2;

public class Main {
    public static void main(String[] args) {

        Papyrus papyrus= new Papyrus(1,"Charta hieratica");
        Book book = new Book(2,"Charta liviana","dictionary");
        Magazine magazine = new Magazine(3, "Charta amphitheatrica","prose","vogue");
        Comics comics = new Comics(4, "Charta corneliana","adventures",20);

        Papyrus[] papyruses = new Papyrus[4];
        papyruses[0] = papyrus;
        papyruses[1] = book;
        papyruses[2] = magazine;
        papyruses[3] = comics;


    }
}
