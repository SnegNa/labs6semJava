package lab1;

public class Polo extends  Gasoline{
    public String getNameOfBrand() {
        return nameOfBrand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private String nameOfBrand = "Volkswagen";
    private int maxSpeed;

    public Polo(String color, int mileage, int engineCapacity, int numberOfCylinders,  int maxSpeed){
        super(color,mileage,engineCapacity,numberOfCylinders);

        this.maxSpeed = maxSpeed;
    }
    public String getDescription() {
        return "This car is "+ getNameOfBrand()+" polo .This is an gasoline car that develops speeds up to "+getMaxSpeed()+" km per hour"+
                ". Car color is "+getColor()+".Thanks to the gasoline engine, the volume of which is "+getEngineCapacity()+" liters and number of cylinders is equal to "+
                getNumberOfCylinders()+"  this car have a "+getMileage()+" km mileage";
    }




    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
