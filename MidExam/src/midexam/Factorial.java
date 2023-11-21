/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

import java.util.Scanner;

/**
 *
 * @author B-5
 */
public class Factorial {

    public static void main(String[] args) {

//        Factorial value of 5
        int n = 5;

        // Display factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

//The method 
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
}
