package lab5;

public abstract class Car {
    private String color;
    private int mileage;



    public Car (String color, int mileage){
        this.color = color;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}
