package Interface;

public class Main {
    public static void main(String[] args) {

        Man man = new Man();
        Woman woman = new Woman();

        Clothes[] manClothes = {man};
        Clothes[] womanClothes = {woman};

        checkMan(man);
        checkWoman(woman);
    }

    public static void checkMan(Man man) {
        man.putOnClothes();
    }

    public static void checkWoman(Woman woman) {
        woman.putOnClothes();
    }
}
