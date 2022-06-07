package lab6;

public abstract class Electric extends Car {
    private int batteryLifeTime;
    private int chargingTime;


    public Electric(String color, int mileage, int batteryLifeTime, int chargingTime) {
        super(color, mileage);
        this.batteryLifeTime = batteryLifeTime;
        this.chargingTime = chargingTime;


    }




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
