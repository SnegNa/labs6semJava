package lab6.factoryNew;

import lab6.Polo;
import lab6.Polo_I;

public class fnPolo extends Polo implements Polo_I {
    public fnPolo(String color, int mileage, int engineCapacity, int numberOfCylinders,  int maxSpeed){
        super(color,mileage,engineCapacity,numberOfCylinders,maxSpeed);


    }
    @Override
    public String getDescription() {
        return "This factory new  car is "+ getNameOfBrand()+" polo .This is an gasoline car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the gasoline engine, the volume of which is "+getEngineCapacity()+" liters and number of cylinders is equal to "+
                getNumberOfCylinders()+"  this car have a "+getMileage()+" km mileage";
    }

}
