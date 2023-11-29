package midevidenceexam.Question03;

public class Vehicle {

    int speed;
    static double regularPrice;
    String color;

    //constructor
    public Vehicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;

    }
;

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + ", color=" + color + '}';
    }


    
    
    
}
