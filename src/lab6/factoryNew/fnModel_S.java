package lab6.factoryNew;
import lab6.Model_S;
import lab6.Model_S_I;


public class fnModel_S  extends Model_S implements Model_S_I {

    public fnModel_S(String color, int mileage, int batteryLifeTime, int chargingTime, int maxSpeed){
        super(color,mileage,batteryLifeTime,chargingTime,maxSpeed);


    }
    @Override
    public String getDescription() {
        return "This factory new car is "+ getNameOfBrand()+" model S.This is an electric car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the electric engine, the duration of which is "+getBatteryLifeTime()+" hours and charging time is "+
                getChargingTime()+" hour this car have a "+getMileage()+" km mileage";
    }
}
