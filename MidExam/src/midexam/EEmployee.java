/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author B-5
 */
public class EEmployee {
    
    // Employee class

    private String name;
    private double salary;

    // Constructor
    public EEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // work method
    public void work() {
        System.out.println("Employee is working.");
    }

    // getSalary method
    public double getSalary() {
        return salary;
    }
}





    
    
    

