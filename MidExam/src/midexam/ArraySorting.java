
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author B-5
 */
public class ArraySorting {

    public static void main(String[] args) {
        
        Integer[][] arrays = {
            {9, 5, 14, 3}, 
            {8, 4, 19, 10}, 
            {6, 7, 2, 18}};
        System.out.println("Assending arrays: ");
        
        
        for (Integer[] array : arrays) {
            Arrays.sort(array);
            System.out.print("  " + Arrays.toString(array));
            
        }
        
        for (Integer[] val : arrays) {
//            Arrays.sort(val);


            System.out.println(Arrays.toString(val));
        }
        System.out.println("Dccending arrays: ");
        
        
        for (Integer[] array : arrays) {
            System.out.println("result+++++++++-------+++++"  + Arrays.toString(array));
        }
//        for (Integer[] val : arrays) {
//            Arrays.sort(val, Collections.reverseOrder());
//            System.out.println(Arrays.toString(val));
        }
    }


