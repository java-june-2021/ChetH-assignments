public class Bat extends Mammal {
    //methods
    public static void fly(Bat deathBat) {
        System.out.println("Swoosh, swoosh, bat has taken off and flown (-50 energy).");
        deathBat.energyLevel -= 50;
        deathBat.displayEnergy(deathBat);
    }

    public static void eatHuman(Bat deathBat) {
        System.out.println("Nom, nom, bat has eaten a human (+25 energy).");
        deathBat.energyLevel += 25;
        deathBat.displayEnergy(deathBat);
    }

    public static void attackTown(Bat deathBat) {
        System.out.println("Boom crackle pop, town has been attacked by bat (-100 energy).");
        deathBat.energyLevel -= 100;
        deathBat.displayEnergy(deathBat);
    }
}