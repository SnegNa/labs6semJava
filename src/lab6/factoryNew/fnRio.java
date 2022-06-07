package lab6.factoryNew;

import lab6.Rio;
import lab6.Rio_I;

public class fnRio extends Rio implements Rio_I {

    public fnRio(String color, int mileage, int engineCapacity, int numberOfCylinders,  int maxSpeed){
        super(color,mileage,engineCapacity,numberOfCylinders,maxSpeed);


    }
    @Override
    public String getDescription() {
        return "This factory new  car is "+ getNameOfBrand()+" rio .This is an gasoline car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the gasoline engine, the volume of which is "+getEngineCapacity()+" liters and number of cylinders is equal to "+
                getNumberOfCylinders()+"  this car have a "+getMileage()+" km mileage";
    }

}
