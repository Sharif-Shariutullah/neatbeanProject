/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evedenceexam;

/**
 *
 * @author B-5
 */
import java.util.*;

public class EvedenceExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// Prime Number
        System.out.println("Enput a Number----");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 2; i <= a; i++) {
            if (i == a) {
                System.out.println(a + " is a prime number");
            } 
            else {
                if (a % i == 0) {
                    System.out.println(a + " is not a prime number");
                    break;
                }
            }
        }
//array summation 
//int[] array = {2, 4, 6, 8, 10};
//        int sum = 0;
//
//        System.out.print("The array : " + Arrays.toString(array));
//
//        for (int n : array) {
//            sum += n;
//        }
//        System.out.println("\n Sum: " + sum);
//Array Ascending
//  int[] arr = {5, 2, 8, 1, 9};
//        
//        Arrays.sort(arr);
//
//        System.out.println("Ascending order: " + Arrays.toString(arr));
// Array Descending
//     Integer[] arr = {5, 2, 8, 1, 9};
//        
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        System.out.println("Descending order: " + Arrays.toString(arr));}
//Conditional SUM
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//
//        System.out.println("Enter numbers to calculate the conditional sum: ");
//
//        while (true) {
//            int input = scanner.nextInt();
//
//            if (input == 0) {
//                break;
//            }
//
//            sum += input;
//        }
//
//        System.out.println("Conditional sum: " + sum);



//Factorial number
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer number: ");
//        int num = input.nextInt();
//        int fact = 1;
//        String val = "";
//        
//        for (int i = num; i >= 1; i--) {
//          
//            fact = fact * i;
//val = val + i + " , ";
//        }      
//        
//        System.out.println("Factorial number " + val);
//
//        System.out.println("Factorial of " + num + " is " + fact);


//fibonacci number

//
//// Create a Scanner
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an index for the Fibonacci number: ");
//        int index = input.nextInt();
//
//// Find and display the Fibonacci number
//        System.out.println(
//                "Fibonacci number at index " + index + " is " + fib(index));
//    };
//
//    /**
//     * The method for finding the Fibonacci number
//     */
//    public static long fib(long n) {
//        long f0 = 0; // For fib(0)
//        long f1 = 1; // For fib(1)
//        long f2 = 1; // For fib(2)
//
//        if (n == 0) {
//            return f0;
//            
//        } else if (n == 1) {
//            return f1;
//            
//        } else if (n == 2) {
//            return f2;
//        }
//
//        for (int i = 3; i <= n; i++) {
//            f0 = f1;
//            f1 = f2;
//            f2 = f0 + f1;
//        }
//
//        return f2;
    };

    
    
    
    }
