public class Gorilla extends Mammal {
    //methods
    public static void throwSomething(Gorilla gor) {
        System.out.println("Gorilla has thrown an object (-5 energy).");
        gor.energyLevel -= 5;
        gor.displayEnergy(gor);
    }

    public static void eatBananas(Gorilla gor) {
        System.out.println("Gorilla eaten a banana (+10 energy).");
        gor.energyLevel += 10;
        gor.displayEnergy(gor);
    }

    public static void climb(Gorilla gor) {
        System.out.println("Gorilla has climbed (-10 energy).");
        gor.energyLevel -= 10;
        gor.displayEnergy(gor);
    }
}