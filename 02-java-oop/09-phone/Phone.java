public abstract class Phone {
    //attributes
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    //constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    //abstract method to be constructed by subclasses
    public abstract void displayInfo();

    //getters and setters
    public String getVersionNumber(){
        return versionNumber;
    }
    public int getBatteryPercentage(){
        return batteryPercentage;
    }
    public String getCarrier(){
        return carrier;
    }
    public String getRingTone(){
        return ringTone;
    }
    public void setVersionNumber(String versionNumber){
        this.versionNumber = versionNumber;
    }
    public void setBatteryPercentage(int batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setRingTone(String ringTone){
        this.ringTone = ringTone;
    }
}