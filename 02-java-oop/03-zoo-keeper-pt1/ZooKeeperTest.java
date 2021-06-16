public class ZooKeeperTest {
    public static void main(String[] args) {
        Gorilla bob = new Gorilla();
        bob.setEnergyLevel(100);
        bob.displayEnergy(bob);
        Gorilla.throwSomething(bob);
        Gorilla.throwSomething(bob);
        Gorilla.throwSomething(bob);
        Gorilla.eatBananas(bob);
        Gorilla.eatBananas(bob);
        Gorilla.climb(bob);
    }
}