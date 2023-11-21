/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-5
 */
public class Employee {

    public int num = 5;
    public Integer num2 = 5;
    public String abc = "";

    public static int num3 = 5;
    protected static int num4 = 10;
    private static int num5 = 20;
    static int num6 = 30;

      
}


//    there are 8 types of "Primitive" Data type
    
  class PrimitiveDataTypes {
    public static void main(String[] args) {
        
    
        
        PrimitiveDataTypes.hello();
        
        
    }
    
    public static void hello() {
       byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 9223372036854775807L;
        float myFloat = 3.14f;
        double myDouble = 3.14159265359;
        char myChar = 'A';
        boolean myBoolean = true;

        
        
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);};
    
};

  