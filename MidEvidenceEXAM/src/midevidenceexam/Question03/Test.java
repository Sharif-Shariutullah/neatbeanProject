package midevidenceexam.Question03;

public class Test {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(60, 3000, "Red");
        vehicle.toString();
        System.out.println("Vehicle Sale Price: " + vehicle.getSalePrice());

        Vehicle vehicle2 = new Vehicle(60, 8000, "Red");
        vehicle2.toString();
        System.out.println("Truck Sale Price: " + vehicle2.getSalePrice());
//        System.out.println("Truck Discounted Price: " + (vehicle2.getSalePrice() - vehicle2.regularPrice));

        
        
        Truck tr = new Truck(60, 3000, "Red");
        System.out.println("Truck Discounted Price: " + (tr.getSalePrice() - tr.regularPrice));

    }
}
