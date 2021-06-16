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
    }
}