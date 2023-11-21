/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapplication;

import java.util.Scanner;

/**
 *
 * @author B-5
 */
public class FirstJavaApplication {

    /**
     * @param args the command line arguments
     */
    
         public  static Integer var55 = 505;

    
//    method call in main method
    public static void testMethodFirstTime() {
        Integer var55 = 505;
        System.out.println(var55);
    }; 

//    second method 
     public Integer var54 = 1024;
    
      public void testMethodFirstTime002() {

          System.out.println(var54);
    } ; 
    
      
      
      //        dynamic method
      
    public Integer var14 = 3146;
    
    public void testMethodFirstTime003(Integer num) {

          this.var14= num;
    } ; 
      
      
      
//      public Integer radious = 105;     
//      public Integer pi = 3.14159;

    
    public void area() {

           ;
    } ; 
        
      
      
      
      
    public static void main(String[] args) {

//------------------static
   testMethodFirstTime();
   
   
//          void
        FirstJavaApplication obj = new FirstJavaApplication();
        obj.testMethodFirstTime002();

//        dynamic method
        


        
        
// TODO code application logic here
        System.out.println("Hello Sharif!!!");
        System.out.println("Hello Salam!!!");
        System.out.println("Hello Sharif!!!");
        System.out.println("abul hasant");
        System.out.println("Salahuddin");

        
        
        
        
//                System.out.println("radious");    
//         System.out.println (105*2) * 3.14159;











//input from console 

Scanner input = new Scanner(System.in);
double r = input.nextDouble();
FirstJavaApplication.areaCal(r);
        
    }

    
    
    public static void areaCal(double r ){
 double area;
area = r * r * 3.14159;
System.out.println("Area ----" + area);

}

};







