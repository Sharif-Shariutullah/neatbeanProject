
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author B-5
 */
public class importWithAverage {

//    ComputeAverage
    public static void main(String[] args) {
        // Create a Scanner object

        Scanner input = new Scanner(System.in);
        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3) / 3;

// Display results
        System.out.println("The average of " + Math.round(number1) + " " + Math.round(number2) + " " + Math.round(number3) + " is " + average);
        System.out.println("The Result is " + String.format("%.2f", average));

    }
    ;
    
//    if else operation 
    int i = 2;
    int a = 3;

    
//    do while loop
    
        do{
            System.out.println("Printed " + i);
        i++;
    }
    while (i <= 10);
    
    
//    while loop
    
    while (a

    
        <= 10){
            System.out.println("---------" + a);
        a++
    }
;

}
