package lab3;

public abstract class Gasoline extends Car {
    private int engineCapacity;
    private int numberOfCylinders;

    public Gasoline(){
        super();
    }

    public Gasoline(String color, int mileage, int engineCapacity, int numberOfCylinders) {
        super(color, mileage);
        this.engineCapacity = engineCapacity;
        this.numberOfCylinders = numberOfCylinders;

    }

    public abstract String getDescription();


    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}