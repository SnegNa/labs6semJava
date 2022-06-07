package lab3;

public abstract class Electric extends Car {
    private int batteryLifeTime;
    private int chargingTime;

    public Electric(){
        super();
    }

    public Electric(String color, int mileage, int batteryLifeTime, int chargingTime) {
        super(color, mileage);
        this.batteryLifeTime = batteryLifeTime;
        this.chargingTime = chargingTime;


    }

    public abstract String getDescription();


    public int getBatteryLifeTime() {
        return batteryLifeTime;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setBatteryLifeTime(int batteryLifeTime) {
        this.batteryLifeTime = batteryLifeTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }
}
