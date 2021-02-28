package Home2;

public class Main {
    public static void main(String[] args) {

        Animals animal = new Animals(1, "insects");
        LifeStyle animal2 = new LifeStyle(2, "birds", "gull","owl");
        Reproduction animal3 = new Reproduction(3,"fish","shark","american hydrologist");
        Movement animal4 = new Movement(4,"mammals","lion","puma","running");
        Habitat animal5 = new Habitat(5,"birds","falcon","kiwi","forest");
        Nutrition animal6 = new Nutrition(6,"amphibians","-","toad","herbivorous");
        Temperature animal7 = new Temperature(7,"mammals","wolf","platypus","warm-blooded");

        Animals[] animals = new Animals[7];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = animal3;
        animals[3] =animal4;
        animals[4] =animal5;
        animals[5] =animal6;
        animals[6] =animal7;

        LifeStyle[] lifeStyles = {animal2,animal4,animal5,};
        Reproduction[] reproductions = {animal3, animal6, animal7};

        checkAnimals(animal3);
        checkAnimals(animal4);

    }

    public static void checkAnimals(Animals animal) {
        animal.showHowItWorks();
    }
}
