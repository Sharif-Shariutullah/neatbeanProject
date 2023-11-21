/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author B-5
 */
public class GenericsExample {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "orange", "banana"};

        // Using the generic method to print arrays
        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(strArray);
    }
}
