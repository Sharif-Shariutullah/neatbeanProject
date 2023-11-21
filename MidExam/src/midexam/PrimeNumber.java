package midexam;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        
                System.out.println("To get Prime Number");

       
        System.out.println("Enter a number-----");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 2; i <= 10; i++) {

            if (i == num) {
                System.out.println(num + "  is a prime number");

            } else {
                if (num % i == 0) {
                    System.out.println(num + "  is a not prime number");
                    break;
                }

            }
        }
    }
}
