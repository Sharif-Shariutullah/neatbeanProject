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
// Subclass Manager extending Employee
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor
    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementation of calculateSalary for Manager
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Implementation of displayInfo for Manager
    @Override
    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: $" + calculateSalary());
    }
}
