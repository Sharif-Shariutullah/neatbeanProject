package classpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ClassPractice {

    public static void main(String[] args) {

//        int arr[][] = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9},
//            {10, 11, 12}
//        };
//       arrays summation
//        int total = 0;
//        for (int row = 0; row < arr.length; row++) 
//        {
//            for (int column = 0; column < arr[row].length; column++) {
//                total += arr[row][column];
//            }
//        }
//
//        System.out.println("Array Print" + total);
//Initializing arrays with input values
//        int[][] matrix = new int[3][3];
//
//        java.util.Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter " + matrix.length + " rows and "
//                + matrix[0].length + " columns: ");
//        
//        
//        for (int row = 0; row < matrix.length; row++) {
//           
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//            System.out.println("Printing---" + Arrays.deepToString(matrix));
//            Initializing arrays with random values
//        int[][] matrix = new int[3][3];
//
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }
//
//        System.out.println("Printing---" + Arrays.deepToString(matrix));
//        Printing arrays
//                int[][] matrix = new int[3][3];
//
//        
//        for (int row = 0; row < matrix.length; row++) {
//for (int column = 0; column < matrix[row].length; column++) {
//System.out.print(matrix[row][column] + " ");
//}
//System.out.println();
//}
        int[][] m = getArray(); // Get an array

        // Display sum of elements
             System.out.println("Printing---" + Arrays.deepToString(m));

//        System.out.println("\nSum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
      
        int[][] m = new int[3][4];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[i].length; j++) 
            {
                m[i][j] = input.nextInt();
            }
        }
    
    return m;
    }
}
