package lab1;

public class Vision extends Electric {
    public String getNameOfBrand() {
        return nameOfBrand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private String nameOfBrand = "Mercedes";
    private int maxSpeed;

    public Vision(String color, int mileage, int batteryLifeTime, int chargingTime,  int maxSpeed){
        super(color,mileage,batteryLifeTime,chargingTime);

        this.maxSpeed = maxSpeed;
    }
    public String getDescription() {
        return "This car is "+ getNameOfBrand()+" vision eqs .This is an electric car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the electric engine, the duration of which is "+getBatteryLifeTime()+" hours and charging time is "+
                getChargingTime()+" hours this car have a "+getMileage()+" km mileage";
    }




    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

