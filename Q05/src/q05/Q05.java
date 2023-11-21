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
public class Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating instances of Manager and Programmer
        Manager manager = new Manager("John Manager", 101, 50000, 10000);
        Programmer programmer = new Programmer("Alice Programmer", 102, 30, 160);

        // Displaying information for Manager and Programmer
        manager.displayInfo();
        System.out.println(); // Adding a blank line for better readability
        programmer.displayInfo();
    }

}
