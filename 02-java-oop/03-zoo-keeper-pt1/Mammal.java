public class Mammal {
    //attributes
    public int energyLevel;

    //constructors
    public Mammal() {}

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    //setters
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    //getters
    public int getEnergyLevel() {
        return this.energyLevel;
    }

    //methods
    public static int displayEnergy(Mammal mam) {
        System.out.println("Current energy level: " + mam.energyLevel);
        return mam.energyLevel;
    }
}
