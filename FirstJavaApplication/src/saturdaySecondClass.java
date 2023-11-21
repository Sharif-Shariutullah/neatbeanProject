
import firstjavaapplication.FirstJavaApplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-5
 */
public class saturdaySecondClass {

// ----------------------   dynamic sytem from other package/class
   
    
    public static void main(String[] args) {

//------------------static
        FirstJavaApplication.testMethodFirstTime();
        System.out.println(FirstJavaApplication.var55);

//          void
        FirstJavaApplication dt = new FirstJavaApplication();

        System.out.println(dt.var54);
        dt.testMethodFirstTime003(500);
        System.out.println(dt.var14);
         
           

    }

};
