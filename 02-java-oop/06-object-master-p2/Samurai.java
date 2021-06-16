public class Samurai extends Human {
    //attributes
    static int numSamurai = 0;

    {
        numSamurai++;
    }

    //constructors
    public Samurai(){
        this.health = 200;
    }

    //methods
    public static void dealthBlow(Samurai attacker, Human victim){
        victim.setHealth(0);
        attacker.setHealth(attacker.getHealth()/2);
    }
    public static void meditate(Samurai me){
        me.setHealth(me.getHealth()/2 + me.getHealth());
    }
    public int howMany(){
        return numSamurai;
    }
}