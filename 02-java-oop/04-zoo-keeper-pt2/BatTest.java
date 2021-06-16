public class BatTest {
    public static void main(String[] args) {
        Bat bob = new Bat();
        bob.setEnergyLevel(300);
        bob.displayEnergy(bob);
        Bat.fly(bob);
        Bat.attackTown(bob);
        Bat.eatHuman(bob);
        Bat.fly(bob);
        Bat.attackTown(bob);
        Bat.eatHuman(bob);
        Bat.attackTown(bob);
    }
}