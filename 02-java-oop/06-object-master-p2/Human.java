public class Human {
    //attributes
    public int health;
    public int strength;
    public int intelligence;

    //constructors
    public Human(){
        this.health = 100;
        this.strength = 3;
        this.intelligence = 3;
    }
    public Human(int health){
        this.health = health;
    }
    public Human(int health, int strength){
        this.health = health;
        this.strength = strength;
    }
    public Human(int health, int strength, int intelligence){
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    //setters
    public void setHealth(int health){
        this.health = health;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    //getters
    public int getHealth(){
        return this.health;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getIntelligence(){
        return this.intelligence;
    }

    //methods
    public static void attack(Human attacker, Human victim){
        int currentVictimHealth = victim.getHealth();
        victim.setHealth(currentVictimHealth - attacker.getStrength());
    }
    public static void displayStats(Human me){
        System.out.println("Health: " + me.getHealth() + ", Strength: " + me.getStrength() + ", Intelligence: " + me.getIntelligence());
    }
}