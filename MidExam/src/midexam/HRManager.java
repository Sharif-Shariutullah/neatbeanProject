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
// HRManager subclass extending Employee
class HRManager extends EEmployee {
    // Constructor
    public HRManager(String name, double salary) {
        super(name, salary);
    }

    // Override work method
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }

    // New method in HRManager
    public void addEmployee(String newEmployeeName, double newEmployeeSalary) {
        System.out.println("New employee added: " + newEmployeeName);
    }
}
