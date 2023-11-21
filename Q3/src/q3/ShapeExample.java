/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author B-5
 */
public class ShapeExample {

    public static void main(String[] args) {
        // Create a Shape object (using the placeholder implementation)
        Shape shape = new Shape();
        System.out.println("Area of generic shape: " + shape.getArea());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}
