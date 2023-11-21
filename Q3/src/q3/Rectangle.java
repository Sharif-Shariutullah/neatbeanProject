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

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the getArea() method for Rectangle
    @Override
    public double getArea() {
        // Calculate the area of the rectangle: length * width
        return length * width;
    }
}
