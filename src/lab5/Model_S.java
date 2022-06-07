package lab5;

public class Model_S  extends Electric implements ElectricI {
    public String getNameOfBrand() {
        return nameOfBrand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private String nameOfBrand = "Tesla";
    private int maxSpeed;



    public Model_S(String color, int mileage, int batteryLifeTime, int chargingTime, int maxSpeed){
        super(color,mileage,batteryLifeTime,chargingTime);

        this.maxSpeed = maxSpeed;
    }
    public String getDescriptionElectric() {
        return "This car is "+ getNameOfBrand()+" model S.This is an electric car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the electric engine, the duration of which is "+getBatteryLifeTime()+" hours and charging time is "+
                getChargingTime()+" hour this car have a "+getMileage()+" km mileage.";
    }



    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
