public class Start {
    public static void main(String[] args) {
        Zolushka[] allZolushka = new Zolushka[]{
                new Zolushka("Karina", 10, 32),
                new Zolushka("Nastya", 17, 39),
                new Zolushka("Olya", 35, 34),
                new Zolushka("Inna", 25, 40),
                new Zolushka("Mila", 27, 35),
                new Zolushka("Zoya", 15, 34),
                new Zolushka("Alina", 26, 33),
                new Zolushka("Sveta", 18, 39),
                new Zolushka("Alyona", 30, 34),
                new Zolushka("Nana", 17, 37)
        };

        Prince prince = new Prince("Sasha", 33, 35);
        System.out.println(prince.find(allZolushka));
    }
}
