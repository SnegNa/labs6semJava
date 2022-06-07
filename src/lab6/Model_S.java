package lab6;

public class Model_S  extends Electric {
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




    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
