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
public class HighLow {
     public static void main(String[] args) {
    
   HighLow.loop();
}
      public static void loop(){
       System.out.println("How long value do you need?");
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();

        int a[] = new int[length];

        int high = 0;
        int low = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value");

            a[i] = scan.nextInt();

            if (i == 0) {
                high = a[i];
                low = a[i];
            } else if (a[i] > high) {
                high = a[i];
            } else if (a[i] < low) {
                low = a[i];
            } else {
                continue;
            }
        }
        System.out.println("Highest number is: " + high);
        System.out.println("Lowest number is: " + low);
      };
     
}
