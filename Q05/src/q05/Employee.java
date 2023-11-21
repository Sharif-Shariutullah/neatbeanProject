/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q05;

/**
 *
 * @author B-5
 */
abstract class Employee {

    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary (to be implemented by subclasses)
    public abstract double calculateSalary();

    // Abstract method to display information (to be implemented by subclasses)
    public abstract void displayInfo();

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
