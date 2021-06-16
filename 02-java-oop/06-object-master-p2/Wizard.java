public class Wizard extends Human {
    //constructors
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    //methods
    public static void heal(Wizard healer, Human patient){
        patient.setHealth(patient.getHealth() + healer.getIntelligence());
    }
    public static void fireball(Wizard attacker, Human victim){
        victim.setHealth(victim.getHealth() - attacker.getIntelligence()*3);
    }
}