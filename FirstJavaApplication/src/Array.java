/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-5
 */
public class Array {

//    public static void myM(int[] xyz) {
//
//        for (int i = 0; i < xyz.length; i++) {
////            System.out.println("Even Number is---" + xyz[i]);
//            if (xyz[i] % 2 != 0) {
//                System.out.println("odd Number is ---" + xyz[i]);
//            } else {
//                System.out.println("Even Number is ---" + xyz[i]);
//            };
//
//        }
//
//    }
//
//    ;
    public static void main(String[] args) {

//        int[] ar = {100, 700, 105, 112, 203, 80};
//        Array.myM(ar);
//
////Array using lenght by method
//        Array.arrayLenghth();
//
//        System.out.println("_______________");
//
//// calling array by obj
//        Array step2 = new Array();
//        step2.arrayAssign();
//
//        System.out.println("_______________");
//        System.out.println("_______________");
//
////        calling array which has Arguments
//        Array step03 = new Array();
//        step03.arrayuPDATE(10001);
//    25.10.23    ---------------------------------------------------------------------------------------------------------------
//     calling method which is input from console log = by users
//Array BookEXM01 = new Array();
//          BookEXM01.InitializingArraysWithInputValues();
        System.out.println("-------------------example 01----------------");

//         exp 02:       Initializing arrays with random values
        double[] myList1 = new double[10];

        for (int i = 0; i < myList1.length; i++) {
            myList1[i] = (int) (Math.random() * 100);
            System.out.println(" exp 02     Number----" + (int) myList1[i]);
        }

                 exp 03:       Displaying arrays:
    int[] myList = new int[5]; 
    myList[0] = 10;
    myList[1] = 11;
    myList[2] = 13;
    myList[3] = 14;
    myList[4] = 15;
    
    for (int i = 0; i < myList.length; i++) {
System.out.print(myList[i] + " ");
}
 exp 05    Finding the smallest element:
double min = myList[0];

for (int i = 1; i < myList.length; i++) {
if (min > myList[i]) {
min = myList[i];};

    System.out.println("Minimum is ---" + min);
}
 exp 05    Finding the largest element:
  double[] myList = new double[5]; 
    myList[0] = 10;
    myList[1] = 11;
    myList[2] = 13;
    myList[3] = 14;
    myList[4] = 15;


double max = myList[0];

for (int i = 1; i < myList.length; i++) {
if (max < myList[i]) {
max = myList[i];};

    System.out.println("Maximum is ---" + max);
    };

//Array using lenght

    
    public static void arrayLenghth() {

        int[] Kacchi = new int[5];
        Kacchi[0] = 100;
        Kacchi[1] = 200;
        Kacchi[4] = 500;

        for (int i = 0; i < Kacchi.length; i++) {
            System.out.println("Kacci " + Kacchi[i]);
        };

    }

    ;

    
        //    Array using Value assign
          public void arrayAssign() {

        int[] Kacchi2 = {2, 12, 20, 100};

        for (int i = 0; i < Kacchi2.length; i++) {
            System.out.println("Kacci02---------- " + Kacchi2[i]);

        }
        ;

    }

    ;

          array update with aruments
//          
       public void arrayuPDATE(int arr) {
        System.out.println("Arry input with Arguments--------" + arr);

    }
    ;
    exp: 01  Initializing arrays with input values
       double[] myList = new double[10];

    public void InitializingArraysWithInputValues() {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();

        }

        System.out.println("Array----");
        for (double i : myList) {
            System.out.println(i + ",");
        };
   
        System.out.println("Min Val----" + MaxMin(myList, "min");
    }
    ;
    
  double[] myList = {10.3, 20.4, 41.41, 00.9, 11.13};

    public static double MaxMin(double[] myList, String val) {

        double output = myList[0];
        if (val.toUpperCase().equals("MIN")) {
            for (int i = 1; i < myList.length; i++) {
                if (output > myList[i]) {
                    output = myList[i];

                    return output;
                }
            }
            
else {
            for (int i = 1; i < myList.length; i++) {
                if (output > myList[i]) {
                    output = myList[i];

                    return output;
                }
            }
        }

        };