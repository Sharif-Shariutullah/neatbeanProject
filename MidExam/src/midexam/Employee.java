package midexam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


//Parent class
//package Inheritance;




public class Employee {

    public static void main(String[] args) {
    }

    int id;
    String name;
    double salary;

    void inputInformation(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void dispalyInformation() {

        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
        
        
    }

}
