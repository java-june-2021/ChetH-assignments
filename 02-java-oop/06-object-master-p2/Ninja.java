public class Ninja extends Human {
    //attributes
    private int stealth;

    //constructors
    public Ninja(){
        this.stealth = 10;
    }

    //setters
    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    //getters
    public int getStealth(){
        return this.stealth;
    }

    //methods
    public static void steal(Ninja attacker, Human victim){
        victim.setHealth(victim.getHealth() - attacker.getStealth());
        attacker.setHealth(attacker.getHealth() + attacker.getStealth());
    }
    public static void runAway(Ninja attacker){
        attacker.setHealth(attacker.getHealth() - 10);
    }
}