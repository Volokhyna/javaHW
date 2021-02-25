import java.util.Arrays;

public class Start {

    public static void main(String[] args) {
        System.out.println("hello");

        int a = 123;
        System.out.println(a);

        String name = "Alina";
        System.out.println(name);

        boolean b = false;
        System.out.println(b);

//        User user1 = new User();
//        user1.id = 1;
//        user1.name = "Roman";
//        System.out.println(user.id + " " + user.name);
//        System.out.println(user1);
//        user1.setId(1);
//        System.out.println(user1);

        String[] skills = new String[2];
        skills[0] = "angular";
        skills[1] = "react";
        User user2 = new User(2, "Ira", skills);
        System.out.println(user2);

        Wallet wallet = new Wallet("leather", 1000);
        Wallet wallet1 = new Wallet("bamboo", 500);
        User userWithWallet = new User(3, "Anna", wallet);
        System.out.println(userWithWallet);

        User userWithWallet2 = new User(4, "Max", new String[]{"html", "css"}, wallet1);
        System.out.println(userWithWallet2);

        User userWithWallet3 = new User(4, "Ivan", new String[]{"java", "js"}, "wood", 17000);
        System.out.println(userWithWallet3);

        String color = "yellow";
        Car car1 = new Car("Volvo", 2000, color);
        System.out.println(car1);

        PowerVolume foCar2 = new PowerVolume(300,2);
        Car car2 = new Car("Mercedes", 2000, "red", foCar2);
        System.out.println(car2);

        String[] types = new String[2];
        types[0] = "hatchback";
        types[1] = "sedan";
        Car car3 = new Car("Mercedes", 2015, "silver", types);
        System.out.println(car3);

        Car car4 = new Car("Bmw", 2015, "white", new String[]{"jeep", "sedan"});
        System.out.println(car4);

    }
}
