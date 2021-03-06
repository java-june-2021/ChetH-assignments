public class HumanTest {
    public static void main(String[] args) {
        Human tinkusMaximus = new Human();
        System.out.println("New human Tinkus Maximus created");
        tinkusMaximus.displayStats(tinkusMaximus);
        Human quipee = new Human();
        System.out.println("New human Quipee created");
        quipee.displayStats(quipee);
        System.out.println("Tinkus Maximus attacks Quipee");
        Human.attack(tinkusMaximus, quipee);
        System.out.println("Tinkus Maximus stats:");
        tinkusMaximus.displayStats(tinkusMaximus);
        System.out.println("Quipee stats:");
        quipee.displayStats(quipee);
        Ninja nin = new Ninja();
        System.out.println("New ninja created");
        nin.displayStats(nin);
        Samurai sam = new Samurai();
        System.out.println("New samurai created");
        sam.displayStats(sam);
        Samurai sam2 = new Samurai();
        System.out.println("2nd samurai created");
        sam.displayStats(sam2);
        Wizard wiz = new Wizard();
        System.out.println("New wizard created");
        wiz.displayStats(wiz);
        System.out.println("Wizard fireballs ninja (decreases ninja health by intelligence * 3");
        wiz.fireball(wiz, nin);
        System.out.println("Ninja stats:");
        nin.displayStats(nin);
        System.out.println("Wizard heals ninja (increases health by intelligence)");
        wiz.heal(wiz, nin);
        System.out.println("Ninja stats:");
        nin.displayStats(nin);
        System.out.println("Ninja runs away (loses 10 health)");
        nin.runAway(nin);
        nin.displayStats(nin);
        System.out.println("Samurai deathblows wizard");
        sam.dealthBlow(sam, wiz);
        System.out.println("Wizard stats:");
        wiz.displayStats(wiz);
        System.out.println("Samura stats after dealing deathblow (reduces health by half)");
        sam.displayStats(sam);
        System.out.println("Ninja steals samurai2 (steals health by ninja's stealth)");
        nin.steal(nin, sam2);
        System.out.println("Samurai2's stats:");
        sam2.displayStats(sam2);
        System.out.println("Samurai2 meditates (gains 50% health)");
        sam2.meditate(sam2);
        System.out.println("Samurai2's stats:");
        sam2.displayStats(sam2);
        System.out.println("How many samurai's: " + sam.howMany());
    }
}