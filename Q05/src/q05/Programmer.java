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
class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary for Programmer
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implementation of displayInfo for Programmer
    @Override
    public void displayInfo() {
        System.out.println("Programmer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: $" + calculateSalary());
    }
}