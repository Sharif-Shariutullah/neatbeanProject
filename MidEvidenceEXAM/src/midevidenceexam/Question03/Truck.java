package midevidenceexam.Question03;

public class Truck extends Vehicle {

    int weight;

    public Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;

    }

    @Override
    public double getSalePrice() {

        if (weight > 2000) {
            return regularPrice * 0.90; // 10% discount

        } else {
            return regularPrice; // No discount
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + ", color=" + color + '}';
    }

}
