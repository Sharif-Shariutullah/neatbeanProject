package javaapplication6;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        System.out.println("To get Factorial number Enter a number");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int fact = 1;
        
        for (int i = n; i>= 1; i--) {
            
            int res = fact * i;
            
            System.out.println("result" + res);
        }
        
        
        
        
        
//        System.out.println("Factorial of " + n + " is " + factorial(n));

    }

    
    
    
    
//    public static long factorial(int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
;

}
