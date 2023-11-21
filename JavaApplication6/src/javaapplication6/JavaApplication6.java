package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {

        // prime number 
        System.out.println("To get prime number");
        System.out.println("Enter Pirme number");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 2; i <= 10; i++) {

//            if (i == num) {
//                System.out.println(num + "is a prime number");
//            } else {
//                if (num % i == 0) {
//                    System.out.println(num + " is not a prime number");
//                    break;
//                }


//--------------------------------------------------------------------------


            if (num / i == 2) {
                System.out.println(num + "  is a prime number");
                break;
            } else {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    break;
                }
            }
        }

    }

}
