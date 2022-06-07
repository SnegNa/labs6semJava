package lab6.factoryNew;

import lab6.Vision;
import lab6.Vision_I;

public class fnVision extends Vision implements Vision_I {
    public fnVision(String color, int mileage, int batteryLifeTime, int chargingTime,  int maxSpeed){
        super(color,mileage,batteryLifeTime,chargingTime,maxSpeed);


    }
    @Override
    public String getDescription() {
        return "This factory new  car is "+ getNameOfBrand()+" vision eqs .This is an electric car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the electric engine, the duration of which is "+getBatteryLifeTime()+" hours and charging time is "+
                getChargingTime()+" hours this car have a "+getMileage()+" km mileage";
    }
}
