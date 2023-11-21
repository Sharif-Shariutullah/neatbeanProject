/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q14;

/**
 *
 * @author B-5
 */
public class interfac {
    
    
    interface Human {
    // Abstract method in the interface
    void exampleMethod();
    
    
    
    
    class Person implements Human {
    // Implementation of the abstract method
    @Override
    public void exampleMethod() {
        System.out.println("Example method implementation in Person class.");
    }
}
}
}
