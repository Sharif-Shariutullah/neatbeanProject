

package midexam;

import java.util.Scanner;


public class HighestandLowestNumber {

    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        // Find the minimum and maximum numbers
        double min = Math.min(Math.min(num1, num2), num3);
        double max = Math.max(Math.max(num1, num2), num3);
        
        System.out.println("The lowest number is: " + min);
        System.out.println("The highest number is: " + max);

        
        
        
    }
}
